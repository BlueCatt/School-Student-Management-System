<%-- 
    Document   : myMajorStudents
    Created on : Dec 3, 2014, 1:28:24 PM
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
        
        <link href="css/MainFrame.css" rel="stylesheet" type="text/css"/>
        <link href="css/friends.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
         <%
                        String name=(String)request.getAttribute("name");
                        %>
                    <body>
                    
                        <nav class="navbar navbar-default navbar-fixed-top  col-md-6" role="navigation">
                            <div class="container">
                                <div class="navbar-header">
                                    <a href="#" class="navbar-brand">NYIT Student Center</a>
                                </div>

                                <div id="navbar" class="collapse navbar-collapse">
                                    <ul  id="mytab" class="nav navbar-nav nav-tabs " role="tablist">

                                        <li><a href="/NYIT1/loginCL">Home</a></li>
                                        <li class="active"><a href="/NYIT1/goFriends">Friends</a></li>
                                        <li ><a href="/NYIT1/goBlackboard">Blackboard</a></li>
                                        <li><a href="/NYIT1/showCourses">Courses</a></li>
                                        <li><a href="/NYIT1/goMyMessage"><span class="glyphicon glyphicon-star" aria-hidden="true"></span> Message</a></li>

                                    </ul>

                                </div>
                            </div>

                        </nav>

                                <span class="name"><%=name %> <span class="glyphicon glyphicon-education" aria-hidden="true"></span></span>



                                <span class='div2'><a href='/NYIT1/logoutCL' class="btn btn-danger">Log Out</a></span>
                        
                        <div style="height:120px;font-size: 1px">.</div>
                        
                <h2>Here are NYIT students in your major.</h2>
                
               
                    
                <%
            
            ArrayList al=(ArrayList)request.getAttribute("myMajorStudents");
            for(int i=0;i<al.size();i++){
                
                Student student=(Student)al.get(i);
                
                String g=student.getSex();
                String uu="a";
                
                if(g.equalsIgnoreCase("male    ")){
                    uu="img/boy.png";
                }else if(g.equalsIgnoreCase("female  ")){
                    uu="img/girl.png";
                }else{
                    uu="b";
                }
                
                %>
                <div class="card">
                    <span class="card1"><%=student.getFname() %></span>
                    <span class="card2"><a href="/NYIT1/goChat?id=<%=student.getId() %>"><img src="img/chat.png" style="width: 120px; height:80px;"></a></span>
                    <span class="card3"><img src="<%= uu%>" style="width: 120px; height:80px;" alt="<%=uu %>"></span>
                    <span class="card4"><%= student.getCountry()%></span>
                </div>
                
            <%
            }
                %>
                    
                    
                    
                    </table>
                    </div>  
                
    </body>
</html>
