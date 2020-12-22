<%@page import="com.telefonica.service.DepartmentLocalServiceUtil"%>
<%@page import="com.telefonica.service.DepartmentLocalService"%>
<%@page import="com.telefonica.model.impl.DepartmentImpl"%>
<%@page import="com.telefonica.model.Department"%>
<%@page import="com.telefonica.model.impl.EmployerImpl"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.util.Portal"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="com.telefonica.service.EmployerLocalServiceUtil" %>
<%@ page import="java.util.*" %>
<%@ page import="com.telefonica.*"%>
<%@ page import="com.telefonica.model.Employer" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<script src="<%=request.getContextPath()%>/js/jquery.js"> </script>
<script src="<%=request.getContextPath()%>/js/bootstrap.js"> </script>

<theme:defineObjects/>
<portlet:defineObjects />