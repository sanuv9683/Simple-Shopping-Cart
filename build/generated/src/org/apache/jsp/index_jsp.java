package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Cart;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Sanu-Shopping-Cart</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/boostrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-theme.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/newcss.css\">\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var total = 0;\n");
      out.write("            var oldValue = 0;\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"navbar navbar-fixed-top navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\"> \n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <div class=\"navbar-brand\">Sanu-Shopping Cart</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\" style=\"margin-top: 10px\"></div>\n");
      out.write("        <div class=\"row\" style=\"margin-top: 60px\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <!--<div class=\"col-md-1\"></div>-->\n");
      out.write("                <div class=\"col-md-4 ssd\">\n");
      out.write("                    <h2>Item Table</h2>\n");
      out.write("                    <table class=\"table table-hover table-bordered\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Item Name</th>\n");
      out.write("                                <th>Item Price</th>\n");
      out.write("                                <th>Buy Item</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Mouse</td>\n");
      out.write("                                <td>350</td>\n");
      out.write("                                <td><a href=\"cart?item=Mouse&price=350&qty=0&del=false\">Buy This</a></td>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>KeyBoard</td>\n");
      out.write("                                <td>250</td>\n");
      out.write("                                <td><a href=\"cart?item=KeyBoard&price=250&qty=0&del=false\">Buy This</a></td>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>WebCam</td>\n");
      out.write("                                <td>1550</td>\n");
      out.write("                                <td><a href=\"cart?item=WebCam&price=1550&qty=0&del=false\">Buy This</a></td>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Printer</td>\n");
      out.write("                                <td>3350</td>\n");
      out.write("                                <td><a href=\"cart?item=Printer&price=3350&qty=0&del=false\">Buy This</a></td>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Moniter</td>\n");
      out.write("                                <td>20000</td>\n");
      out.write("                                <td><a href=\"cart?item=Moniter&price=20000&qty=0&del=false\">Buy This</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-1\"></div>\n");
      out.write("                <!--//////////////-->\n");
      out.write("                <!--<div class=\"col-md-1\"></div>-->\n");
      out.write("                <div class=\"col-md-5\" id=\"sd\">\n");
      out.write("                    <h2>Cart</h2>\n");
      out.write("                    <table class=\"table table-striped table-bordered\" id=\"tblCaret\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Item Name</th>\n");
      out.write("                                <th>Item Quntity</th>\n");
      out.write("                                <th>Item Price</th>\n");
      out.write("                                <th>Sub Total</th>\n");
      out.write("                                <th>Delete</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row fi\">\n");
      out.write("                        <div class=\"jumbotron\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"container-fluid\">\n");
      out.write("                                    <div class=\"total\">\n");
      out.write("                                        Total :  <span id=\"sds\"></span>Rs.\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"container-fluid\">\n");
      out.write("                                    <div class=\"total\">\n");
      out.write("                                       Items On Cart : <span id=\"spnTotalItems\"><span>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");

                        ArrayList<Cart> list = (ArrayList) request.getSession().getAttribute("cart");
                        if (list == null) {
                            list = new ArrayList<Cart>();
                        }
                        for (int i = 0; i < list.size(); i++) {
                            System.out.print(list.get(i).getItemPrice());
                    
      out.write("\n");
      out.write("                    <script type=\"text/javascript\">\n");
      out.write("                        {\n");
      out.write("                            var tbl = document.getElementById(\"tblCaret\").tBodies[0];\n");
      out.write("                            var row = tbl.insertRow(-1);\n");
      out.write("                            row.onclick = function (evt) {\n");
      out.write("                                this.cells[1].childNodes[0].focus();\n");
      out.write("                            };\n");
      out.write("                            var cell0 = row.insertCell(0);\n");
      out.write("                            cell0.innerHTML = \"");
      out.print( list.get(i).getItemname());
      out.write("\";\n");
      out.write("                            var cell1 = row.insertCell(1);\n");
      out.write("                            var txt = document.createElement(\"input\");\n");
      out.write("                            txt.setAttribute(\"txtProductName\", cell0.innerHTML);\n");
      out.write("                            txt.className = \"qtyTxt\";\n");
      out.write("                            txt.maxLength = 2;\n");
      out.write("                            txt.value = \"");
      out.print( list.get(i).getQuntity());
      out.write("\";\n");
      out.write("                            txt.onfocus = function () {\n");
      out.write("                                oldValue = this.value;\n");
      out.write("                                this.select();\n");
      out.write("                            };\n");
      out.write("                            txt.onblur = function () {\n");
      out.write("                                if (this.value.trim().length === 0 || parseInt(this.value.trim()) === 0) {\n");
      out.write("                                    this.value = oldValue;\n");
      out.write("                                } else {\n");
      out.write("                                    if (this.value !== oldValue.toString())\n");
      out.write("                                        window.open(\"cart?item=\" + this.getAttribute(\"txtProductName\") + \"&price=\" + this.value.trim() + \"&qty=\" + this.value.trim(), \"_self\");\n");
      out.write("                                }\n");
      out.write("                            };\n");
      out.write("                            txt.onkeyup = function (evt) {\n");
      out.write("                                var reg = new RegExp(\"[^0-9]\", \"g\");\n");
      out.write("                                this.value = this.value.replace(reg, \"\");\n");
      out.write("                                if (evt.keyCode === 13) {\n");
      out.write("                                    this.blur();\n");
      out.write("                                }\n");
      out.write("                            };\n");
      out.write("                            cell1.appendChild(txt);\n");
      out.write("                            var cell2 = row.insertCell(2);\n");
      out.write("                            cell2.innerHTML = \"");
      out.print( list.get(i).getItemPrice());
      out.write("\";\n");
      out.write("                            var cell3 = row.insertCell(3);\n");
      out.write("                            total += parseInt(txt.value) * parseInt(cell2.innerHTML);\n");
      out.write("                            cell3.innerHTML = parseInt(txt.value) * parseInt(cell2.innerHTML) + \"\";\n");
      out.write("\n");
      out.write("                            document.getElementById(\"spnTotalItems\").innerHTML = \"");
      out.print( i + 1);
      out.write("\";\n");
      out.write("                            document.getElementById(\"sds\").innerHTML = total;\n");
      out.write("                            var cell4 = row.insertCell(4);\n");
      out.write("                            var tx = document.createElement(\"button\");\n");
      out.write("                            tx.setAttribute(\"itemName\", cell0.innerHTML);\n");
      out.write("                            tx.setAttribute(\"itemPrice\", cell2.innerHTML);\n");
      out.write("\n");
      out.write("                            tx.className = \"qtyTxt\";\n");
      out.write("                            tx.maxLength = 2;\n");
      out.write("                            tx.value = \"");
      out.print( list.get(i).getQuntity());
      out.write("\";\n");
      out.write("                            tx.onfocus = function () {\n");
      out.write("                                oldValue = this.value;\n");
      out.write("                                this.select();\n");
      out.write("                            };\n");
      out.write("                            tx.onblur = function () {\n");
      out.write("                                if (this.value.trim().length === 0 || parseInt(this.value.trim()) === 0) {\n");
      out.write("                                    this.value = oldValue;\n");
      out.write("                                } else {\n");
      out.write("                                    if (this.value !== oldValue.toString())\n");
      out.write("                                        window.open(\"cart?item=\" + this.getAttribute(\"txtProductName\") + \"&price=\" + this.value.trim() + \"&qty=\" + this.value.trim(), \"_self\");\n");
      out.write("                                }\n");
      out.write("                            };\n");
      out.write("                            tx.onkeyup = function (evt) {\n");
      out.write("                                var reg = new RegExp(\"[^0-9]\", \"g\");\n");
      out.write("                                this.value = this.value.replace(reg, \"\");\n");
      out.write("                                if (evt.keyCode === 13) {\n");
      out.write("                                    this.blur();\n");
      out.write("                                }\n");
      out.write("                            };\n");
      out.write("                            cell4.appendChild(tx);\n");
      out.write("                            tx.onclick = function () {\n");
      out.write("                                var last = this.value;\n");
      out.write("                                var temp = last - 1;\n");
      out.write("                                window.open(\"cart?item=\" + this.getAttribute(\"itemName\") + \"&price=\" + 500 + \"&qty=\" + temp + \"&del=true\", \"_self\");\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    </script>\n");
      out.write("\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-1\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"navbar navbar-fixed-bottom navbar-inverse\">\n");
      out.write("            <footer>Developed By Sanu Vithanage</footer>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
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
