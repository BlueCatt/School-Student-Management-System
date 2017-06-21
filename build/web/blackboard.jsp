<%-- 
    Document   : blackboard
    Created on : Nov 10, 2014, 5:04:57 PM
    Author     : painter
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.css">
        
        <link href="css/MainFrame.css" rel="stylesheet" type="text/css"/>
    </head>
    
                <%
                        Connection ct=null;
                        ResultSet rs=null;
                        PreparedStatement ps=null; 
                %>
                
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
                                        <li><a href="/NYIT1/goFriends">Friends</a></li>
                                        <li class="active"><a href="/NYIT1/goBlackboard">Blackboard</a></li>
                                        <li><a href="/NYIT1/showCourses">Courses</a></li>
                                        <li><a href="/NYIT1/goMyMessage"><span class="glyphicon glyphicon-star" aria-hidden="true"></span> Message</a></li>

                                    </ul>

                                </div>
                            </div>

                        </nav>

                                <span class="name"><%=name %> <span class="glyphicon glyphicon-education" aria-hidden="true"></span></span>



                                <span class='div2'><a href='/NYIT1/logoutCL' class="btn btn-danger">Log Out</a></span>
                        
                        <div style="height: 120px;font-size: 1px">.</div>
                
                
                <%
                try{
                    Class.forName("oracle.jdbc.OracleDriver");
                    
                    ct=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "test", "122588");
                   
                    ps=ct.prepareStatement("Select * from announcement order by time desc");
                    
                    rs=ps.executeQuery();
                    
                    %>
                    
                    <h2>Here are the important news you need to be aware.</h2>
                    
                    <div class='div4'>
                    <table class="table table-bordered table-hover table-striped">
                    <tr class="text-primary lead"><td>Title</td><td>Announcement</td><td width=300px> Time </td></tr>
                    
                    
                    <%
                    while(rs.next()){
                        %>
                        
                        <tr><td><%=rs.getString(1)%></td><td><%=rs.getString(2) %></td><td><%=rs.getString(3)%></td><tr>
                            
                    <%        
                    }
                    %>
                    </table>
                    </div>
                    
                    <%
                }catch(Exception e){
                    
                }
                
                
                finally{
                    if(rs!=null){
                        try {
                            rs.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        rs=null;
                    }
                    if(ps!=null){
                        try {
                            ps.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        ps=null;
                    }
                    
                    if(ct!=null){
                        try {
                            ct.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        ct=null;
                    }
                    
                }
 
                %>
                </body>
    
</html>
