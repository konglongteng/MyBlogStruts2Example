<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head><title>Login page</title></head>
	<body>
		<b>Login page - Login to the Struts 2 application</b>
		<hr />
		<s:actionerror />
		<s:form action="/securens/AuthenticateUser.action">
			<s:textfield name="userName" label="Username" />
			<s:password name="password" label="Password" />
			<s:submit value="Login" align="center" />
		</s:form>
	</body>
</html>
