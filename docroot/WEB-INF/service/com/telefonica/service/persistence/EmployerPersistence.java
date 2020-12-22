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

package com.telefonica.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.telefonica.model.Employer;

/**
 * The persistence interface for the employer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author carlos
 * @see EmployerPersistenceImpl
 * @see EmployerUtil
 * @generated
 */
public interface EmployerPersistence extends BasePersistence<Employer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployerUtil} to access the employer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the employer in the entity cache if it is enabled.
	*
	* @param employer the employer
	*/
	public void cacheResult(com.telefonica.model.Employer employer);

	/**
	* Caches the employers in the entity cache if it is enabled.
	*
	* @param employers the employers
	*/
	public void cacheResult(
		java.util.List<com.telefonica.model.Employer> employers);

	/**
	* Creates a new employer with the primary key. Does not add the employer to the database.
	*
	* @param idEmployer the primary key for the new employer
	* @return the new employer
	*/
	public com.telefonica.model.Employer create(int idEmployer);

	/**
	* Removes the employer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idEmployer the primary key of the employer
	* @return the employer that was removed
	* @throws com.telefonica.NoSuchEmployerException if a employer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.telefonica.model.Employer remove(int idEmployer)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.telefonica.NoSuchEmployerException;

	public com.telefonica.model.Employer updateImpl(
		com.telefonica.model.Employer employer, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employer with the primary key or throws a {@link com.telefonica.NoSuchEmployerException} if it could not be found.
	*
	* @param idEmployer the primary key of the employer
	* @return the employer
	* @throws com.telefonica.NoSuchEmployerException if a employer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.telefonica.model.Employer findByPrimaryKey(int idEmployer)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.telefonica.NoSuchEmployerException;

	/**
	* Returns the employer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idEmployer the primary key of the employer
	* @return the employer, or <code>null</code> if a employer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.telefonica.model.Employer fetchByPrimaryKey(int idEmployer)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employers.
	*
	* @return the employers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.telefonica.model.Employer> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.telefonica.model.Employer> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of employers
	* @param end the upper bound of the range of employers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.telefonica.model.Employer> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employers.
	*
	* @return the number of employers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}