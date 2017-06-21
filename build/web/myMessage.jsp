<%-- 
    Document   : myMessage
    Created on : Dec 13, 2014, 4:35:05 PM
    Author     : painter
--%>

<%@page import="com.lyu.domain.Student"%>
<%@page import="com.lyu.service.StudentService"%>
<%@page import="com.lyu.domain.chat"%>
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
    <body>
        
        <%
            String name=(String)request.getAttribute("name");
            ArrayList getAl=(ArrayList)request.getAttribute("myMessage");
            ArrayList sendAl=(ArrayList)request.getAttribute("mySendMessage");
            
            
        %>
        
        
         <body background='img/bg.jpg'>
                    
                    
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
                                        <li><a href="/NYIT1/showCourses">Courses</a></li>
                                        <li class="active"><a href="/NYIT1/goMyMessage"><span class="glyphicon glyphicon-star" aria-hidden="true"></span> Message</a></li>

                                    </ul>

                                </div>
                            </div>

                        </nav>

                                <span class="name"><%=name %> <span class="glyphicon glyphicon-education" aria-hidden="true"></span></span>



                                <span class='div2'><a href='/NYIT1/logoutCL' class="btn btn-danger">Log Out</a></span>
                        
                        <div style="height: 120px;font-size: 1px">.</div>
                
                        
                        <h2>Incoming..</h2>
                
                <%
                    for(int i=0;i<getAl.size();i++){
                        chat c=(chat)getAl.get(i);
                    String sendId=c.getSend_id();
                    StudentService ss=new StudentService();
                    Student s=ss.getStudentById(sendId);
                    String sendName=s.getLname()+""+s.getFname();
                %>
                
                <div>
                    <div class="col-md-5 text-left"><code><%=c.getMessage() %></code></div>
                    <div class="col-md-2 col-md-offset-2"><lead>From</lead> <span class="glyphicon glyphicon-user" aria-hidden="true"></span> <%=sendName %></div>
                    <div class="col-md-1"><a href="/NYIT1/goChat?id=<%=sendId %>">reply</a></div>
                    <div class="col-md-2"><%=c.getDate() %></div>
                </div>
                
                <div style="height: 50px;font-size: 1px">.</div>
                
                <%
                    }
                %>        
              
                
                <div style="height: 120px;font-size: 1px">.</div>
                
                <h2>Outgoing..</h2>
                
                <%
                    for(int i=0;i<sendAl.size();i++){
                        chat c=(chat)sendAl.get(i);
                    String getId=c.getGet_id();
                    StudentService ss=new StudentService();
                    Student s=ss.getStudentById(getId);
                    String getName=s.getLname()+""+s.getFname();
                %>
                
                <div>
                    <div class="col-md-5 text-left"><code><%=c.getMessage() %></code></div>
                    <div class="col-md-2 col-md-offset-2"><lead>To</lead> <span class="glyphicon glyphicon-user" aria-hidden="true"></span> <%=getName %></div>
                    <div class="col-md-1"><a href="/NYIT1/goChat?id=<%=getId %>">continue</a></div>
                    <div class="col-md-2"><%=c.getDate() %></div>
                </div>
                
                <div style="height: 50px;font-size: 1px">.</div>
                
                <%
                    }
                %>  
        
    </body>
</html>
