package chap02.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/baskin31")
public class BaskinServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// checkbox처럼 하나의 name으로 여러 값이 넘어 올 수 있는 경우
		// getParameterValues() 메서드를 사용한다 (리턴 String[])
		String[] iflavors = req.getParameterValues("iflavor");
		
		System.out.print("선택한 맛: ");
		for (String iflavor : iflavors ) {
			System.out.print(iflavor + ", ");
		}
		System.out.println();
	}
}
