package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BoardDao;
import dao.ManagerDao;
import dto.Board;
import dto.Manager;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("*.checkSwing")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatcherServlet() {
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
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		String contextPath = request.getContextPath();
		if (path.equals("/main.checkSwing")) {								// 메인화면
			response.sendRedirect(contextPath + "/index.jsp");
		} else if (path.equals("/PitcherInfo.checkSwing")) {				// 선수정보조회 - 투수정보 조회
			response.sendRedirect(contextPath + "/PlayerInfo/PitcherInfoForm.jsp");
		} else if (path.equals("/HitterInfo.checkSwing")) {					// 선수정보조회 - 타자정보 조회
			response.sendRedirect(contextPath + "/PlayerInfo/HitterInfoForm.jsp");
		} else if (path.equals("/Lotte.checkSwing")) {						// 팀정보조회 - 롯데 자이언츠
			response.sendRedirect(contextPath + "/TeamInfo/LotteForm.jsp");
		} else if (path.equals("/FreeBoard.checkSwing")) {					// 자유게시판
			HttpSession session = request.getSession();
		    Manager manager = (Manager) session.getAttribute("manager");
		    // 로그인 여부 확인
			if (manager == null) {
		        // 팝업 메시지를 띄우는 JavaScript 코드 생성
				String boardPopupScript = "<script>alert('로그인이 필요합니다.');"
                        + "window.location.href='" + contextPath + "/login.checkSwing';</script>";
				response.setContentType("text/html;charset=UTF-8");
                response.getWriter().println(boardPopupScript);
		        return; // 로그인 페이지로 이동했으므로 더 이상 진행하지 않도록 메서드 종료
		    }			
			response.sendRedirect(contextPath + "/FreeBoard/FreeBoardForm.jsp");
						
		} else if (path.equals("/view.checkSwing")) {						// 자유게시판 - view
			int num = Integer.parseInt(request.getParameter("num"));
			BoardDao dao = BoardDao.getInstance();
			Board board = dao.selectOne(num, true);
			// 글 제목과 내용이 웹 페이지에 올바르게 출력되도록 
		    // 공백과 줄 바꿈 처리
			String title = board.getTitle().replace(" ", "&nbsp;");
			board.setTitle(title);
		    
		    String content = board.getContent()
		    		 .replace(" ", "&nbsp;").replace("\n", "<br>");
		    board.setContent(content);
			
			// 포워딩 작업
			request.setAttribute("bd", board);
			RequestDispatcher dispatcher
			    = request.getRequestDispatcher("../FreeBoard/view.jsp");
			dispatcher.forward(request, response);
		} else if (path.equals("/login.checkSwing")) {					// Util - Login 눌렀을 때
			response.sendRedirect(contextPath + "/util/LoginForm.jsp");
		} else if (path.equals("/join.checkSwing")) {					// Util - Join 눌렀을 때
			response.sendRedirect(contextPath + "/util/JoinForm.jsp");
		} else if (path.equals("/changeInfo.checkSwing")) {					// Util - 정보변경 눌렀을 때
			response.sendRedirect(contextPath + "/util/changeInfoForm.jsp");
		} else if (path.equals("/managerUpdate.checkSwing")) {					// Util - 정보변경 확인
			response.sendRedirect(contextPath + "/util/managerUpdate.jsp");
		} else if (path.equals("/checkLogin.checkSwing")) {						// 로그인 체크
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			String ck = request.getParameter("ckMemory");
			
			if (ck != null && ck.equals("on")) { // 체크가 켜졌을 때
			    // 쿠키에 사용자 정보 저장
				Cookie idCookie = new Cookie("rememberedId", id);
		        idCookie.setMaxAge(60); // 쿠키의 유효 기간 설정 (초 단위)
		        response.addCookie(idCookie);
			} else { // 체크가 꺼졌을 때
			    // 기존 쿠키 삭제
				Cookie idCookie = new Cookie("rememberedId", "");
			    idCookie.setMaxAge(0); // 쿠키 삭제
			    response.addCookie(idCookie);
			}

			Manager manager 
			     = ManagerDao.getInstance().selectForLogin(id, password);
			if (manager != null) {
				HttpSession session = request.getSession();
				session.setAttribute("manager", manager);
				response.sendRedirect("main.checkSwing");
			} else {
				String checkLoginPopupScript = "<script>alert('아이디 혹은 이메일 정보를 확인해주세요.');"
                        + "window.location.href='" + contextPath + "/login.checkSwing';</script>";
				response.setContentType("text/html;charset=UTF-8");
				response.getWriter().println(checkLoginPopupScript);
				// 로그인 실패 시 메시지를 설정
			}
			
		} else if (path.equals("/logout.checkSwing")) {
			HttpSession session = request.getSession(false);
			session.invalidate();
			response.sendRedirect(contextPath + "/index.jsp");	
			
		} else if (path.equals("/admin.checkSwing")) {						// 자유게시판 - view
			response.sendRedirect(contextPath + "/administrator/adminForm.jsp");
		}
		
		
		else if (path.equals("/updateMgrPopup.checkSwing")) {
			int num = Integer.parseInt(request.getParameter("num"));
			ManagerDao dao = ManagerDao.getInstance();
			Manager manager = dao.selectManager(num, true);
			
			
			request.setAttribute("updateManager", manager);
			RequestDispatcher dispatcher
			    = request.getRequestDispatcher("../administrator/updateAdminForm.jsp");
			dispatcher.forward(request, response);
		}
	}

}