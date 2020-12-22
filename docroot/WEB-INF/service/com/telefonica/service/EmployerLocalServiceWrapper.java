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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link EmployerLocalService}.
 * </p>
 *
 * @author    carlos
 * @see       EmployerLocalService
 * @generated
 */
public class EmployerLocalServiceWrapper implements EmployerLocalService,
	ServiceWrapper<EmployerLocalService> {
	public EmployerLocalServiceWrapper(
		EmployerLocalService employerLocalService) {
		_employerLocalService = employerLocalService;
	}

	/**
	* Adds the employer to the database. Also notifies the appropriate model listeners.
	*
	* @param employer the employer
	* @return the employer that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.telefonica.model.Employer addEmployer(
		com.telefonica.model.Employer employer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employerLocalService.addEmployer(employer);
	}

	/**
	* Creates a new employer with the primary key. Does not add the employer to the database.
	*
	* @param idEmployer the primary key for the new employer
	* @return the new employer
	*/
	public com.telefonica.model.Employer createEmployer(int idEmployer) {
		return _employerLocalService.createEmployer(idEmployer);
	}

	/**
	* Deletes the employer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idEmployer the primary key of the employer
	* @return the employer that was removed
	* @throws PortalException if a employer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.telefonica.model.Employer deleteEmployer(int idEmployer)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employerLocalService.deleteEmployer(idEmployer);
	}

	/**
	* Deletes the employer from the database. Also notifies the appropriate model listeners.
	*
	* @param employer the employer
	* @return the employer that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.telefonica.model.Employer deleteEmployer(
		com.telefonica.model.Employer employer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employerLocalService.deleteEmployer(employer);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _employerLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employerLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _employerLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employerLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.telefonica.model.Employer fetchEmployer(int idEmployer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employerLocalService.fetchEmployer(idEmployer);
	}

	/**
	* Returns the employer with the primary key.
	*
	* @param idEmployer the primary key of the employer
	* @return the employer
	* @throws PortalException if a employer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.telefonica.model.Employer getEmployer(int idEmployer)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employerLocalService.getEmployer(idEmployer);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employerLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.telefonica.model.Employer> getEmployers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employerLocalService.getEmployers(start, end);
	}

	/**
	* Returns the number of employers.
	*
	* @return the number of employers
	* @throws SystemException if a system exception occurred
	*/
	public int getEmployersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employerLocalService.getEmployersCount();
	}

	/**
	* Updates the employer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employer the employer
	* @return the employer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.telefonica.model.Employer updateEmployer(
		com.telefonica.model.Employer employer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employerLocalService.updateEmployer(employer);
	}

	/**
	* Updates the employer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employer the employer
	* @param merge whether to merge the employer with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the employer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.telefonica.model.Employer updateEmployer(
		com.telefonica.model.Employer employer, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employerLocalService.updateEmployer(employer, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _employerLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_employerLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _employerLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public EmployerLocalService getWrappedEmployerLocalService() {
		return _employerLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedEmployerLocalService(
		EmployerLocalService employerLocalService) {
		_employerLocalService = employerLocalService;
	}

	public EmployerLocalService getWrappedService() {
		return _employerLocalService;
	}

	public void setWrappedService(EmployerLocalService employerLocalService) {
		_employerLocalService = employerLocalService;
	}

	private EmployerLocalService _employerLocalService;
}