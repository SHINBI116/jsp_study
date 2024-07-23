package chap02.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class Practice extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("EUC-KR");
		PrintWriter out = resp.getWriter();
		String user_id = req.getParameter("user_id");
		String user_name = req.getParameter("user_name");
		
		System.out.printf("회원 정보\n이름:%s\n아이디:%s\n", user_name, user_id);
		
		out.print("회원가입이 완료되었습니다!");
	}
}
