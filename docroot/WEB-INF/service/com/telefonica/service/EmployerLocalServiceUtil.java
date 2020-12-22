/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.telefonica.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the employer local service. This utility wraps {@link com.telefonica.service.impl.EmployerLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author carlos
 * @see EmployerLocalService
 * @see com.telefonica.service.base.EmployerLocalServiceBaseImpl
 * @see com.telefonica.service.impl.EmployerLocalServiceImpl
 * @generated
 */
public class EmployerLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.telefonica.service.impl.EmployerLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the employer to the database. Also notifies the appropriate model listeners.
	*
	* @param employer the employer
	* @return the employer that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.telefonica.model.Employer addEmployer(
		com.telefonica.model.Employer employer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEmployer(employer);
	}

	/**
	* Creates a new employer with the primary key. Does not add the employer to the database.
	*
	* @param idEmployer the primary key for the new employer
	* @return the new employer
	*/
	public static com.telefonica.model.Employer createEmployer(int idEmployer) {
		return getService().createEmployer(idEmployer);
	}

	/**
	* Deletes the employer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idEmployer the primary key of the employer
	* @return the employer that was removed
	* @throws PortalException if a employer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.telefonica.model.Employer deleteEmployer(int idEmployer)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployer(idEmployer);
	}

	/**
	* Deletes the employer from the database. Also notifies the appropriate model listeners.
	*
	* @param employer the employer
	* @return the employer that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.telefonica.model.Employer deleteEmployer(
		com.telefonica.model.Employer employer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEmployer(employer);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.telefonica.model.Employer fetchEmployer(int idEmployer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEmployer(idEmployer);
	}

	/**
	* Returns the employer with the primary key.
	*
	* @param idEmployer the primary key of the employer
	* @return the employer
	* @throws PortalException if a employer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.telefonica.model.Employer getEmployer(int idEmployer)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployer(idEmployer);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the employers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of employers
	* @param end the upper bound of the range of employers (not inclusive)
	* @return the range of employers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.telefonica.model.Employer> getEmployers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployers(start, end);
	}

	/**
	* Returns the number of employers.
	*
	* @return the number of employers
	* @throws SystemException if a system exception occurred
	*/
	public static int getEmployersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployersCount();
	}

	/**
	* Updates the employer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employer the employer
	* @return the employer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.telefonica.model.Employer updateEmployer(
		com.telefonica.model.Employer employer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEmployer(employer);
	}

	/**
	* Updates the employer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employer the employer
	* @param merge whether to merge the employer with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the employer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.telefonica.model.Employer updateEmployer(
		com.telefonica.model.Employer employer, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEmployer(employer, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static EmployerLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EmployerLocalService.class.getName());

			if (invokableLocalService instanceof EmployerLocalService) {
				_service = (EmployerLocalService)invokableLocalService;
			}
			else {
				_service = new EmployerLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EmployerLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(EmployerLocalService service) {
	}

	private static EmployerLocalService _service;
}