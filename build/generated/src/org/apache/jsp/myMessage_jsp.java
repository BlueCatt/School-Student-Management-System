package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.lyu.domain.Student;
import com.lyu.service.StudentService;
import com.lyu.domain.chat;
import java.util.ArrayList;

public final class myMessage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            String name=(String)request.getAttribute("name");
            ArrayList al=(ArrayList)request.getAttribute("myMessage");
            
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <body background='img/bg.jpg'>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                 \n");
      out.write("                <span class='div1'><Strong>Welcome to NYIT Student Square</Strong></span>\n");
      out.write("               \n");
      out.write("                <span class=\"name\">");
      out.print(name );
      out.write("</span>\n");
      out.write("                &nbsp;&nbsp;<span><a href=\"/NYIT1/goMyMessage\"><img src=\"img/tubiao.jpg\" width=\"20px\"></a></span>\n");
      out.write("                <span class='div2'><a href='/NYIT1/logoutCL'>Log Out</a></span><hr/>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");

                    for(int i=0;i<al.size();i++){
                        chat c=(chat)al.get(i);
                    String sendId=c.getSend_id();
                    StudentService ss=new StudentService();
                    Student s=ss.getStudentById(sendId);
                    String sendName=s.getLname()+""+s.getFname();
                
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"message\">\n");
      out.write("                    <div class=\"m1\">");
      out.print(c.getMessage() );
      out.write("</div>\n");
      out.write("                    <div class=\"m2\">");
      out.print(sendName );
      out.write("&nbsp<a href=\"/NYIT1/goChat?id=");
      out.print(sendId );
      out.write("\">reply?</a></div>\n");
      out.write("                    <div class=\"m3\">");
      out.print(c.getDate() );
      out.write("</div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                ");

                    }
                
      out.write("        \n");
      out.write("                <div style=\"height: 30px;font-size: 1px\">.</div>\n");
      out.write("                <span class='back'><a href='/NYIT1/goFriends'>Back to Homepage</span>\n");
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
