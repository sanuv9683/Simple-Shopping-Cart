/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import controller.CartController;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;

/**
 *
 * @author Sanu Vithanage
 */
public class CartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        try {
            String item = req.getParameter("item");
            double price = Integer.parseInt(req.getParameter("price"));
            int qun = Integer.parseInt(req.getParameter("qty"));
            boolean del = Boolean.parseBoolean(req.getParameter("del"));

            HttpSession session = req.getSession();
            ArrayList<Cart> cartA = (ArrayList<Cart>) session.getAttribute("cart");

            if (cartA == null) {
                cartA = new ArrayList<Cart>();
                session.setAttribute("cart", cartA);
            }

            CartController cartCtr = new CartController(cartA);
            if (del == true) {
                if (qun == 0) {
                    cartCtr.removeItemFromCart(item, qun);
                } else {
                    cartCtr.reduseByOne(item, qun);
                }

            } else if (qun == 0) {
                cartCtr.addToCart(item, price, 1, true, del);
            } else {
                cartCtr.addToCart(item, price, qun, false, del);
            }
            RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
            rd.forward(req, resp);

        } finally {
            out.close();
        }
    }

}
