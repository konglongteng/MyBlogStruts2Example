<%@ taglib prefix="s" uri="/struts-tags"%>	
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head><title>Delete Blog page</title></head>
  <body>
  <b>Delete Blog page</b> - Choose the blog to delete from the list below
  	<s:form action="DeleteBlogPost">
	  	<s:select name="title" list="blogs"  listKey="subject" listValue="subject" label="Select a Blog to Delete" />
	  	<s:submit value="Delete"/>
	</s:form>
  	<hr/>
		<a href="http://localhost:8080/MyBlogStruts2Example/bloggingns/ShowBlogAdminPage.action">Admin page</a>
	<br>
  </body>
</html>
