<%@ page language="java" contentType="text/html; charset=UTF-8"%>  
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>  
    <head>  
        <title>注册页面</title>  
    </head>  
    <script language="JavaScript" src="jquery-1.12.1.js"></script>
    <script type="text/javascript">
    	function timedMsg()
		 {
		 	$.ajax({

			    type:"POST",
			
			    url:"/Test/regAction!query",
			
			    data: {"id":1},
			
			    success:function(result){alert(result);},
			
			    dataType:"text",
			    
			    error:function(msg){alert("er");}
			
			});
			
		 }
    </script>
      
    <body>  
        <form action="<s:url action='reg_reg' />" method="post">  
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
                    <td colspan="2"><input type="submit" value="注册"></td>   
                </tr>  
            </table>  
        </form>
        
        <form action="<s:url action='reg_checkLogin' />" method="post">  
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
        <s:property value="reg.username"/>
        <input id="text1" value="" /><button onclick="timedMsg()">22222222222</button>
    </body>  
</html> 