package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class infoOfPackage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/Style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\" integrity=\"sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/infoStyle.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>       \n");
      out.write("        <div  class=\"container\">\n");
      out.write("            <div  class=\"row\">\n");
      out.write("                <div  class=\"col-sm-9\" >\n");
      out.write("                    <div class=\"div-1\"> \n");
      out.write("                        <table class=\"table\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th ><i class=\"fas fa-barcode\"></i>&nbsp;Mã Sản Phẩm <br>\n");
      out.write("                                    CB05555555\n");
      out.write("                                </th>\n");
      out.write("                                <th><i class=\"fas fa-qrcode\"></i>&nbsp;Mã QR <br>\n");
      out.write("                                </th> \n");
      out.write("                                <th><i class=\"far fa-check-circle\"></i>&nbsp; Trạng thái<br>\n");
      out.write("                                </th>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"div-2\">\n");
      out.write("                        <table class=\"table2\" >\n");
      out.write("                            <tr>\n");
      out.write("                                <td> Bưu Cục Gửi : 10 - Hà Nội</td>\n");
      out.write("                                <td> Bưu Cục Nhận: 920000 - Rạch Giá    </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    Thời gian chuyển đi : 30/1/2012 \n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                   Thời gian đến nơi : 30/4/2018\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td colspan=\"2\" >\n");
      out.write("                                   Người Nhận : Nguyễn Thu Hường\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                              <tr>\n");
      out.write("                                <td colspan=\"2\" >\n");
      out.write("                                    Thành Tiền : 320.000đ\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <h3>Hiện Trạng Gói Hàng</h3>\n");
      out.write("                        <hr style=\"border-top: dotted 3px;\" /> \n");
      out.write("                        \n");
      out.write("<!--                        Chỗ này để điền trạng thái gói hàng-->\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div >\n");
      out.write("                <div class=\"col-sm-3\" >\n");
      out.write("                    <iframe id =\"map\" src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!\n");
      out.write("                            1d3723.8977453149246!2d105.83245751424809!3d21.036777085994046!\n");
      out.write("                            2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!\n");
      out.write("                            1s0x3135aba15ec15d17%3A0x620e85c2cfe14d4c!2zTMSDbmcgSOG7kyBDaMOtIE1pbmg!\n");
      out.write("                            5e0!3m2!1svi!2sus!4v1501056274257\" ></iframe>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"JS/style.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
