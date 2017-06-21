<%-- 
    Document   : sighupShow
    Created on : Nov 18, 2014, 10:00:07 PM
    Author     : painter
--%>

<%@page import="com.lyu.domain.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.css">
        
        <link href="css/sighupshow.css" rel="stylesheet" type="text/css"/>
    </head>
                <body background='img/bg.jpg'>
                    
                    <%
                        Student student=(Student)request.getAttribute("student");
                        String name=student.getLname();
                    %>
                    
                    <h1><%=name %></h1>
                <span class="div1"><Strong>You have signed up into our system successfully</Strong></span>
                <span class="div2"><a href="/NYIT1/newjsp.jsp">Back to log in</a></span>
                
                <table class="table table-bordered table-striped">
                    <tr><td>Name</td><td><%=student.getFname() %><%=student.getLname() %></td></tr>
                    <tr><td>Id</td><td><%=student.getId() %></td></tr>
                    <tr><td>Gender</td><td><%=student.getSex() %></td></tr>
                    <tr><td>Major</td><td><%=student.getMajor() %></td></tr>
                    <tr><td>Country</td><td><%=student.getCountry() %></td></tr>
                        
                        
                        
                        
                    
                </table>
                
                <table>
                    
                </table>
  
                
                
                
                
                
                
                
                
                
                
                
              
                
                </body>
</html>
