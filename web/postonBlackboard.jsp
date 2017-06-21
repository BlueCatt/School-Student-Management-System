<%-- 
    Document   : postonBlackboard
    Created on : Nov 10, 2014, 4:47:42 PM
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
                                        <li class="active"><a href="/NYIT1/postonBlackboard.jsp">Blackboard</a></li>
                                        <li><a href="/NYIT1/goStudentForManager">Student</a></li>
                                        <li><a href="/NYIT1/goManagerCourse">Course</a></li>
                                       

                                    </ul>

                                </div>
                            </div>

                        </nav>

                    <span class="name">Manager<%=id %></span>

                                <span class='div2'><a href='/NYIT1/logoutCL' class="btn btn-danger">Log Out</a></span>
                                <div style="height: 80px;font-size: 1px">.</div>
                        
                
                <span style="font-size: 30px;color: gray">Please write down the announcement here</span>
            
                <div style="height: 30px;font-size: 1px">.</div>
            <form action='/NYIT1/postCL' method='post'>
                
                <textarea cols='67' rows='3' name='title' placeholder="Title..."></textarea><br/>
            
                <textarea cols='100' rows='30' name='text' placeholder="Text of important things..."></textarea>
            <input type='submit' value='submit' class="btn btn-primary">
            </form>    
            </body>
</html>
