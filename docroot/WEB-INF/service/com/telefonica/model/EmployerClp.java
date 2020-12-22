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

import com.telefonica.service.EmployerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author carlos
 */
public class EmployerClp extends BaseModelImpl<Employer> implements Employer {
	public EmployerClp() {
	}

	public Class<?> getModelClass() {
		return Employer.class;
	}

	public String getModelClassName() {
		return Employer.class.getName();
	}

	public int getPrimaryKey() {
		return _idEmployer;
	}

	public void setPrimaryKey(int primaryKey) {
		setIdEmployer(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_idEmployer);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idEmployer", getIdEmployer());
		attributes.put("nameEmployer", getNameEmployer());
		attributes.put("idDept", getIdDept());
		attributes.put("photo", getPhoto());

		return attributes;
	}

	@Override
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

	public int getIdEmployer() {
		return _idEmployer;
	}

	public void setIdEmployer(int idEmployer) {
		_idEmployer = idEmployer;
	}

	public String getNameEmployer() {
		return _nameEmployer;
	}

	public void setNameEmployer(String nameEmployer) {
		_nameEmployer = nameEmployer;
	}

	public int getIdDept() {
		return _idDept;
	}

	public void setIdDept(int idDept) {
		_idDept = idDept;
	}

	public String getPhoto() {
		return _photo;
	}

	public void setPhoto(String photo) {
		_photo = photo;
	}

	public BaseModel<?> getEmployerRemoteModel() {
		return _employerRemoteModel;
	}

	public void setEmployerRemoteModel(BaseModel<?> employerRemoteModel) {
		_employerRemoteModel = employerRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployerLocalServiceUtil.addEmployer(this);
		}
		else {
			EmployerLocalServiceUtil.updateEmployer(this);
		}
	}

	@Override
	public Employer toEscapedModel() {
		return (Employer)Proxy.newProxyInstance(Employer.class.getClassLoader(),
			new Class[] { Employer.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmployerClp clone = new EmployerClp();

		clone.setIdEmployer(getIdEmployer());
		clone.setNameEmployer(getNameEmployer());
		clone.setIdDept(getIdDept());
		clone.setPhoto(getPhoto());

		return clone;
	}

	public int compareTo(Employer employer) {
		int primaryKey = employer.getPrimaryKey();

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

		EmployerClp employer = null;

		try {
			employer = (EmployerClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = employer.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{idEmployer=");
		sb.append(getIdEmployer());
		sb.append(", nameEmployer=");
		sb.append(getNameEmployer());
		sb.append(", idDept=");
		sb.append(getIdDept());
		sb.append(", photo=");
		sb.append(getPhoto());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.telefonica.model.Employer");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>idEmployer</column-name><column-value><![CDATA[");
		sb.append(getIdEmployer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameEmployer</column-name><column-value><![CDATA[");
		sb.append(getNameEmployer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idDept</column-name><column-value><![CDATA[");
		sb.append(getIdDept());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>photo</column-name><column-value><![CDATA[");
		sb.append(getPhoto());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _idEmployer;
	private String _nameEmployer;
	private int _idDept;
	private String _photo;
	private BaseModel<?> _employerRemoteModel;
}