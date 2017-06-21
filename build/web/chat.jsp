<%-- 
    Document   : chat
    Created on : Dec 13, 2014, 2:54:17 PM
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
        <link href="css/MainFrame.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%
            
                    String name=(String)request.getAttribute("name");
                       
                        //int sendId=(Integer)request.getAttribute("sendId");
                    String sendId=(String)request.getSession().getAttribute("myId");
        
                        String getId=(String)request.getAttribute("getId");
                        String getName=(String)request.getAttribute("getName");
        %>
        
               <nav class="navbar navbar-default navbar-fixed-top  col-md-6" role="navigation">
                            <div class="container">
                                <div class="navbar-header">
                                    <a href="#" class="navbar-brand">NYIT Student Center</a>
                                </div>

                                <div id="navbar" class="collapse navbar-collapse">
                                    <ul  id="mytab" class="nav navbar-nav nav-tabs " role="tablist">

                                        <li><a href="/NYIT1/loginCL">Home</a></li>
                                        <li class="active"><a href="/NYIT1/goFriends">Friends</a></li>
                                        <li><a href="/NYIT1/goBlackboard">Blackboard</a></li>
                                        <li><a href="/NYIT1/showCourses">Courses</a></li>
                                        <li><a href="/NYIT1/goMyMessage"><span class="glyphicon glyphicon-star" aria-hidden="true"></span> Message</a></li>

                                    </ul>

                                </div>
                            </div>

                        </nav>

                                <span class="name"><%=name %> <span class="glyphicon glyphicon-education" aria-hidden="true"></span></span>



                                <span class='div2'><a href='/NYIT1/logoutCL' class="btn btn-danger">Log Out</a></span>
                        
                       
                
                <div style="height: 100px;font-size: 1px">.</div>
                <h2 style="color: teal">To <%=getName %></h2>
                <form action="/NYIT1/chatCL" method="post">
                    <textarea cols="120" rows="6" name="message" placeholder="Send message to.."></textarea>
                    <input type="hidden" name="sendId" value=<%=sendId %>>
                    <input type="hidden" name="getId" value=<%=getId %>>
                    <input type="submit" value="Submit" class="btn btn-success"/>
                </form>
                        
                        <div style="height: 50px;font-size: 1px">.</div>
                        
                        <div>
                <a href="/NYIT1/goFriends">
                <input type="button" value="Back"/>
            </a>
            </div>
                
    </body>
</html>
