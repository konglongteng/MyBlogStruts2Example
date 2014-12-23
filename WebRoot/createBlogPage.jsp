<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head><title>Create Blog</title></head>
	<body>
		<b>&lt;Create page</b> - Create a new blog post.
		<hr />
		<s:form action="/bloggingns/PublishBlogPost.action">
			<s:textfield name="subject" label="Subject" />
			<s:textarea name="content" label="Content" />
			<s:submit value="Publish" align="center" />
		</s:form>
		<hr />
		<a href="http://localhost:8080/MyBlogStruts2Example/bloggingns/ShowBlogAdminPage.action">Admin page</a>
		<br>
	</body>
</html>
