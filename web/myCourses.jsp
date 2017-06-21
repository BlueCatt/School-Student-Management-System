<%-- 
    Document   : myCourses
    Created on : Nov 10, 2014, 3:04:35 AM
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
    </head>
    <body background='img/bg.jpg'>
        
        
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
        
                <h2>The courses you have chosen are shown here,click Courses to continue.</h2>
                
                <div class="div4">
                    <table class="table table-bordered table-hover table-striped">
            <tr><td>Name</td><td>Code</td>
                <td>Professor</td><td>Time</td>
                <td>Comment</td><td>Drop?</td></tr>
        
        <%
            //从request中取出要显示的课程信息
            ArrayList al=(ArrayList)request.getAttribute("courseList");
            for(int i=0;i<al.size();i++){
                Course course=(Course)al.get(i);
                %>
                
                <tr>
                    <td><%=course.getName() %></td><td><%=course.getCode() %></td>
                    <td><%=course.getProfessor() %></td><td><%=course.getTime() %></td>
                    <td><a href="/NYIT1/goComment?id=<%=course.getId() %>">Comment</a></td>
                    <td><a href="/NYIT1/CourseCL?type=del&id=<%=course.getId() %>">Drop</a></td>
                </tr>
                
                <% 
            }
            %>
            </table>
                </div>
            
            <div style="height: 30px;font-size: 1px">.</div>
            
            <a href="javascript:if(confirm('Are you sure?'))window.location='/NYIT1/CourseCL?type=comfirm'" class="btn btn-success">
                Submit
            </a>
            
    </body>
</html>
