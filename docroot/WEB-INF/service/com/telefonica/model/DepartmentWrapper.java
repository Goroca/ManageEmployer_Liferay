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
 * This class is a wrapper for {@link Department}.
 * </p>
 *
 * @author    carlos
 * @see       Department
 * @generated
 */
public class DepartmentWrapper implements Department, ModelWrapper<Department> {
	public DepartmentWrapper(Department department) {
		_department = department;
	}

	public Class<?> getModelClass() {
		return Department.class;
	}

	public String getModelClassName() {
		return Department.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idDept", getIdDept());
		attributes.put("nameDept", getNameDept());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer idDept = (Integer)attributes.get("idDept");

		if (idDept != null) {
			setIdDept(idDept);
		}

		String nameDept = (String)attributes.get("nameDept");

		if (nameDept != null) {
			setNameDept(nameDept);
		}
	}

	/**
	* Returns the primary key of this department.
	*
	* @return the primary key of this department
	*/
	public int getPrimaryKey() {
		return _department.getPrimaryKey();
	}

	/**
	* Sets the primary key of this department.
	*
	* @param primaryKey the primary key of this department
	*/
	public void setPrimaryKey(int primaryKey) {
		_department.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the id dept of this department.
	*
	* @return the id dept of this department
	*/
	public int getIdDept() {
		return _department.getIdDept();
	}

	/**
	* Sets the id dept of this department.
	*
	* @param idDept the id dept of this department
	*/
	public void setIdDept(int idDept) {
		_department.setIdDept(idDept);
	}

	/**
	* Returns the name dept of this department.
	*
	* @return the name dept of this department
	*/
	public java.lang.String getNameDept() {
		return _department.getNameDept();
	}

	/**
	* Sets the name dept of this department.
	*
	* @param nameDept the name dept of this department
	*/
	public void setNameDept(java.lang.String nameDept) {
		_department.setNameDept(nameDept);
	}

	public boolean isNew() {
		return _department.isNew();
	}

	public void setNew(boolean n) {
		_department.setNew(n);
	}

	public boolean isCachedModel() {
		return _department.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_department.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _department.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _department.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_department.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _department.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_department.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DepartmentWrapper((Department)_department.clone());
	}

	public int compareTo(com.telefonica.model.Department department) {
		return _department.compareTo(department);
	}

	@Override
	public int hashCode() {
		return _department.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.telefonica.model.Department> toCacheModel() {
		return _department.toCacheModel();
	}

	public com.telefonica.model.Department toEscapedModel() {
		return new DepartmentWrapper(_department.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _department.toString();
	}

	public java.lang.String toXmlString() {
		return _department.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_department.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Department getWrappedDepartment() {
		return _department;
	}

	public Department getWrappedModel() {
		return _department;
	}

	public void resetOriginalValues() {
		_department.resetOriginalValues();
	}

	private Department _department;
}