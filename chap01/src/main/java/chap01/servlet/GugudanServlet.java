package chap01.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 	/chap01/gugudan으로 접속하는 사용자들에게
 	멋있는 구구단 페이지를 만들어서 응답해보기
 */

@WebServlet("/gugudan")

public class GugudanServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("EUC-KR");
		PrintWriter out = resp.getWriter();
		
		// 이 페이지를 볼 때 당시의 웹 브라우저 상의 URL은
		// http://localhoust:9000/chap01/gugudan이므로
		// 올바르게 css파일을 찾아가기 위해서는 해당 주소를 염두해 두고 주소를 설정해야 한다
		// href를 ./css/gugudan.css로 설정하면
		// 결과적으로 찾아가는 전체 주소는 https://localhost:9000/chap01/css/gugudan.css가 되고
		// 서버는 저 자원을 webapp 밑의 폴더에서 찾게 된다
		
		out.print("<html><head>");
		out.print("<title>아주 멋있는 구구단</title>");
		out.print("<link rel=\"stylesheet\" href=\"./css/gugudan.css\">");
		out.print("</head><body>");
		out.print("<h3>아주 멋있는 구구단!</h3>");
		out.print("<div id=\"gugudan\"></div>");
		out.print("<script src=\"./js/gugudan.js\"></script></body>");
		
	}

}
