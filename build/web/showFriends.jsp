<%-- 
    Document   : showFriends
    Created on : Nov 11, 2014, 10:53:29 PM
    Author     : painter
--%>

<%@page import="com.lyu.service.StudentService"%>
<%@page import="com.lyu.domain.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
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
                        
                        <div style="height: 90px;font-size: 1px">.</div>
                        
                        <span style="font-size: 30px; margin-left: 30px;" class="text-info">Here are NYIT students that have been signed up.</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style="font-size: 25px;"><a href="/NYIT1/goMyMajorStudents"> Only my major <span class="glyphicon glyphicon-arrow-right" aria-hidden="true"></span></a></span>
                        <div style="height: 50px;font-size: 1px">.</div>
                        
                        <div style="margin-left: 30px;">
                        <form action="/NYIT1/SearchFriendCL" method="post" class="form-inline">
                                <input type="text" name="searchname" placeholder="Friend's Name"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <input type="submit" value="Search" class="btn btn-success"/>       
                            </form>
                        </div>
                        
                        <div style="height: 50px;font-size: 1px">.</div>
                        
                        <div>
                        <h2 style="color: teal">Computer Science</h2>
                    
                <%
                String m="Computer Science";
                StudentService studentService=new StudentService();
			ArrayList al=studentService.getStudentByMajor(m);
            
            
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
                
                <div style="background-color: lightpink">
                <div class="card">
                    <span class="card1"><%=student.getFname() %></span>
                    <span class="card2"><a href="/NYIT1/goChat?id=<%=student.getId() %>" class="btn btn-success"><img src="img/chat.png" style="width: 90px; height:70px;"></a></span>
                    <span class="card3"><img src="<%= uu%>" style="width: 120px; height:80px;" alt="<%=uu %>"></span>
                    <span class="card4"><%= student.getCountry()%></span>
                </div>
                
                </div>
                
                    <%      
            }
            %>
            
                        
            
            <div style="height: 30px;font-size: 1px">.</div>
            
            <div>
            <h2 style="color: teal; clear: left;">Archetecture</h2>
            
            <%  
                    m="Archetecture";
                    al=studentService.getStudentByMajor(m);
                   
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
            </div>                    
                    <div style="height: 30px;font-size: 1px">.</div>
                        
                    
                        <h2 style="color: teal; clear: left;">Business</h2>
                    <%  
                    m="Business";
                    al=studentService.getStudentByMajor(m);
                    
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
                    
                    <div style="height: 30px;font-size: 1px">.</div>
                        
                        <h2 style="color: teal;clear: left;">Telecommuincation</h2>
                    <% 
                    m="Telecommuincation";
                    al=studentService.getStudentByMajor(m);
                    
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
                   
                    <script src="jquery.min.js"></script>
                        <script src="bootstrap.js"></script>

                        <script>
                            $("#mytab a").click(function(e){
                                        e.preventDefault();
                                        $(this).tab("show");
                                    }
                            )
                        </script>

                
    </body>
</html>
