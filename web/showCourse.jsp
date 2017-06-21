<%-- 
    Document   : showCourse
    Created on : Nov 9, 2014, 7:53:47 PM
    Author     : painter
--%>

<%@page import="com.lyu.domain.Course"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link href="css/MainFrame.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="bootstrap.min.css">
    </head>
    <body>
        
                    <%
                        String name=(String)request.getAttribute("name");
                        %>
        <nav class="navbar navbar-default navbar-fixed-top  col-md-6" role="navigation">
                            <div class="container">
                                <div class="navbar-header">
                                    <a href="#" class="navbar-brand">NYIT Student Center</a>
                                </div>

                                <div id="navbar" class="collapse navbar-collapse">
                                    <ul  id="mytab" class="nav navbar-nav nav-tabs " role="tablist">

                                        <li><a href="/NYIT1/loginCL">Home</a></li>
                                        <li><a href="/NYIT1/goFriends">Friends</a></li>
                                        <li><a href="/NYIT1/goBlackboard">Blackboard</a></li>
                                        <li class="active"><a href="/NYIT1/showCourses">Courses</a></li>
                                        <li><a href="/NYIT1/goMyMessage"><span class="glyphicon glyphicon-star" aria-hidden="true"></span> Message</a></li>

                                    </ul>

                                </div>
                            </div>

                        </nav>

                                <span class="name"><%=name %> <span class="glyphicon glyphicon-education" aria-hidden="true"></span></span>



                                <span class='div2'><a href='/NYIT1/logoutCL' class="btn btn-danger">Log Out</a></span>
                        
                        <div style="height: 120px;font-size: 1px">.</div>
                
        <h2>Here are the courses we have,you can add, delete or update you own courses.</h2>
        
        <div class="div4">
            <table class="table table-bordered table-hover table-striped">
                <tr class="text-primary lead"><td>Course_Code</td><td>Course_Name</td>
                <td>Professor</td><td>Course_Time</td>
                <td>Information</a></td><td>Add</a></td></tr>
            
        <%
            
            ArrayList al=(ArrayList)request.getAttribute("courses");
            for(int i=0;i<al.size();i++){
                Course course=(Course)al.get(i);
                %>
                <tr><td><%=course.getCode() %></td><td><%=course.getName() %></td>
                <td><%=course.getProfessor() %></td><td><%=course.getTime() %></td>
                <td><a href="/NYIT1/goComment?id=<%=course.getId() %>">TO see..</a></td>
                <td><a href="/NYIT1/CourseCL?type=add&id=<%=course.getId() %>">Add</a></td></tr>
                
            <%
            }
                %>
        </table>
        </div><br/>
        
        <div style="margin-left: 620px;"><a href="/NYIT1/CourseCL?type=show" style="color:red;font-size: 18px">Show my course cart</a></div>
        
        
    </body>
</html>
