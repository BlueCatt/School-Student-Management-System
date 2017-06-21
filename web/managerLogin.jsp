<%-- 
    Document   : managerLogin
    Created on : Nov 10, 2014, 4:28:56 PM
    Author     : painter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/index.css" rel="stylesheet" type="text/css"/>
    </head>
    
            <body background='img/bg.jpg'>
        
            <span class="div1">NYIT</span>
            <span class="div2">manager</span><hr/>
            <div class="div3">
            <div class="div4">Manager Login</div>
            <form action="/NYIT1/managerLoginCL" method="post">
            <div class="div5">ManagerId <input type="text" name="id"/></div>
            <div class="div5">Password   &nbsp&nbsp<input type="password" name="password"/></div>
            <div class="div6"><input type='submit' value='Login' /></div>
            
            <%
                    String errInfo=(String)request.getAttribute("err");
                    if(errInfo!=null){
                        out.println("<font color='red'>"+errInfo+"</font>");
                }
                    
                    %>
                    
            </form>
    
</html>
