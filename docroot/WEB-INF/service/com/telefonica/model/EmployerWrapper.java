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

package com.telefonica.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employer}.
 * </p>
 *
 * @author    carlos
 * @see       Employer
 * @generated
 */
public class EmployerWrapper implements Employer, ModelWrapper<Employer> {
	public EmployerWrapper(Employer employer) {
		_employer = employer;
	}

	public Class<?> getModelClass() {
		return Employer.class;
	}

	public String getModelClassName() {
		return Employer.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idEmployer", getIdEmployer());
		attributes.put("nameEmployer", getNameEmployer());
		attributes.put("idDept", getIdDept());
		attributes.put("photo", getPhoto());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer idEmployer = (Integer)attributes.get("idEmployer");

		if (idEmployer != null) {
			setIdEmployer(idEmployer);
		}

		String nameEmployer = (String)attributes.get("nameEmployer");

		if (nameEmployer != null) {
			setNameEmployer(nameEmployer);
		}

		Integer idDept = (Integer)attributes.get("idDept");

		if (idDept != null) {
			setIdDept(idDept);
		}

		String photo = (String)attributes.get("photo");

		if (photo != null) {
			setPhoto(photo);
		}
	}

	/**
	* Returns the primary key of this employer.
	*
	* @return the primary key of this employer
	*/
	public int getPrimaryKey() {
		return _employer.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employer.
	*
	* @param primaryKey the primary key of this employer
	*/
	public void setPrimaryKey(int primaryKey) {
		_employer.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the id employer of this employer.
	*
	* @return the id employer of this employer
	*/
	public int getIdEmployer() {
		return _employer.getIdEmployer();
	}

	/**
	* Sets the id employer of this employer.
	*
	* @param idEmployer the id employer of this employer
	*/
	public void setIdEmployer(int idEmployer) {
		_employer.setIdEmployer(idEmployer);
	}

	/**
	* Returns the name employer of this employer.
	*
	* @return the name employer of this employer
	*/
	public java.lang.String getNameEmployer() {
		return _employer.getNameEmployer();
	}

	/**
	* Sets the name employer of this employer.
	*
	* @param nameEmployer the name employer of this employer
	*/
	public void setNameEmployer(java.lang.String nameEmployer) {
		_employer.setNameEmployer(nameEmployer);
	}

	/**
	* Returns the id dept of this employer.
	*
	* @return the id dept of this employer
	*/
	public int getIdDept() {
		return _employer.getIdDept();
	}

	/**
	* Sets the id dept of this employer.
	*
	* @param idDept the id dept of this employer
	*/
	public void setIdDept(int idDept) {
		_employer.setIdDept(idDept);
	}

	/**
	* Returns the photo of this employer.
	*
	* @return the photo of this employer
	*/
	public java.lang.String getPhoto() {
		return _employer.getPhoto();
	}

	/**
	* Sets the photo of this employer.
	*
	* @param photo the photo of this employer
	*/
	public void setPhoto(java.lang.String photo) {
		_employer.setPhoto(photo);
	}

	public boolean isNew() {
		return _employer.isNew();
	}

	public void setNew(boolean n) {
		_employer.setNew(n);
	}

	public boolean isCachedModel() {
		return _employer.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_employer.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _employer.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _employer.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employer.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employer.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employer.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployerWrapper((Employer)_employer.clone());
	}

	public int compareTo(com.telefonica.model.Employer employer) {
		return _employer.compareTo(employer);
	}

	@Override
	public int hashCode() {
		return _employer.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.telefonica.model.Employer> toCacheModel() {
		return _employer.toCacheModel();
	}

	public com.telefonica.model.Employer toEscapedModel() {
		return new EmployerWrapper(_employer.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employer.toString();
	}

	public java.lang.String toXmlString() {
		return _employer.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employer.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Employer getWrappedEmployer() {
		return _employer;
	}

	public Employer getWrappedModel() {
		return _employer;
	}

	public void resetOriginalValues() {
		_employer.resetOriginalValues();
	}

	private Employer _employer;
}