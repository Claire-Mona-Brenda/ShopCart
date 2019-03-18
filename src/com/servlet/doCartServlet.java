package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.po.GoodInfo;
import com.po.ShopCart;

/**
 * Servlet implementation class doCartServlet
 */
@WebServlet("/doCartServlet")
public class doCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ShopCart myCart=new ShopCart();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public doCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		if(action==null){
			action="";
		}
		if(action.equals("buy")){
			buy(request,response);
		}
		else if(action.equals("remove")){
			remove(request,response);
		}
		else if(action.equals("clear")){
			clear(request,response);
		}
	}
	private void clear(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException,IOException{
		// TODO Auto-generated method stub
		myCart.clearCart();
		response.sendRedirect("shopCart.jsp");
		
	}

	private void remove(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException,IOException{
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		myCart=(ShopCart)session.getAttribute("myCart");
		String name=new String(request.getParameter("name").getBytes("ISO8859_1"),"utf-8");
		myCart.removeItem(name);
		response.sendRedirect("shopCart.jsp");
		
	}

	private void buy(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		HttpSession session=request.getSession();
		ArrayList<GoodInfo>goodsList=(ArrayList)session.getAttribute("goodsList");
		int id=Integer.parseInt(request.getParameter("id"));
		GoodInfo single=goodsList.get(id);
		single.setId(id);
		myCart=(ShopCart)session.getAttribute("myCart");
		if(myCart==null){
			myCart=new ShopCart();
		}
		myCart.addItem(single);
		session.setAttribute("myCart", myCart);
		response.sendRedirect("show.jsp");
	}

}
