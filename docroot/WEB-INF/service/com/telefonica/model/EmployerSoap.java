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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.telefonica.service.http.EmployerServiceSoap}.
 *
 * @author    carlos
 * @see       com.telefonica.service.http.EmployerServiceSoap
 * @generated
 */
public class EmployerSoap implements Serializable {
	public static EmployerSoap toSoapModel(Employer model) {
		EmployerSoap soapModel = new EmployerSoap();

		soapModel.setIdEmployer(model.getIdEmployer());
		soapModel.setNameEmployer(model.getNameEmployer());
		soapModel.setIdDept(model.getIdDept());
		soapModel.setPhoto(model.getPhoto());

		return soapModel;
	}

	public static EmployerSoap[] toSoapModels(Employer[] models) {
		EmployerSoap[] soapModels = new EmployerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployerSoap[][] toSoapModels(Employer[][] models) {
		EmployerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployerSoap[] toSoapModels(List<Employer> models) {
		List<EmployerSoap> soapModels = new ArrayList<EmployerSoap>(models.size());

		for (Employer model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployerSoap[soapModels.size()]);
	}

	public EmployerSoap() {
	}

	public int getPrimaryKey() {
		return _idEmployer;
	}

	public void setPrimaryKey(int pk) {
		setIdEmployer(pk);
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

	private int _idEmployer;
	private String _nameEmployer;
	private int _idDept;
	private String _photo;
}