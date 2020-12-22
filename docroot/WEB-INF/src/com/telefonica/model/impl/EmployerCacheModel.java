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

package com.telefonica.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.telefonica.model.Employer;

import java.io.Serializable;

/**
 * The cache model class for representing Employer in entity cache.
 *
 * @author carlos
 * @see Employer
 * @generated
 */
public class EmployerCacheModel implements CacheModel<Employer>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{idEmployer=");
		sb.append(idEmployer);
		sb.append(", nameEmployer=");
		sb.append(nameEmployer);
		sb.append(", idDept=");
		sb.append(idDept);
		sb.append(", photo=");
		sb.append(photo);
		sb.append("}");

		return sb.toString();
	}

	public Employer toEntityModel() {
		EmployerImpl employerImpl = new EmployerImpl();

		employerImpl.setIdEmployer(idEmployer);

		if (nameEmployer == null) {
			employerImpl.setNameEmployer(StringPool.BLANK);
		}
		else {
			employerImpl.setNameEmployer(nameEmployer);
		}

		employerImpl.setIdDept(idDept);

		if (photo == null) {
			employerImpl.setPhoto(StringPool.BLANK);
		}
		else {
			employerImpl.setPhoto(photo);
		}

		employerImpl.resetOriginalValues();

		return employerImpl;
	}

	public int idEmployer;
	public String nameEmployer;
	public int idDept;
	public String photo;
}