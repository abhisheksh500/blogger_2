package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgotpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Forgot Password</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("            \n");
      out.write("            input[type=text], input[type=password] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("button {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("            @media screen and (max-width: 300px) {\n");
      out.write("    .cancelbtn, .signupbtn {\n");
      out.write("       width: 100%;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        <div align=\"center\" >\n");
      out.write("\n");
      out.write("<p style=\" font-weight:bold;   font-size:25px;\" >blogo<span style=\"color:#99d6ff; font-weight:bold; font-size:40px;\">point</span></p>\n");
      out.write("<p style=\" border:3px; border-color:#99d6ff; border-style:solid;\">The future of communication starts here </p>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            \n");
      out.write("            <label for=\"qstn\"><b>Security Question</b></label><br>\n");
      out.write("            <select>\n");
      out.write("  <option value=\"q1\">Pets Name</option>\n");
      out.write("  <option value=\"q2\">First Car</option>\n");
      out.write("  <option value=\"q3\">First Mobile Number</option>\n");
      out.write("  <option value=\"q4\">Best Friend</option>\n");
      out.write("            </select><br><br>\n");
      out.write("            \n");
      out.write("             <label for=\"ans\"><b>Security Answer</b></label>\n");
      out.write("    \n");
      out.write("             <input type=\"text\" placeholder=\"Enter Answer\" name=\"ans\" required><br>\n");
      out.write("             <button type=\"submit\" class=\"signupbtn\">Reset Pssword</button>\n");
      out.write("    \n");
      out.write("    <div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
