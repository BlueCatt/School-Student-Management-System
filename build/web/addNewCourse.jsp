<%-- 
    Document   : addNewCourse
    Created on : Apr 15, 2015, 10:49:09 AM
    Author     : painter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.css">
        
        <style>
            .name{
                font-size: 25px;
                color:teal;
                position: absolute;
                left: 1000px;
                top:20px;

            }



            .div2{
                font-size: 20px;
                color:white;

                position: absolute;
                left: 1300px;
                top:18px;

            }
        </style>
    </head>
    <body>
                    <% 
                    String id = (String)request.getSession().getAttribute("managerId");
                    %>

                        <nav class="navbar navbar-inverse navbar-fixed-top  col-md-6" role="navigation">
                            <div class="container">
                                <div class="navbar-header">
                                    <a href="#" class="navbar-brand">NYIT Manager Center</a>
                                </div>

                                <div id="navbar" class="collapse navbar-collapse">
                                    <ul class="nav navbar-nav " role="tablist">

                                        <li><a href="/NYIT1/managerLoginCL">Home</a></li>
                                        <li><a href="/NYIT1/postonBlackboard.jsp">Blackboard</a></li>
                                        <li><a href="/NYIT1/goStudentForManager">Student</a></li>
                                        <li class="active"><a href="/NYIT1/goManagerCourse">Course</a></li>
                                        

                                    </ul>

                                </div>
                            </div>

                        </nav>

                    <span class="name">Manager<%=id %></span>

                                <span class='div2'><a href='/NYIT1/logoutCL' class="btn btn-danger">Log Out</a></span>
                                <div style="height: 120px;font-size: 1px">.</div>
                                
                                <h2>Please fill out details of the new course.</h2>
    </body>
</html>
