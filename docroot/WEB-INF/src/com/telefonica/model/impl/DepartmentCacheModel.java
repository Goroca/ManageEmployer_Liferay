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

import com.telefonica.model.Department;

import java.io.Serializable;

/**
 * The cache model class for representing Department in entity cache.
 *
 * @author carlos
 * @see Department
 * @generated
 */
public class DepartmentCacheModel implements CacheModel<Department>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{idDept=");
		sb.append(idDept);
		sb.append(", nameDept=");
		sb.append(nameDept);
		sb.append("}");

		return sb.toString();
	}

	public Department toEntityModel() {
		DepartmentImpl departmentImpl = new DepartmentImpl();

		departmentImpl.setIdDept(idDept);

		if (nameDept == null) {
			departmentImpl.setNameDept(StringPool.BLANK);
		}
		else {
			departmentImpl.setNameDept(nameDept);
		}

		departmentImpl.resetOriginalValues();

		return departmentImpl;
	}

	public int idDept;
	public String nameDept;
}