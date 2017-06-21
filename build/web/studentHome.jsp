<%-- 
    Document   : studentHome
    Created on : Nov 11, 2014, 6:30:23 PM
    Author     : painter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.css">
        
        <link href="css/MainFrame.css" rel="stylesheet" type="text/css"/>
        <title>Student Home</title>
        
        <style>
            body{
                padding: 50px;
            }
            .intro{
                padding: 80px 15px;
                text-align: center;
            }
        </style>
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

                                <li class="active" ><a href="/NYIT1/loginCL">Home</a></li>
                                <li><a href="/NYIT1/goFriends">Friends</a></li>
                                <li ><a href="/NYIT1/goBlackboard">Blackboard</a></li>
                                <li><a href="/NYIT1/showCourses">Courses</a></li>
                                <li><a href="/NYIT1/goMyMessage"><span class="glyphicon glyphicon-star" aria-hidden="true"></span> Message</a></li>

                            </ul>

                        </div>
                    </div>

                </nav>
                       
                        <span class="name"><%=name %> <span class="glyphicon glyphicon-education" aria-hidden="true"></span></span>
                        
                        
                        
                        <span class='div2'><a href='/NYIT1/logoutCL' class="btn btn-danger">Log Out</a></span>
                        
                        <div style="height: 30px;font-size: 1px">.</div>
                
                        <div class="panel panel-default">
                            
                            <div class="panel-heading">
                                <h1>Welcome to NYIT Student Center!</h1>
                            </div>
                            
                            </div>
                        
                            <div class="col-md-3">
                                <object width="600" height="200"
                                        classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000"
                                        codebase="http://fpdownload.macromedia.com/
                                pub/shockwave/cabs/flash/swflash.cab#version=8,0,0,0">
                                    <param name="SRC" value="bookmark.swf">
                                    <embed src="flash/nyit.swf" width="300" height="200"></embed>
                                </object>
                                
                                
                            </div>
                            
                        <span class="col-md-offset-1 col-md-7">
                            
                            <h3>You can find friends you are interested in NYIT, chat with them and share experience of school courses.</h3>
                            <h3>Our managers will also post latest news and announcements to blackboard for you to check, and we also provide course services.</h3>
                            <h3>Don't hesitate, join us!</h3>
                            
                                </span>
                        
                
                        
                
               
                
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
