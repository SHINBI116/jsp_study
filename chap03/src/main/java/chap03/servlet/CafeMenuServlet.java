package chap03.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward/cafeMenu/select")
public class CafeMenuServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String selected_menu = req.getParameter("menu");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/forward/Menuview.jsp");
		
		dispatcher.forward(req, resp);
	}
}
