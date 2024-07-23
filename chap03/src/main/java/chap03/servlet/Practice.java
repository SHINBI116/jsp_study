package chap03.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/attribute/deInfo")
public class Practice extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String department_id = req.getParameter("department_id");
		
		String sql = "SELECT first_name, last_name FROM employees "
				+ "JOIN departments USING (department_id)"
				+ "WHERE department_id = ?";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try (
			Connection conn = DriverManager.getConnection(url, "hr", "1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setInt(1, Integer.parseInt(department_id));
			
			try (ResultSet rs = pstmt.executeQuery();) {
				rs.next();
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				
				
				System.out.printf("%s %s\n", first_name, last_name);
				
				// 꺼낸 데이터를 요청 객체의 어트리뷰트에 실어놓는다 (name/value)
				req.setAttribute("first_name", first_name);
				req.setAttribute("last_name", last_name);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/attribute/deInfoView.jsp"); 
		
		dispatcher.forward(req, resp);
	}
}
