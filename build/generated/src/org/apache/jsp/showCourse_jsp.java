package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.lyu.domain.Course;
import java.util.ArrayList;

public final class showCourse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/MainFrame.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body background='img/bg.jpg'>\n");
      out.write("        \n");
      out.write("                    ");

                        String name=(String)request.getAttribute("name");
                        
      out.write("\n");
      out.write("        \n");
      out.write("                <span class='div1'><Strong>Welcome to NYIT Student Center</Strong></span>\n");
      out.write("                <span class=\"name\">");
      out.print(name );
      out.write("</span>\n");
      out.write("                &nbsp;&nbsp;<span><a href=\"/NYIT1/goMyMessage\"><img src=\"img/tubiao.jpg\" width=\"20px\"></a></span>\n");
      out.write("                <span class='div2'><a href='/NYIT1/logoutCL'>Log Out</a></span><hr/>\n");
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
      out.write("                \n");
      out.write("        <h2>Here are the courses we have,you can add, delete or update you own courses.</h2>\n");
      out.write("        \n");
      out.write("        <div class=\"div4\">\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr><td>Course_Code</td><td>Course_Name</td>\n");
      out.write("                <td>Professor</td><td>Course_Time</td>\n");
      out.write("                <td>Information</a></td><td>Add</a></td></tr>\n");
      out.write("            \n");
      out.write("        ");

            
            ArrayList al=(ArrayList)request.getAttribute("courses");
            for(int i=0;i<al.size();i++){
                Course course=(Course)al.get(i);
                
      out.write("\n");
      out.write("                <tr><td>");
      out.print(course.getCode() );
      out.write("</td><td>");
      out.print(course.getName() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(course.getProfessor() );
      out.write("</td><td>");
      out.print(course.getTime() );
      out.write("</td>\n");
      out.write("                <td><a href=\"/NYIT1/goComment?id=");
      out.print(course.getId() );
      out.write("\">TO see..</a></td>\n");
      out.write("                <td><a href=\"/NYIT1/CourseCL?type=add&id=");
      out.print(course.getId() );
      out.write("\">Add</a></td></tr>\n");
      out.write("                \n");
      out.write("            ");

            }
                
      out.write("\n");
      out.write("        </table>\n");
      out.write("        </div><br/>\n");
      out.write("        \n");
      out.write("        <div style=\"margin-left: 620px;\"><a href=\"/NYIT1/CourseCL?type=show\" style=\"color:red;font-size: 18px\">Show my course cart</a></div>\n");
      out.write("        \n");
      out.write("        \n");
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
