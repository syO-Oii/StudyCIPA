package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDao;
import dto.Board;

/**
 * Servlet implementation class DispatcherServlet
 */


// @WebServlet("*.do")
// ㄴ>이렇게 작성하면 .do 앞에 어떤 내용이 와도 인식이 가능하기 때문에 원래 주소를 숨길 수 있다.
//혹은 WEB-INF - web.xml 파일 내에서 세팅을 해줄 수 있다.

public class DispatcherServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatcherServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String uri = request.getRequestURI();
		System.out.println("uri : " + uri);
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println(path);
		
		if(path.equals("/view.do")) {
			System.out.println("view 처리");
			int num = Integer.parseInt(request.getParameter("num")); 
			BoardDao dao = BoardDao.getInstance();
			Board board = dao.selectOne(num, true);
			
			request.setAttribute("board", board);
		    RequestDispatcher dispatcher 
		       = request.getRequestDispatcher("/WEB-INF/view/view.jsp");
		    dispatcher.forward(request, response);
		} else if (path.equals("/list.do")) {
			System.out.println("list 처리");
		}
	}

}
