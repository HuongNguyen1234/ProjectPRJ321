package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class wrapper_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList<String> _jspx_nested = null;
    java.util.ArrayList<String> _jspx_at_begin = null;
    java.util.ArrayList<String> _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private javax.servlet.jsp.tagext.JspFragment header;
  private javax.servlet.jsp.tagext.JspFragment footer;

  public javax.servlet.jsp.tagext.JspFragment getHeader() {
    return this.header;
  }

  public void setHeader(javax.servlet.jsp.tagext.JspFragment header) {
    this.header = header;
  }

  public javax.servlet.jsp.tagext.JspFragment getFooter() {
    return this.footer;
  }

  public void setFooter(javax.servlet.jsp.tagext.JspFragment footer) {
    this.footer = footer;
  }

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    if( getHeader() != null ) {
      _jspx_page_context.setAttribute("header", getHeader());
}
    if( getFooter() != null ) {
      _jspx_page_context.setAttribute("footer", getFooter());
}

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/Style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("    <div class=\"grid-container\">\n");
      out.write("        <div id = \"header\">\n");
      out.write("        <header>    \n");
      out.write("                <!--slide show-->\n");
      out.write("        <div style=\"width: 100%;height: 50px;background-color: rgb(229, 99, 21); \">          \n");
      out.write("            <button onclick=\"document.getElementById('modalLogin').style.display='block'\" style=\"position:absolute;top: 5px;right:5px;width: 60px;height: 40px; background-color: #4CAF50; border-radius: 5px;\">Login</button>\n");
      out.write("            \n");
      out.write("            <div id=\"modalLogin\" class=\"modal\"> \n");
      out.write("                <form class=\"modal-content animate\" method=\"post\" action=\"Login\">\n");
      out.write("                  <div class=\"imgcontainer\">\n");
      out.write("                    <span onclick=\"document.getElementById('modalLogin').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("                    <img src=\"Image/avatar3.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("                    <center><h1 style=\"position: absolute;left:0;right:0;margin-left:auto;margin-right:auto;bottom: 0;color: white;\">Sign In</h1></center>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <div class=\"login-container-main\">\n");
      out.write("                      <table style=\"width: 100%;\">                        \n");
      out.write("                          <tr>\n");
      out.write("                              <td colspan=\"1\">\n");
      out.write("                                <div class=\"placeholder\">\n");
      out.write("                                    <div class=\"innerplaceholder\">\n");
      out.write("                                        <i class=\"fa fa-user-secret\" style=\"font-size: 20px;white-space: nowrap;\" > User</i>\n");
      out.write("                                        \n");
      out.write("                                    </div>                         \n");
      out.write("                                </div>\n");
      out.write("                              </td>\n");
      out.write("                              <td colspan=\"4\">\n");
      out.write("                                  <input class=\"inputtext\" type=\"text\" name=\"name\" required>          \n");
      out.write("                              </td>\n");
      out.write("                          </tr>                         \n");
      out.write("                          <tr>\n");
      out.write("                              <td colspan=\"1\">\n");
      out.write("                                <div class=\"placeholder\">\n");
      out.write("                                    <div class=\"innerplaceholder\" style=\"\">\n");
      out.write("                                        <i class=\"fa fa-lock\" style=\"font-size: 20px;white-space: nowrap; \"> Password</i>\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                </div>                                 \n");
      out.write("                              </td>\n");
      out.write("                              <td colspan=\"4\">\n");
      out.write("                                  <input class=\"inputtext\" type=\"password\" name=\"password\" id=\"password\" required>\n");
      out.write("                              </td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <td colspan=\"5\">\n");
      out.write("                                  <button type=\"submit\" class=\"login-button\" >Login</button>\n");
      out.write("                              </td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <td colspan=\"3\">\n");
      out.write("                                  <b style=\"color: white\">***</b>\n");
      out.write("                                <label class=\"switch\">                    \n");
      out.write("                                    <input type=\"checkbox\" id=\"showpass\" onclick=\"showPassword()\">\n");
      out.write("                                    <span class=\"slider round\" id=\"rounder\"></span>\n");
      out.write("                                </label>\n");
      out.write("                                  <b style=\"color: white\">abc</b>\n");
      out.write("                              </td>\n");
      out.write("                              <td colspan=\"2\">\n");
      out.write("                                <div style=\"float: right;margin: 20px 0;\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"remember\"> <b style=\"color: white\">Remember me</b>\n");
      out.write("                                </div>\n");
      out.write("                              </td>\n");
      out.write("                          </tr>\n");
      out.write("                      </table>                                    \n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <div class=\"login-container-end\">\n");
      out.write("                      <a href=\"\" class=\"login-end\">forgot password</a>\n");
      out.write("                  </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"slideshow-container\">          \n");
      out.write("        <div class=\"mySlides fade\">\n");
      out.write("            <img src=\"Image/flashbox.jpg\" style=\"width:100%;position: absolute;height: 500px;\" >\n");
      out.write("            \n");
      out.write("            <div class= \"flashPostContain\">\n");
      out.write("                <center><p class=\"flashPostHeader\" >Flash Post</p></center>  \n");
      out.write("                <p class=\"flashPostContent\">\n");
      out.write("                    I have bought many Major W I have bought many Major W \n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major WI have bought many Major W\n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major Wf\n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major Wf\n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major Wf\n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major Wf\n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major Wf\n");
      out.write("                </p>\n");
      out.write("                <center><button class=\"flashPostButton\" onclick=\"checkwin()\">Flash Post</button></center>             \n");
      out.write("            </div>                \n");
      out.write("            <div class=\"numbertext\">1 / 3</div>     \n");
      out.write("            <div class=\"text\">Caption Text</div>       \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"mySlides fade\">\n");
      out.write("            <img src=\"Image/flash.jpg\" style=\"width:100%;position: absolute;height: 500px;\">\n");
      out.write("            <div class= \"flashPostContain\">\n");
      out.write("                <center><p class=\"flashPostHeader\" >Flash Post</p></center>  \n");
      out.write("                <p class=\"flashPostContent\">\n");
      out.write("                    I have bought many Major W I have bought many Major W \n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major WI have bought many Major W\n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major Wf\n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major Wf\n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major Wf\n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major Wf\n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major Wf\n");
      out.write("                </p>\n");
      out.write("                <center><button class=\"flashPostButton\" style=\"\">Flash Post</button></center>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("          <div class=\"numbertext\">2 / 3</div>\n");
      out.write("          \n");
      out.write("          <div class=\"text\">Caption Two</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mySlides fade\">\n");
      out.write("            <img src=\"Image/backgroundtechnology.jpg\" style=\"width:100%;position: absolute;height: 500px;\">\n");
      out.write("            <div class= \"flashPostContain\">\n");
      out.write("                <center><p class=\"flashPostHeader\" >Flash Post</p></center>  \n");
      out.write("                <p class=\"flashPostContent\">\n");
      out.write("                    I have bought many Major W I have bought many Major W \n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major WI have bought many Major W\n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major Wf\n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major Wf\n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major Wf\n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major Wf\n");
      out.write("                    I have bought many Major WI have bought many Major WI have bought many Major Wf\n");
      out.write("                </p>\n");
      out.write("                <center><button class=\"flashPostButton\" >Flash Post</button></center>\n");
      out.write("            </div>            \n");
      out.write("          <div class=\"numbertext\">3 / 3</div>\n");
      out.write("          \n");
      out.write("          <div class=\"text\">Caption Three</div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"position: absolute;bottom: 10px;right: 50%;\" >\n");
      out.write("          <span class=\"dot\" onclick=\"currentSlide(1)\"></span> \n");
      out.write("          <span class=\"dot\" onclick=\"currentSlide(2)\"></span> \n");
      out.write("          <span class=\"dot\" onclick=\"currentSlide(3)\"></span> \n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <a class=\"prev\" onclick=\"plusSlides(-1)\">&#10094;</a>\n");
      out.write("        <a class=\"next\" onclick=\"plusSlides(1)\">&#10095;</a>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!--slide show-->    \n");
      out.write("        <nav>          \n");
      out.write("        <div class=\"navbar\">\n");
      out.write("          <div style=\"width: 150px;float: left;height: 10px;\">\n");
      out.write("              <img src=\"Image/logoflash.png\" style=\"z-index: 1;position: absolute;left: 50px;border: 2px solid wheat;z-index: 2;\" width=\"80\" height=\"50\">\n");
      out.write("          </div>\n");
      out.write("          <a href=\"#home\">Home</a>\n");
      out.write("          <a href=\"#about\">About</a>\n");
      out.write("          <div class=\"subnav\">\n");
      out.write("            <button class=\"subnavbtn\">Services <i class=\"fa fa-caret-down\"></i></button>\n");
      out.write("            <div class=\"subnav-content\">\n");
      out.write("              <a href=\"#bring\">Tra cứu</a>\n");
      out.write("              <a href=\"#deliver\">Tính giá cước</a>\n");
      out.write("              <a href=\"#package\">Mạng lưới</a>\n");
      out.write("              <a href=\"#package\">Bưu cục</a>\n");
      out.write("            </div>\n");
      out.write("          </div> \n");
      out.write("          <div class=\"subnav\">\n");
      out.write("            <button class=\"subnavbtn\">Contact <i class=\"fa fa-caret-down\"></i></button>\n");
      out.write("            <div class=\"subnav-content\">\n");
      out.write("              <a href=\"#link1\">Điền thông tin đơn hàng</a>\n");
      out.write("              <a href=\"#link2\">Cập nhật trạng thái hành trình</a>\n");
      out.write("              <a href=\"#link3\">Quét mã QR</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"dropdown \">\n");
      out.write("            <button class=\"dropbtn\">Dropdown \n");
      out.write("              <i class=\"fa fa-caret-down\"></i>\n");
      out.write("            </button>\n");
      out.write("<!--            <div class=\"dropdown-content\">\n");
      out.write("              <div class=\"header\">\n");
      out.write("                <h2>Mega Menu</h2>\n");
      out.write("              </div>   \n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"column\">\n");
      out.write("                  <h3>Category 1</h3>\n");
      out.write("                  <a href=\"#\">Link 1</a>\n");
      out.write("                  <a href=\"#\">Link 2</a>\n");
      out.write("                  <a href=\"#\">Link 3</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"column\">\n");
      out.write("                  <h3>Category 2</h3>\n");
      out.write("                  <a href=\"#\">Link 1</a>\n");
      out.write("                  <a href=\"#\">Link 2</a>\n");
      out.write("                  <a href=\"#\">Link 3</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"column\">\n");
      out.write("                  <h3>Category 3</h3>\n");
      out.write("                  <a href=\"#\">Link 1</a>\n");
      out.write("                  <a href=\"#\">Link 2</a>\n");
      out.write("                  <a href=\"#\">Link 3</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>-->\n");
      out.write("          </div>      \n");
      out.write("        </div>           \n");
      out.write("        </nav>        \n");
      out.write("        </header>\n");
      out.write("        </div>\n");
      out.write("        <!-----------------------------------------------------------menuleft--------------------------------------------------->\n");
      out.write("        <div id = \"menuleft\">menu</div>\n");
      out.write("        <!-------------------------------------------------------------main----------------------------------------------------->\n");
      out.write("        <div id = \"main\">\n");
      out.write("        <section>\n");
      out.write("            <div style=\"padding:0 16px\">\n");
      out.write("            <h3>Subnav/dropdown menu inside a Navigation Bar</h3>\n");
      out.write("            <p>Hover over the \"about\", \"services\" or \"partners\" link to see the sub navigation menu.</p>\n");
      out.write("            <div style=\"padding:0 16px\">\n");
      out.write("            <h3>Subnav/dropdown menu inside a Navigation Bar</h3>\n");
      out.write("            <p>Hover over the \"about\", \"services\" or \"partners\" link to see the sub navigation menu.</p>\n");
      out.write("            <div style=\"padding:0 16px\">\n");
      out.write("                <h3>Subnav/dropdown menu inside a Navigation Bar</h3>\n");
      out.write("                <p>Hover over the \"about\", \"services\" or \"partners\" link to see the sub navigation menu.</p>\n");
      out.write("              </div>   \n");
      out.write("                  <div style=\"padding:0 16px\">\n");
      out.write("                <h3>Subnav/dropdown menu inside a Navigation Bar</h3>\n");
      out.write("                <p>Hover over the \"about\", \"services\" or \"partners\" link to see the sub navigation menu.</p>\n");
      out.write("              </div>   \n");
      out.write("                  <div style=\"padding:0 16px\">\n");
      out.write("                <h3>Subnav/dropdown menu inside a Navigation Bar</h3>\n");
      out.write("                <p>Hover over the \"about\", \"services\" or \"partners\" link to see the sub navigation menu.</p>\n");
      out.write("              </div>   \n");
      out.write("                  <div style=\"padding:0 16px\">\n");
      out.write("                <h3>Subnav/dropdown menu inside a Navigation Bar</h3>\n");
      out.write("                <p>Hover over the \"about\", \"services\" or \"partners\" link to see the sub navigation menu.</p>\n");
      out.write("              </div>   \n");
      out.write("            <div style=\"padding:0 16px\">\n");
      out.write("                <h3>Subnav/dropdown menu inside a Navigation Bar</h3>\n");
      out.write("                <p>Hover over the \"about\", \"services\" or \"partners\" link to see the sub navigation menu.</p>\n");
      out.write("              </div>   \n");
      out.write("            </div>   \n");
      out.write("            </div>    \n");
      out.write("            <div class=\"msgBox\">\n");
      out.write("            <div class=\"innerBox\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <section>\n");
      out.write("                \n");
      out.write("        </section>    \n");
      out.write("        <section>\n");
      out.write("                \n");
      out.write("        </section>\n");
      out.write("        <section>\n");
      out.write("                \n");
      out.write("        </section>\n");
      out.write("        <section>\n");
      out.write("                \n");
      out.write("        </section>\n");
      out.write("            \n");
      out.write("        </div>  \n");
      out.write("        <!-----------------------------------------------------------menuright--------------------------------------------------->\n");
      out.write("        <div id = \"menuright\">right</div>\n");
      out.write("        <!-------------------------------------------------------------footer---------------------------------------------------->\n");
      out.write("        <div id = \"footer\">\n");
      out.write("            <footer>\n");
      out.write("                footer\n");
      out.write("                \n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </div>       \n");
      out.write("<!--        <script type=\"text/javascript\">\n");
      out.write("            function showPassword() {\n");
      out.write("                var password = document.getElementById(\"password\");\n");
      out.write("                var showPass = document.getElementById(\"showpass\");\n");
      out.write("                if(showPass.checked){\n");
      out.write("                    password.type = \"text\";\n");
      out.write("                } else {\n");
      out.write("                    password.type = \"password\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function checkwin(){\n");
      out.write("                alert(\"fuck\");\n");
      out.write("                alert(document.getElementById(\"img1\").style.height);\n");
      out.write("            }\n");
      out.write("        </script>-->\n");
      out.write("    <script src=\"JS/Style.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}
