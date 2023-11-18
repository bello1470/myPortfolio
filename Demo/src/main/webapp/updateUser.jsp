<jsp:include page="include/Header.jsp"/>



<h1>ADD PROJECTS</h1>
<form action ="${pageContext.request.contextPath}/Site" metthod="post" />

		<input type="text" name="username" value="${param.username}" requied="requied"/></br>
		<input type="text" name="project Name"  value="${param.projectName}"requied="requied"/></br>
		<input type="text" name="project"  value="${param.project}" requied="requied"/></br>
		<input type="hidden" name="form" value="updateUserOperation"/></br>
		<input type="hidden" name="user_id"  value="${param.username}"/>
		<input type="submit" value="update Project"/></br>


</form>

<jsp:include page="include/Footer.jsp"/>