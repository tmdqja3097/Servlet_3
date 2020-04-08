package com.iu.point;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PointController
 */
@WebServlet("/PointController")
public class PointController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PointService pointService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PointController() {
		super();
		pointService = new PointService();
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
			if (command.equals("/pointList")) {
				ArrayList<PointDTO> ar = pointService.PointList();
				request.setAttribute("list", ar);

				path = "../WEB-INF/views/point/pointList.jsp";
			} else if (command.equals("/pointAdd")) {
				if (method.equals("POST")) {
					PointDTO pointDTO = new PointDTO();
					String name = request.getParameter("name");
					int num = Integer.parseInt(request.getParameter("num"));
					int kor = Integer.parseInt(request.getParameter("kor"));
					int eng = Integer.parseInt(request.getParameter("eng"));
					int math = Integer.parseInt(request.getParameter("math"));
					pointDTO.setName(name);
					pointDTO.setNum(num);
					pointDTO.setKor(kor);
					pointDTO.setEng(eng);
					pointDTO.setMath(math);
					
					int result = pointService.pointAdd(pointDTO);
					
					check = false;
					path= "./pointList";
					
				} else {
					check = true;
					path = "../WEB-INF/views/point/pointAdd.jsp";
				}
			} else if (command.equals("/pointMod")) {
				if (method.equals("POST")) {

				} else {
					check = true;
					path = "../WEB-INF/views/point/pointMod.jsp";
				}
			} else if (command.equals("/pointSelect")) {
				int num = Integer.parseInt(request.getParameter("num"));
				PointDTO pointDTO = pointService.pointSelect(num);
				request.setAttribute("dto", pointDTO);
				path = "../WEB-INF/views/point/pointSelect.jsp";
			} else if (command.equals("/pointDelete")) {
				int num = Integer.parseInt(request.getParameter("num"));

				int result = pointService.pointDelete(num);

				check = false;
				path = "./pointList";

			} else {
				System.out.println("ETC");
			}

			// true면 foward, false면 redirect
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
