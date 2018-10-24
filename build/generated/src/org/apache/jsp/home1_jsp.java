package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/tags/header.tag");
    _jspx_dependants.add("/WEB-INF/tags/body.tag");
    _jspx_dependants.add("/WEB-INF/tags/footer.tag");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/homeStyle.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">       \n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("    <div class=\"grid-container\">\n");
      out.write("        <div id = \"header\">\n");
      out.write("        <header>    \n");
      out.write("            ");
      if (_jspx_meth_t_header_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </header>\n");
      out.write("        </div>\n");
      out.write("        <!-----------------------------------------------------------menuleft--------------------------------------------------->\n");
      out.write("        <div id = \"menuleft\">menu</div>\n");
      out.write("        <!-------------------------------------------------------------main----------------------------------------------------->\n");
      out.write("        <div id = \"main\">\n");
      out.write("            ");
      if (_jspx_meth_t_body_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>  \n");
      out.write("        <!-----------------------------------------------------------menuright--------------------------------------------------->\n");
      out.write("        <div id = \"menuright\">right</div>\n");
      out.write("        <!-------------------------------------------------------------footer---------------------------------------------------->\n");
      out.write("        <div id = \"footer\">\n");
      out.write("            <footer>\n");
      out.write("                ");
      if (_jspx_meth_t_footer_0(_jspx_page_context))
        return;
      out.write(">             \n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </div>       \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    <script src=\"JS/Style.js\" type=\"text/javascript\"></script>    \n");
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

  private boolean _jspx_meth_t_header_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:header
    org.apache.jsp.tag.web.header_tag _jspx_th_t_header_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.header_tag.class) : new org.apache.jsp.tag.web.header_tag();
    _jspx_th_t_header_0.setJspContext(_jspx_page_context);
    _jspx_th_t_header_0.setJspBody(new home1_jspHelper( 0, _jspx_page_context, _jspx_th_t_header_0, null));
    _jspx_th_t_header_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_body_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:body
    org.apache.jsp.tag.web.body_tag _jspx_th_t_body_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.body_tag.class) : new org.apache.jsp.tag.web.body_tag();
    _jspx_th_t_body_0.setJspContext(_jspx_page_context);
    _jspx_th_t_body_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_footer_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:footer
    org.apache.jsp.tag.web.footer_tag _jspx_th_t_footer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.footer_tag.class) : new org.apache.jsp.tag.web.footer_tag();
    _jspx_th_t_footer_0.setJspContext(_jspx_page_context);
    _jspx_th_t_footer_0.setJspBody(new home1_jspHelper( 1, _jspx_page_context, _jspx_th_t_footer_0, null));
    _jspx_th_t_footer_0.doTag();
    return false;
  }

  private class home1_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public home1_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("                \n");
      out.write("            ");
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("                \n");
      out.write("                ");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
