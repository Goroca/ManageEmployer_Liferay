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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Employer service. Represents a row in the &quot;manageEmployer_Employer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.telefonica.model.impl.EmployerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.telefonica.model.impl.EmployerImpl}.
 * </p>
 *
 * @author carlos
 * @see Employer
 * @see com.telefonica.model.impl.EmployerImpl
 * @see com.telefonica.model.impl.EmployerModelImpl
 * @generated
 */
public interface EmployerModel extends BaseModel<Employer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a employer model instance should use the {@link Employer} interface instead.
	 */

	/**
	 * Returns the primary key of this employer.
	 *
	 * @return the primary key of this employer
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this employer.
	 *
	 * @param primaryKey the primary key of this employer
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the id employer of this employer.
	 *
	 * @return the id employer of this employer
	 */
	public int getIdEmployer();

	/**
	 * Sets the id employer of this employer.
	 *
	 * @param idEmployer the id employer of this employer
	 */
	public void setIdEmployer(int idEmployer);

	/**
	 * Returns the name employer of this employer.
	 *
	 * @return the name employer of this employer
	 */
	@AutoEscape
	public String getNameEmployer();

	/**
	 * Sets the name employer of this employer.
	 *
	 * @param nameEmployer the name employer of this employer
	 */
	public void setNameEmployer(String nameEmployer);

	/**
	 * Returns the id dept of this employer.
	 *
	 * @return the id dept of this employer
	 */
	public int getIdDept();

	/**
	 * Sets the id dept of this employer.
	 *
	 * @param idDept the id dept of this employer
	 */
	public void setIdDept(int idDept);

	/**
	 * Returns the photo of this employer.
	 *
	 * @return the photo of this employer
	 */
	@AutoEscape
	public String getPhoto();

	/**
	 * Sets the photo of this employer.
	 *
	 * @param photo the photo of this employer
	 */
	public void setPhoto(String photo);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Employer employer);

	public int hashCode();

	public CacheModel<Employer> toCacheModel();

	public Employer toEscapedModel();

	public String toString();

	public String toXmlString();
}