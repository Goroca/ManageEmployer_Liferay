package com.telefonica;

import java.io.IOException;

import javax.portlet.*;

import com.liferay.portal.kernel.exception.*;
import com.liferay.portal.kernel.util.*;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.telefonica.model.*;
import com.telefonica.model.impl.*;
import com.telefonica.service.EmployerLocalServiceUtil;

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
			PortletException, PortalException {
		
		Employer employer = new EmployerImpl();
		int idEmployer = ParamUtil.getInteger(actionRequest, "idEmployer");
		if (idEmployer > 0)
			employer.setIdEmployer(idEmployer);
		employer.setNameEmployer(ParamUtil.getString(actionRequest, "nameEmployer"));
		employer.setIdDept(ParamUtil.getInteger(actionRequest, "idDept"));
		
		try {
			//EmployerLocalServiceUtil.addEmployer(employer);
			EmployerLocalServiceUtil.updateEmployer(employer);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
