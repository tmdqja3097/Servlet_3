package com.iu.notice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iu.member.MemberDTO;
import com.iu.point.PointDTO;

/**
 * Servlet implementation class NoticeController
 */
@WebServlet("/NoticeController")
public class NoticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NoticeService noticeService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NoticeController() {
		super();
		noticeService = new NoticeService();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 한글 Encoding 처리
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		// pathInfo
		String command = request.getPathInfo();

		// Method 형식
		String method = request.getMethod();

		// Forward->true , Redirect->false 선택
		boolean check = true;

		// URL path를 담을 변수
		String path = "";

		try {
			if (command.equals("/noticeList")) {
				ArrayList<NoticeDTO> ar = noticeService.noticeList();
				request.setAttribute("list", ar);

				path = "../WEB-INF/views/notice/noticeList.jsp";
			
			} else if (command.equals("/noticeSelect")) {
				int num = Integer.parseInt(request.getParameter("num"));
				NoticeDTO noticeDTO = noticeService.noticeSelect(num);
				request.setAttribute("dto", noticeDTO);
				path = "../WEB-INF/views/notice/noticeSelect.jsp";
				
			} else if (command.equals("/noticeAdd")) {
				if (method.equals("POST")) {
					NoticeDTO noticeDTO = new NoticeDTO();
	
			
					noticeDTO.setSubject(request.getParameter("subject"));
					noticeDTO.setName(request.getParameter("name"));
					noticeDTO.setContents(request.getParameter("contents"));
					

					int result = noticeService.noticeAdd(noticeDTO);
					
					String msg = "게시물 등록 실패";
					if(result>0) {
						
						msg = "게시물 등록 성공";
					}
					request.setAttribute("result", msg);
					request.setAttribute("path", "./noticeList");
					path= "../WEB-INF/views/common/result.jsp";	
				} else {
					check = true;
					path = "../WEB-INF/views/notice/noticeAdd.jsp";
				}
			} else if (command.equals("/noticeMod")) {
				if (method.equals("POST")) {
					NoticeDTO noticeDTO = new NoticeDTO();
				
					
					noticeDTO.setSubject(request.getParameter("subject"));
					noticeDTO.setName(request.getParameter("name"));
					noticeDTO.setContents(request.getParameter("contents"));
					noticeDTO.setNum(Integer.parseInt(request.getParameter("num")));
					System.out.println(Integer.parseInt(request.getParameter("num")));
					
					int result = noticeService.noticeMod(noticeDTO);
					String msg="수정 실패";
					if(result>0) {
						msg="수정 성공";
						request.setAttribute("path","./noticeSelect?num="+noticeDTO.getNum());
					}else {
						request.setAttribute("path", "./noticeList");			
					}
					request.setAttribute("result",msg);
					path = "../WEB-INF/views/common/result.jsp";
				} else {
					int num = Integer.parseInt(request.getParameter("num"));
					NoticeDTO noticeDTO = noticeService.noticeSelect(num);
					request.setAttribute("dto", noticeDTO);
					check = true;
					path = "../WEB-INF/views/notice/noticeMod.jsp";
				}
			}else if(command.equals("/noticeDelete")){
				int num = Integer.parseInt(request.getParameter("num"));			
				int result = noticeService.noticeDelete(num);
				check = false;
				path = "./noticeList";
				
			}

			if (check) {
				RequestDispatcher view = request.getRequestDispatcher(path);
				view.forward(request, response);
			} else {
				response.sendRedirect(path);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
