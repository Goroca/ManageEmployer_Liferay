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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.telefonica.service.DepartmentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author carlos
 */
public class DepartmentClp extends BaseModelImpl<Department>
	implements Department {
	public DepartmentClp() {
	}

	public Class<?> getModelClass() {
		return Department.class;
	}

	public String getModelClassName() {
		return Department.class.getName();
	}

	public int getPrimaryKey() {
		return _idDept;
	}

	public void setPrimaryKey(int primaryKey) {
		setIdDept(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_idDept);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idDept", getIdDept());
		attributes.put("nameDept", getNameDept());

		return attributes;
	}

	@Override
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

	public int getIdDept() {
		return _idDept;
	}

	public void setIdDept(int idDept) {
		_idDept = idDept;
	}

	public String getNameDept() {
		return _nameDept;
	}

	public void setNameDept(String nameDept) {
		_nameDept = nameDept;
	}

	public BaseModel<?> getDepartmentRemoteModel() {
		return _departmentRemoteModel;
	}

	public void setDepartmentRemoteModel(BaseModel<?> departmentRemoteModel) {
		_departmentRemoteModel = departmentRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			DepartmentLocalServiceUtil.addDepartment(this);
		}
		else {
			DepartmentLocalServiceUtil.updateDepartment(this);
		}
	}

	@Override
	public Department toEscapedModel() {
		return (Department)Proxy.newProxyInstance(Department.class.getClassLoader(),
			new Class[] { Department.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DepartmentClp clone = new DepartmentClp();

		clone.setIdDept(getIdDept());
		clone.setNameDept(getNameDept());

		return clone;
	}

	public int compareTo(Department department) {
		int primaryKey = department.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		DepartmentClp department = null;

		try {
			department = (DepartmentClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = department.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{idDept=");
		sb.append(getIdDept());
		sb.append(", nameDept=");
		sb.append(getNameDept());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.telefonica.model.Department");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>idDept</column-name><column-value><![CDATA[");
		sb.append(getIdDept());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameDept</column-name><column-value><![CDATA[");
		sb.append(getNameDept());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _idDept;
	private String _nameDept;
	private BaseModel<?> _departmentRemoteModel;
}