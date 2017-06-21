package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        \n");
      out.write("        <link href='css/my.css' rel='stylesheet' type='text/css'/>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\" src=\"js/chkPwd.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <span class='div1'>NYIT Student Center</span>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("        \n");
      out.write("                \n");
      out.write("                <div class=\"div5\">\n");
      out.write("                    <div class=\"div6\">Sign up</div>\n");
      out.write("                    <div class=\"div7\">It's free and always will be.</div>\n");
      out.write("                    <form action=\"/NYIT1/sighupCL\" method=\"post\" autocomplete=\"off\">\n");
      out.write("                        <span><input type=\"text\" name=\"fname\" placeholder=\"Firstname\" style=\"font-size: 25px; width: 200px;height: 40px;\"></span>\n");
      out.write("                        <span class=\"div8\"><input type=\"text\" name=\"lname\" placeholder=\"Lastname\" style=\"font-size: 25px; width: 200px;height: 40px\"></span>\n");
      out.write("                        \n");
      out.write("                        <div style=\"height: 30px;font-size: 1px\">.</div>\n");
      out.write("                        \n");
      out.write("                        <span><input type=\"text\" name=\"id\" placeholder=\"NYIT_ID\" style=\"font-size: 25px; width: 160px;height: 40px\"></span>\n");
      out.write("                        <span class=\"div9\"><input type=\"password\" name=\"password\" placeholder=\"Password\" onblur=\"chkpwd(this)\" style=\"font-size: 25px; width: 240px;height: 40px\">\n");
      out.write("                        <span id=\"chkResult\"></span>\n");
      out.write("                        </span>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div style=\"height: 30px;font-size: 1px\">.</div>\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <select  name=\"major\" style=\"font-size: 25px; width: 240px;height: 40px;color: gray\">\n");
      out.write("                                <option selected>-Major-</option>\n");
      out.write("                                <option value=\"Computer science\">Computer science</option>\n");
      out.write("                                <option value=\"Business\">Business</option>\n");
      out.write("                                <option value=\"Telecommuincation\">Telecommuincation</option>\n");
      out.write("                                <option value=\"Archetecture\">Archetecture</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"height: 30px;font-size: 1px\">.</div>\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <select name=\"country\" style=\"font-size: 25px; width: 240px;height: 40px;color: gray\">\n");
      out.write("                        <option selected>-Country-</option>\n");
      out.write("                        <option value=\"United States\">United States</option>\n");
      out.write("                        <option value=\"United Kingdom\">United Kingdom</option>\n");
      out.write("                        <option value=\"Canada\">Canada</option>\n");
      out.write("                        <option value=\"Serbia\">Serbia</option>\n");
      out.write("                        <option value=\"Italy\">Italy</option>\n");
      out.write("                        <option value=\"China\">China</option>\n");
      out.write("                        <option value=\"Japan\">Japan</option>\n");
      out.write("                        <option value=\"North Korea\">North Korea</option>\n");
      out.write("                        <option value=\"India\">India</option>\n");
      out.write("                        <option value=\"Korea\">South Korea</option>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"height: 30px;font-size: 1px\">.</div>\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <input type=\"radio\" name=\"gender\" value=\"male\" style=\" width: 30px;height: 20px\"> <span style=\"color:teal;font-size: 20px\">Female</span>\n");
      out.write("                            <input type=\"radio\" name=\"gender\" value=\"female\" style=\" width: 30px;height: 20px\"> <span style=\"color:teal;font-size: 20px\">Male</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"height: 30px;font-size: 1px\">.</div>\n");
      out.write("                        \n");
      out.write("                        <span style=\"color: grey\">By clicking Sign Up, you agree to our Terms and that you have read our Data Use Policy, including our Cookie Use.</span>\n");
      out.write("                        <div style=\"height: 30px;font-size: 1px\">.</div>\n");
      out.write("                        \n");
      out.write("                        <input type=\"submit\" value=\"Sigh Up\" style=\"width: 150px;height: 30px;background-color: green;color: whitesmoke\">                  \n");
      out.write("                    </form>    \n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("                \n");
      out.write("    </body>\n");
      out.write("</html> \n");
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
