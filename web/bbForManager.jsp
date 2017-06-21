<%-- 
    Document   : bbForManager
    Created on : Nov 11, 2014, 10:34:41 PM
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
        <link href="css/blackboard.css" rel="stylesheet" type="text/css"/>
    </head>
    
                <%
                Connection ct=null;
                ResultSet rs=null;
                PreparedStatement ps=null; 
                %>
                
		
               
                
               
                <body background='img/blackboard.jpg'>
                <div class='shadow'><Strong>NYIT Blackboard</Strong></div>
                <span class='div2'><a href='/NYIT1/managerHome.jsp'>Back to Homepage</span>
                
                
                <%
                try{
                    Class.forName("oracle.jdbc.OracleDriver");
                    
                    ct=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "test", "122588");
                   
                    ps=ct.prepareStatement("Select * from announcement order by time desc");
                    
                    rs=ps.executeQuery();
                    
                    %>
                    <div class='div1'>
                    <table border=1px bordercolor=gray cellspacing=0 width=1100px height:800px>
                        <tr><th>Title</th><th>Announcement</th><th width=300px> Time </th></tr>
                    
                    <%
                    while(rs.next()){
                        %>
                        <tr>
                            <td><%=rs.getString(1)%></td><td><%=rs.getString(2) %></td><td><%=rs.getString(3)%></td>
                            
                        </tr>
                            
                            
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
