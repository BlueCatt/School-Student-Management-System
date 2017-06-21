<%-- 
    Document   : managerHome
    Created on : Nov 10, 2014, 4:40:34 PM
    Author     : painter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link href="css/manager.css" rel="stylesheet" type="text/css"/>
        <title>Manager Home</title>
        
    </head>
    <body>
     
        <% 
            String id = (String)request.getAttribute("managerId");
            %>
        
        <nav class="navbar navbar-inverse navbar-fixed-top  col-md-6" role="navigation">
                    <div class="container">
                        <div class="navbar-header">
                            <a href="#" class="navbar-brand">NYIT Manager</a>
                        </div>

                        <div id="navbar" class="collapse navbar-collapse">
                            <ul class="nav navbar-nav " role="tablist">

                                <li class="active" ><a href="/NYIT1/managerLoginCL">Home</a></li>
                                <li ><a href="/NYIT1/postonBlackboard.jsp">Blackboard</a></li>
                                <li><a href="/NYIT1/goStudentForManager">Student</a></li>
                                <li><a href="/NYIT1/goManagerCourse">Course</a></li>
                             

                            </ul>

                        </div>
                    </div>

                </nav>
                       
            <span class="name">Manager<%=id %></span>
                        
                        
                        
                        <span class='div2'><a href='/NYIT1/logoutCL' class="btn btn-danger">Log Out</a></span>
                        
                        <div style="height: 53px;font-size: 1px">.</div>
        
                        <div class="panel panel-default">
                            
                            <div class="panel-heading">
                                <h2>Welcome to NYIT Student Center Mananger Page!</h2>
                            </div>
                           
                            
                            </div>
        
       
        
        
    </body>
</html>
