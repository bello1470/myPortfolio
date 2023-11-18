<jsp:include page="include/Header.jsp"/>



<h1>ADD PROJECTS</h1>
<form action ="${pageContext.request.contextPath}/Site" metthod="post" />

		<input type="text" name="username" requied="requied"/></br>
		<input type="text" name="project Name" requied="requied"/></br>
		<input type="text" name="project" requied="requied"/></br>
		<input type="hidden" name="form" value="addUserOperation"/></br>
		<input type="submit" value="Add Project"/></br>


</form>

<jsp:include page="include/Footer.jsp"/>