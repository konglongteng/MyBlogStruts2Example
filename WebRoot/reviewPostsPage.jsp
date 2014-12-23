<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head><title>Review all posts</title></head>
  <body>	
  <b>Review page</b> - Review all blog posts
  <hr/>
    <table border="2">
		<tr><th>Subject</th><th>Content</th>
		<s:iterator value="blogs">
		<tr>
			<td><s:property value="subject"/></td>
    		<td><s:property value="content"/></td>
    	</tr>
		</s:iterator>
	</table>
	<hr/>
    <a href="http://localhost:8080/MyBlogStruts2Example/bloggingns/ShowBlogAdminPage.action">Admin page</a><br>
  </body>
</html>
