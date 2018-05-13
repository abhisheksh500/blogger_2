package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("* {box-sizing: border-box}\n");
      out.write("/* Full-width input fields */\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 15px;\n");
      out.write("    margin: 5px 0 22px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: none;\n");
      out.write("    background: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add a background color when the inputs get focus */\n");
      out.write("input[type=text]:focus, input[type=password]:focus {\n");
      out.write("    background-color: #ddd;\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Set a style for all buttons */\n");
      out.write("button {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 100%;\n");
      out.write("    opacity: 0.9;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("    opacity:1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Extra styles for the cancel button */\n");
      out.write(".cancelbtn {\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Float cancel and signup buttons and add an equal width */\n");
      out.write(".cancelbtn, .signupbtn {\n");
      out.write("  float: left;\n");
      out.write("  width: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add padding to container elements */\n");
      out.write(".container {\n");
      out.write("    padding: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The Modal (background) */\n");
      out.write(".modal {\n");
      out.write("    display: none; /* Hidden by default */\n");
      out.write("    position: fixed; /* Stay in place */\n");
      out.write("    z-index: 1; /* Sit on top */\n");
      out.write("    left: 0;\n");
      out.write("    top: 0;\n");
      out.write("    width: 100%; /* Full width */\n");
      out.write("    height: 100%; /* Full height */\n");
      out.write("    overflow: auto; /* Enable scroll if needed */\n");
      out.write("    background-color: #474e5d;\n");
      out.write("    padding-top: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Modal Content/Box */\n");
      out.write(".modal-content {\n");
      out.write("    background-color: #fefefe;\n");
      out.write("    margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */\n");
      out.write("    border: 1px solid #888;\n");
      out.write("    width: 80%; /* Could be more or less, depending on screen size */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the horizontal ruler */\n");
      out.write("hr {\n");
      out.write("    border: 1px solid #f1f1f1;\n");
      out.write("    margin-bottom: 25px;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("/* The Close Button (x) */\n");
      out.write(".close {\n");
      out.write("    position: absolute;\n");
      out.write("    right: 35px;\n");
      out.write("    top: 15px;\n");
      out.write("    font-size: 40px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    color: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".close:hover,\n");
      out.write(".close:focus {\n");
      out.write("    color: #f44336;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".clearfix::after {\n");
      out.write("    content: \"\";\n");
      out.write("    clear: both;\n");
      out.write("    display: table;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change styles for cancel button and signup button on extra small screens */\n");
      out.write("@media screen and (max-width: 300px) {\n");
      out.write("    .cancelbtn, .signupbtn {\n");
      out.write("       width: 100%;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("    <div align=\"center\" >\n");
      out.write("\n");
      out.write("<p style=\" font-weight:bold;   font-size:25px;\" >blogo<span style=\"color:#99d6ff; font-weight:bold; font-size:40px;\">point</span></p>\n");
      out.write("<p style=\" border:3px; border-color:#99d6ff; border-style:solid;\">The future of communication starts here </p>\n");
      out.write("    </div>\n");
      out.write("    <form class=\"modal-content\" action=\"Controller\" method=\"post\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h1>Sign Up</h1>\n");
      out.write("      <p>Please fill in this form to create an account.</p>\n");
      out.write("      <hr>\n");
      out.write("      <label for=\"nam\"><b>Name</b></label>\n");
      out.write("    \n");
      out.write("    <input type=\"text\" placeholder=\"Enter Name\" name=\"username\" required>\n");
      out.write("      \n");
      out.write("     <label for=\"gender\"><b>Gender</b></label><br>\n");
      out.write("     \n");
      out.write("  <input type=\"radio\" name=\"gender\" value=\"male\" checked> Male<br>\n");
      out.write("  <input type=\"radio\" name=\"gender\" value=\"female\"> Female<br>\n");
      out.write("  <input type=\"radio\" name=\"gender\" value=\"other\"> Other<br><br>\n");
      out.write("  \n");
      out.write("        <label for=\"bday\"><b>  Birthday:</b></label><br>\n");
      out.write("        <input type=\"text\" name=\"bday\"><br><br>\n");
      out.write("      \n");
      out.write("      <label for=\"email\"><b>Email</b></label>\n");
      out.write("      <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\n");
      out.write("\n");
      out.write("      <label for=\"psw\"><b>Password</b></label>\n");
      out.write("      <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n");
      out.write("\n");
      out.write("      <label for=\"psw-repeat\"><b>Confirm Password</b></label>\n");
      out.write("      <input type=\"password\" placeholder=\"Confirm Password\" name=\"psw-repeat\" required>\n");
      out.write("      <label for=\"contact\"><b>Contact No.</b></label>\n");
      out.write("      <input type=\"text\" placeholder=\"Enter Contact Number\" name=\"contact\" required/>\n");
      out.write("             \n");
      out.write("             <label for=\"qstn\"><b>Security Question</b></label><br>\n");
      out.write("                   \n");
      out.write("\n");
      out.write("            <select>\n");
      out.write("  <option value=\"q1\" name=\"ques\">Pets Name</option>\n");
      out.write("  <option value=\"q2\" name=\"ques\">First Car</option>\n");
      out.write("  <option value=\"q3\" name=\"ques\">First Mobile Number</option>\n");
      out.write("  <option value=\"q4\" name=\"ques\">Best Friend</option>\n");
      out.write("            </select><br><br>\n");
      out.write("            \n");
      out.write("             <label for=\"ans\"><b>Security Answer</b></label>\n");
      out.write("    \n");
      out.write("    <input type=\"text\" placeholder=\"Enter Answer\" name=\"ans\" required/>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("           \n");
      out.write("      \n");
      out.write("      <br>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("      \n");
      out.write("      \n");
      out.write("\n");
      out.write("      <p>By creating an account you agree to our <a href=\"#\" style=\"color:dodgerblue\">Terms & Privacy</a>.</p>\n");
      out.write("\n");
      out.write("      <div class=\"clearfix\">\n");
      out.write("        <button type=\"button\" onclick=\"document.getElementById('id01').style.display='none'\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("        <button type=\"submit\" class=\"signupbtn\">Sign Up</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Get the modal\n");
      out.write("var modal = document.getElementById('id01');\n");
      out.write("\n");
      out.write("// When the user clicks anywhere outside of the modal, close it\n");
      out.write("window.onclick = function(event) {\n");
      out.write("    if (event.target == modal) {\n");
      out.write("        modal.style.display = \"none\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
