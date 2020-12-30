<%
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
%>

<%@ include file="init.jsp" %>


This is the <b>Manage Employer</b> portlet VIEW.

<% 
String currentURL = PortalUtil.getCurrentURL(renderRequest);
List<Employer> list = EmployerLocalServiceUtil.getEmployers(0, EmployerLocalServiceUtil.getEmployersCount()); 
List<Department> departments = DepartmentLocalServiceUtil.getDepartments(0, DepartmentLocalServiceUtil.getDepartmentsCount());
%>

<liferay-ui:search-container delta="10" deltaConfigurable="true">
	<liferay-ui:search-container-results
		results="<%= EmployerLocalServiceUtil.getEmployers(searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= EmployerLocalServiceUtil.getEmployersCount() %>"
	/>

	<liferay-ui:search-container-row className="com.telefonica.model.Employer" modelVar="aEmployer"	>
	
		<portlet:renderURL var="rowURL">
			<portlet:param name="idEmployer" value="${aEmployer.idEmployer}"/>
			<portlet:param name="backURL" value="<%=currentURL%>"/>
			<portlet:param name="mvcPath" value="/html/manageEmployer/editAddEmployer.jsp"/>

		</portlet:renderURL>
	
		<liferay-ui:search-container-column-text property="nameEmployer" name="Name"/>

		<liferay-ui:search-container-column-text value="<%= DepartmentLocalServiceUtil.getDepartment(aEmployer.getIdDept()).getNameDept()%>" name="Department" />
		
		<liferay-ui:search-container-column-text href="${rowURL}" name="Detail" value="Click Here For Detail" />
		
		<portlet:actionURL var="deleteEmployer" name="deleteEmployer">
			<portlet:param name="idEmployer" value="${aEmployer.idEmployer}"/>
 			<portlet:param name="backURL" value="<%=currentURL %>"/> 
		</portlet:actionURL>
		<liferay-ui:search-container-column-text  name="Delete Employer" value="Delete" href="${deleteEmployer}"/>

		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>

		<portlet:renderURL var="addEmployerURL">
			<portlet:param name="backURL" value="<%=currentURL%>"/>
			<portlet:param name="mvcPath" value="/html/manageEmployer/editAddEmployer.jsp"/>

		</portlet:renderURL>

<a href="${addEmployerURL}">Add Employer</a>
