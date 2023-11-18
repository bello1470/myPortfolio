<%@page import="java.util.List"%>
<%@ page import="org.bellotech.Entity.User"%>
<jsp:include page="include/Header.jsp" />



<h1>PROJECTS</h1>

<table border="1">
	<thead>
		<th>user_id</th>
		<th>username</th>
		<th>projectName</th>
		<th>project</th>
		<th>Operation(s)</th>
	</thead>


	<%
	List<User> listusers = (List) request.getAttribute("listusers");
	for (User _user : listusers) {
		out.print("<tr>");
		out.print("<td>" + _user.getUser_id() + "</td>");

		out.print("<td>" + _user.getUsername() + "</td>");

		out.print("<td>" + _user.getProjectName() + "</td>");

		out.print("<td>" + _user.getProject() + "</td>");

		out.print("<td> <a href=" + request.getContextPath() + "/Site?page=updateuser&user_id" + _user.getUser_id()
		+ "&username" + _user.getUsername() + "&projectName" + _user.getProjectName() + "&project"
		+ _user.getProject() + ">update</a></td>");
		out.print("</tr>");
		out.print("<td> <a href=" + request.getContextPath() + "/Site?page=updateuser&user_id" + _user.getUser_id()
		+ ">delete</a></td>");
		
		out.print("  |  ");
	}
	%>
</table>


<jsp:include page="include/Footer.jsp" />