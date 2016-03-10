<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>'登录页面'</title>
  </head>
  
  <body>
      <form action="<s:url action='regAction' />" method="post">  
	      <table cellpadding="0" cellspacing="0" norder="0" align="center">  
	          <caption>用户登录</caption>  
	          <tr>  
	              <td>用户名:</td>  
	              <td><input type="text" name="reg.username"></td>  
	          </tr>  
	          <tr>  
	              <td>密  码:</td>  
	              <td><input type="text" name="reg.password"></td>  
	          </tr>  
	          <tr>  
	              <td colspan="2"><input type="submit" value="登录"></td>   
	          </tr>  
	      </table>  
	  </form>
  </body>
</html>
