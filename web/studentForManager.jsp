<%-- 
    Document   : studentForManager
    Created on : Apr 7, 2015, 10:43:00 PM
    Author     : painter
--%>

<%@page import="com.lyu.domain.Student"%>
<%@page import="java.util.ArrayList"%>
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
                                        <li class="active"><a href="/NYIT1/goStudentForManager">Student</a></li>
                                        <li><a href="/NYIT1/goManagerCourse">Course</a></li>
                                        

                                    </ul>

                                </div>
                            </div>

                        </nav>

                    <span class="name">Manager<%=id %></span>

                                <span class='div2'><a href='/NYIT1/logoutCL' class="btn btn-danger">Log Out</a></span>
                                <div style="height: 120px;font-size: 1px">.</div>
                                
                                <table class="table table-bordered table-striped table-hover"     >
                                    <tr class="text-primary lead">
                                        <td>First Name</td><td>Last Name</td>
                                        <td>NYIT Id</td><td>Major</td>
                                        <td>Region</td><td>Remove</td>
                                        </tr>
                                        
                                    <%

                                        ArrayList al=(ArrayList)request.getAttribute("students");
                                        for(int i=0;i<al.size();i++){
                                            Student s=(Student)al.get(i);
                                            %>
                                            <tr>
                                            <td><%=s.getFname() %></td><td><%=s.getLname() %></td>
                                            <td><%=s.getId() %></td><td><%=s.getMajor() %></td>
                                            <td><%=s.getCountry() %></td>
                                            <td><a href="/NYIT1/goRemoveStudent?id=<%=s.getId() %>" class="btn btn-warning"><del>Remove</del></a></td>

                                            </tr>

                                        <%
                                        }
                                            %>
                                </table>       
                                
                                
                                
                                
    </body>
</html>
