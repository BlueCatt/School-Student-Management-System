<%-- 
    Document   : courseComments
    Created on : Dec 2, 2014, 3:11:16 PM
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

                                <span class="name22"><%=name %> <span class="glyphicon glyphicon-education" aria-hidden="true"></span></span>



                                <span class='div22'><a href='/NYIT1/logoutCL' class="btn btn-danger">Log Out</a></span>
                        
                        <div style="height: 120px;font-size: 1px">.</div>
                
                <div class="cname"><%=courseName %></div>     
                <div class="cinfo"><%=courseInfo %></div>
                
                <div class="myComment">
                    <form action="/NYIT1/myCommentCL" method="post" onsubmit="return checkForms()">
                        <textarea cols='125' rows='3' name="myComment" id="cheakIt" placeholder="Please give your comment to this course or professor, we appreciate it!  Bad words are not permitted." style="color:gray"></textarea>
                        <input type="hidden" name="id" value=<%=id %>>
                        <input type="submit" value="Submit!" class="btn btn-primary"/>
                        
                    </form>
                        
                          
                </div>
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

            </script>
    </body>
</html>
