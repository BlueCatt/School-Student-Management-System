package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.lyu.service.StudentService;
import com.lyu.domain.Student;
import java.util.ArrayList;
import java.sql.*;

public final class showFriends_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/MainFrame.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/friends.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            \n");
      out.write("                    \n");
      out.write("                    ");

                        String name=(String)request.getAttribute("name");
                        
      out.write("\n");
      out.write("                    <body background='img/bg.jpg'>\n");
      out.write("                    \n");
      out.write("                        <span class='div1'><Strong>Welcome to NYIT Student Center</Strong></span>\n");
      out.write("                        <span class=\"name\">");
      out.print(name );
      out.write("</span>\n");
      out.write("                        &nbsp;&nbsp;<span><a href=\"/NYIT1/goMyMessage\"><img src=\"img/tubiao.jpg\" width=\"20px\"></a></span>\n");
      out.write("                        <span class='div2'><a href='/NYIT1/logoutCL'>Log Out</a></span><hr/>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"div3\">\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th><a href='/NYIT1/loginCL'>Home</a></th>\n");
      out.write("                        <th><a href='/NYIT1/goFriends'>Friends</a></th>\n");
      out.write("                        <th><a href='/NYIT1/goBlackboard'>Blackboard</a></th>\n");
      out.write("                        <th><a href='/NYIT1/showCourses'>Courses</a></th>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("                        <span style=\"font-size: 30px;\">Here are NYIT students that have been signed up.</span><span style=\"font-size: 25px;\"><a href=\"/NYIT1/goMyMajorStudents\"> Only my major</a></span>\n");
      out.write("                        \n");
      out.write("                        <span><form action=\"#\" method=\"post\">\n");
      out.write("                                <input type=\"email\"/>\n");
      out.write("                            \n");
      out.write("                            </form></span>\n");
      out.write("                        <div style=\"height: 50px;font-size: 1px\">.</div>\n");
      out.write("                        \n");
      out.write("                        <h2 style=\"color: teal\">Computer Science</h2>\n");
      out.write("                    \n");
      out.write("                ");

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
                
                
      out.write("\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <span class=\"card1\">");
      out.print(student.getFname() );
      out.write("</span>\n");
      out.write("                    <span class=\"card2\"><a href=\"/NYIT1/goChat?id=");
      out.print(student.getId() );
      out.write("\"><img src=\"img/chat.png\" style=\"width: 120px; height:80px;\"></a></span>\n");
      out.write("                    <span class=\"card3\"><img src=\"");
      out.print( uu);
      out.write("\" style=\"width: 120px; height:80px;\" alt=\"");
      out.print(uu );
      out.write("\"></span>\n");
      out.write("                    <span class=\"card4\">");
      out.print( student.getCountry());
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("           \n");
      out.write("                \n");
      out.write("                    ");
      
            }
            
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div style=\"height: 30px;font-size: 1px\">.</div>\n");
      out.write("            \n");
      out.write("            <h2 style=\"color: teal\">Archetecture</h2>\n");
      out.write("            \n");
      out.write("            ");
  
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
            
                
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        <div class=\"card\">\n");
      out.write("                    <span class=\"card1\">");
      out.print(student.getFname() );
      out.write("</span>\n");
      out.write("                    <span class=\"card2\"><a href=\"/NYIT1/goChat?id=");
      out.print(student.getId() );
      out.write("\"><img src=\"img/chat.png\" style=\"width: 120px; height:80px;\"></a></span>\n");
      out.write("                    <span class=\"card3\"><img src=\"");
      out.print( uu);
      out.write("\" style=\"width: 120px; height:80px;\" alt=\"");
      out.print(uu );
      out.write("\"></span>\n");
      out.write("                    <span class=\"card4\">");
      out.print( student.getCountry());
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                          ");
      
            }
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <div style=\"height: 30px;font-size: 1px\">.</div>\n");
      out.write("                        \n");
      out.write("                        <h2 style=\"color: teal\">Business</h2>\n");
      out.write("                    ");
  
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
                     
      out.write("\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("                        <div class=\"card\">\n");
      out.write("                    <span class=\"card1\">");
      out.print(student.getFname() );
      out.write("</span>\n");
      out.write("                    <span class=\"card2\"><a href=\"/NYIT1/goChat?id=");
      out.print(student.getId() );
      out.write("\"><img src=\"img/chat.png\" style=\"width: 120px; height:80px;\"></a></span>\n");
      out.write("                    <span class=\"card3\"><img src=\"");
      out.print( uu);
      out.write("\" style=\"width: 120px; height:80px;\" alt=\"");
      out.print(uu );
      out.write("\"></span>\n");
      out.write("                    <span class=\"card4\">");
      out.print( student.getCountry());
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                     \n");
      out.write("                \n");
      out.write("                        \n");
      out.write("                ");
      
            }
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <div style=\"height: 30px;font-size: 1px\">.</div>\n");
      out.write("                        \n");
      out.write("                        <h2 style=\"color: teal\">Telecommuincation</h2>\n");
      out.write("                    ");
 
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
                     
      out.write("\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("                        <div class=\"card\">\n");
      out.write("                    <span class=\"card1\">");
      out.print(student.getFname() );
      out.write("</span>\n");
      out.write("                    <span class=\"card2\"><a href=\"/NYIT1/goChat?id=");
      out.print(student.getId() );
      out.write("\"><img src=\"img/chat.png\" style=\"width: 120px; height:80px;\"></a></span>\n");
      out.write("                    <span class=\"card3\"><img src=\"");
      out.print( uu);
      out.write("\" style=\"width: 120px; height:80px;\" alt=\"");
      out.print(uu );
      out.write("\"></span>\n");
      out.write("                    <span class=\"card4\">");
      out.print( student.getCountry());
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                       ");
      
            }
                    
      out.write("\n");
      out.write("                    </body>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
