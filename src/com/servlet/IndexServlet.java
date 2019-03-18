package com.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import com.po.GoodInfo;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ArrayList<GoodInfo> goodsList=new ArrayList<GoodInfo>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
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
		HttpSession session=request.getSession();
		session.setAttribute("goodsList", goodsList);
		response.sendRedirect("show.jsp");
	}
	static{
		String[] names={"Vero Mosa2017冬季新款英伦风两穿轻薄中长款风衣","Vero Moda2017秋季新款印花V领修身A摆连衣裙"
						,"Vero Moda斗篷两件套针织连衣裙","Vero Moda2017秋季新款露肩罗纹领修身针织连衣裙"
						,"Vero Moda2017冬季新款网纱圆领翻领包臀针织连衣裙","Vero Moda2017秋季新款千鸟格九分直通休闲裤"};
		float[] prices={749,699,539.4f,699,549,449};
		for(int i=0;i<6;i++){
			GoodInfo single=new GoodInfo();
			single.setName(names[i]);
			single.setPrice(prices[i]);
			single.setNum(1);
			single.setId(i);
			goodsList.add(single);
		}
	}

}
