<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
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

<%
int idEmployer = ParamUtil.getInteger(request, "idEmployer");
Employer employer = new EmployerImpl();
List<Department> departments = DepartmentLocalServiceUtil.getDepartments(0, DepartmentLocalServiceUtil.getDepartmentsCount());

if (idEmployer > 0){
	employer = EmployerLocalServiceUtil.getEmployer(idEmployer);
	String redirect = ParamUtil.getString(request, "backURL");
}
%>

<%
String fullURL = themeDisplay.getPortalURL() + themeDisplay.getPathContext();
%>


<portlet:actionURL var="addEmployer" name="addEmployer"></portlet:actionURL>
<aui:form action="<%=addEmployer%>" method="post" enctype="multipart/form-data" name="fm">
<aui:model-context bean="<%= employer %>" model="<%= Employer.class %>" />

	<aui:fieldset>
			
		<aui:input name="nameEmployer" label="Name Employer" value="${employer.nameEmployer}" >
		<aui:validator name="required"></aui:validator>
		</aui:input>
		
		<aui:select id="Department" name="idDept" showEmptyOption="true" label="Department">
			<% for(Department department:departments){%>		
				<aui:option
					selected="<%=employer!= null && department.getIdDept() == employer.getIdDept() %>"
					value="<%= department.getIdDept()%>">
					<%=department.getNameDept()%>
				</aui:option>
			<%} %>
		</aui:select>
    	<aui:input type="file" id="photo" name="photo" label="photo" value="<%=fullURL + employer.getPhoto() %>">
<%--     		<aui:validator name="required" /> --%>
<%--     		<aui:validator name="acceptFiles">'jpg,jpeg,png' </aui:validator> --%>
    	</aui:input>
		<aui:input name="idEmployer" value="${employer.idEmployer}" type="hidden"/>

	</aui:fieldset>
	<aui:button-row>

		<aui:button type="submit"></aui:button>

	</aui:button-row>
</aui:form>
<%if (employer.getIdEmployer() > 0) {%>
	<img src="<%=fullURL + employer.getPhoto()%>" alt="blank">   
<%} %>
   