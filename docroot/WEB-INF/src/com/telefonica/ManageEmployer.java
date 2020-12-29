package com.telefonica;

import java.io.*;
import java.util.*;

import javax.portlet.*;

import com.liferay.portal.kernel.exception.*;
import com.liferay.portal.kernel.repository.model.*;
import com.liferay.portal.kernel.upload.*;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.*;
import com.liferay.portal.theme.*;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.*;
import com.liferay.portlet.documentlibrary.model.*;
import com.liferay.portlet.documentlibrary.service.*;
import com.liferay.portlet.documentlibrary.util.DLUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.util.portlet.PortletProps;
import com.telefonica.model.*;
import com.telefonica.model.impl.*;
import com.telefonica.service.*;

/**
 * Portlet implementation class ManageEmployer
 */
public class ManageEmployer extends MVCPortlet {

	/*
	 * @Override public void doView(RenderRequest renderRequest, RenderResponse
	 * renderResponse) throws IOException, PortletException { // TODO
	 * Auto-generated method stub Employer employer = new EmployerImpl();
	 * employer.setDept("RRHH"); employer.setName("carlos");
	 * employer.setPhoneNumber("12345"); try {
	 * EmployerLocalServiceUtil.addEmployer(employer); } catch (SystemException
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * super.doView(renderRequest, renderResponse); }
	 */
	private static String ROOT_FOLDER_NAME = PortletProps
			.get("fileupload.folder.name");
	private static String ROOT_FOLDER_DESCRIPTION = PortletProps
			.get("fileupload.folder.description");
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;

	public void deleteEmployer(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException,
			PortletException, PortalException {

		int idEmployer = ParamUtil.getInteger(actionRequest, "idEmployer");

		try {
			EmployerLocalServiceUtil.deleteEmployer(idEmployer);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addEmployer(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException,
			PortletException, PortalException, SystemException {

		// Al tratarse de multipart, tenemos que usar UploadPortletRequest en
		// lugar de request:
		UploadPortletRequest uploadRequest = PortalUtil
				.getUploadPortletRequest(actionRequest);
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest
				.getAttribute(WebKeys.THEME_DISPLAY);

		int idEmployer = ParamUtil.getInteger(uploadRequest, "idEmployer");
		String nameEmployer = ParamUtil
				.getString(uploadRequest, "nameEmployer");
		int idDept = ParamUtil.getInteger(uploadRequest, "idDept");

		Employer employer = new EmployerImpl();
		if (idEmployer > 0)
			employer.setIdEmployer(idEmployer);
		employer.setNameEmployer(nameEmployer);
		employer.setIdDept(idDept);

		String personalURL = uploadDocument(actionRequest, actionResponse, uploadRequest,
				themeDisplay);
		
		employer.setPhoto(personalURL);

		try {
			// EmployerLocalServiceUtil.addEmployer(employer);
			EmployerLocalServiceUtil.updateEmployer(employer);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public String uploadDocument(ActionRequest actionRequest,
			ActionResponse actionResponse,
			UploadPortletRequest uploadPortletRequest, ThemeDisplay themeDisplay)
			throws IOException, PortletException, PortalException,
			SystemException {


		String fileName = uploadPortletRequest.getFileName("photo");
		File file = uploadPortletRequest.getFile("photo");
		String mimeType = MimeTypesUtil.getContentType(file);
		String title = "photo_"
				+ ParamUtil.getString(uploadPortletRequest, "idEmployer");

		String description = "This file is added via programatically";
		long repositoryId = themeDisplay.getScopeGroupId();
		Folder folder = getFolder(actionRequest, themeDisplay);
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				DLFileEntry.class.getName(), actionRequest);
		try {
			InputStream is = new FileInputStream(file);
			DLAppServiceUtil.addFileEntry(repositoryId, folder.getFolderId(),
					fileName, mimeType, title, description, "", is,
					file.getTotalSpace(), serviceContext);

		} catch (DuplicateFileException exp) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(
					repositoryId, folder.getFolderId(), fileName);
			DLAppLocalServiceUtil.deleteFileEntry(fileEntry.getFileEntryId());
			DLAppLocalServiceUtil.addFileEntry(themeDisplay.getDefaultUserId(),
					repositoryId, folder.getFolderId(), fileName, mimeType,
					fileName, fileName, fileName, file, serviceContext);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		String personalURL = "/documents/" + themeDisplay.getScopeGroupId() + "/" + folder.getFolderId() +  "/" + title ;
		return personalURL;
	}

	public Folder getFolder(ActionRequest actionRequest,
			ThemeDisplay themeDisplay) throws PortalException, SystemException {

		long repositoryId = themeDisplay.getScopeGroupId();
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				DLFolder.class.getName(), actionRequest);
		Folder folder = null;
		try {
			folder = DLAppLocalServiceUtil.getFolder(repositoryId,
					PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
		} catch (NoSuchFolderException exp) {
			folder = DLAppLocalServiceUtil.addFolder(
					themeDisplay.getDefaultUserId(), repositoryId,
					PARENT_FOLDER_ID, ROOT_FOLDER_NAME, "Employer photos",
					serviceContext);
		}

		return folder;
	}

	public boolean isFolderExist(ThemeDisplay themeDisplay) {
		boolean folderExist = false;
		try {
			DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
			folderExist = true;
			System.out.println("Folder is already Exist");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return folderExist;
	}

}
