<%-- 
    Document   : CCForManager
    Created on : Apr 6, 2015, 11:19:31 PM
    Author     : painter
--%>

<%@page import="com.lyu.domain.Student"%>
<%@page import="com.lyu.service.StudentService"%>
<%@page import="com.lyu.domain.Comment"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link href="css/comment.css" rel="stylesheet" type="text/css"/>
        
        <style>
            .name2{
                font-size: 25px;
                color:teal;
                position: absolute;
                left: 1000px;
                top:20px;

            }



            .div22{
                font-size: 20px;
                color:white;

                position: absolute;
                left: 1300px;
                top:18px;

            }
        </style>
    </head>
    <body>
        <body>
                    
                    <%
                        String name=(String)request.getAttribute("name");
                        String courseName=(String)request.getAttribute("courseName");    
                        String courseInfo=(String)request.getAttribute("courseInfo");
                        String id=(String)request.getAttribute("id");
                        //request.setAttribute("courseId", id);
                    %>
  
                <% 
                    String id2 = (String)request.getSession().getAttribute("managerId");
                    %>

                        <nav class="navbar navbar-inverse navbar-fixed-top  col-md-6" role="navigation">
                            <div class="container">
                                <div class="navbar-header">
                                    <a href="#" class="navbar-brand">NYIT Manager Center</a>
                                </div>

                                <div id="navbar" class="collapse navbar-collapse">
                                    <ul class="nav navbar-nav " role="tablist">

                                        <li><a href="/NYIT1/managerLoginCL">Home</a></li>
                                        <li><a href="/NYIT1/postonBlackboard.jsp">Blackboard</a></li>
                                        <li><a href="/NYIT1/goStudentForManager">Student</a></li>
                                        <li class="active"><a href="/NYIT1/goManagerCourse">Course</a></li>
                                        

                                    </ul>

                                </div>
                            </div>

                        </nav>

                    <span class="name2">Manager<%=id2 %></span>

                                <span class='div22'><a href='/NYIT1/logoutCL' class="btn btn-danger">Log Out</a></span>
                                <div style="height: 50px;font-size: 1px">.</div>
                
                <div class="cname"><%=courseName %></div>     
                <div class="cinfo"><%=courseInfo %></div>
                
                
                        <div style="height: 30px;font-size: 1px">.</div> 
                        <span style="margin-left: 20px;font-size: 30px;" class="btn-link">History Comments</span>
                        
                        <div style="height: 80px;font-size: 1px">.</div>
                      
                            
                            <%                         
            //从request中取出要显示的课程信息
            ArrayList al=(ArrayList)request.getAttribute("comments");
            for(int i=0;i<al.size();i++){
                Comment comment=(Comment)al.get(i);
                
                
                %>
                
                <div class="comments">
                    <span style="font-size: 20px;" class="col-md-1"><%=comment.getSId() %></span>
                    <span style="font-size: 30px;" class="col-md-6"><%=comment.getComment() %></span>
                    <span style="font-size: 20px;" class="col-md-offset-1 col-md-3"><%=comment.getDate() %></span>
                    <span class="col-md-1"><a href="javascript:if(confirm('Are you sure?'))window.location='/NYIT1/goRemoveComment?commentId=<%=comment.getCoId() %>'" class="btn btn-warning">Remove</a></span>
                </div>
                       
                
                <% 
            }
            %>
                            
                       
            
                <div>
                          
                    
                </div>
            
            
            
            
            
            
            
            
            
            <script language="javascript">
                function checkForms()
                {
                    var iu, iuu, regArray=new Array("love","funny","nyit","computer","science","new","york");
            //以上为要过滤的字符，用双引号包括起来，英文逗号隔开

                    iuu=regArray.length;

                    var obj=document.getElementById("cheakIt");
            //查找输入框元素
                    if(obj.value==""||obj.value==" "||obj.value=="　")
                    {
                        alert("Say something!");
                        obj.focus();
                        return false;
                    }

                    for(iu=0;iu<=iuu;iu++)
                    {
                        if(regArray[iu] !="")
                        {
                            if (obj.value.indexOf(regArray[iu])!=-1)
                            {
                                obj.value="";//输入内容转为空
                                alert("You can not say the word:" + regArray[iu]);
                                //document.form_talk.content.focus();
                                obj.focus();
                                return false;
                            }
                        }
                    }
                    return true;
                }
                
                function con(){
                    if(confirm("Are you sure?")==true){
                        return true;
                    }else {
                        return false;
                    }
                      
                }
                

            </script>
            
            
    </body>
</html>