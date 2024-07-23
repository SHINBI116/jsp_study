package chap02.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/form/answer")
public class Everland extends HttpServlet{
	
	private static HashMap<String, HashMap<String ,Integer>> priceMap
												= new HashMap<>();
	
	static {
		priceMap.put("adult", new HashMap<>());
		priceMap.put("youth", new HashMap<>());
		priceMap.put("child", new HashMap<>());
		
		priceMap.get("adult").put("day", 54000);
		priceMap.get("adult").put("night", 45000);
		priceMap.get("youth").put("day", 46000);
		priceMap.get("youth").put("night", 39000);
		priceMap.get("child").put("day", 43000);
		priceMap.get("child").put("night", 36000);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String adultTicketQty = req.getParameter("adult-ticket-qty");
		String youthTicketQty = req.getParameter("youth-ticket-qty");
		String childTicketQty = req.getParameter("child-ticket-qty");
		
		String adultTicketType = req.getParameter("adult-ticket-type");
		String youthTicketType = req.getParameter("youth-ticket-type");
		String childTicketType = req.getParameter("child-ticket-type");
		
		// 타입이 없는 채로 이 서블릿에 들어오면 다른 페이지로 보내버리겠다..(리다이렉트)
		if (adultTicketType == null || adultTicketType.equals("")
			|| youthTicketType == null || youthTicketType.equals("")
			|| childTicketType == null || childTicketType.equals("")) {
			resp.sendRedirect("/chap02/form/index.jsp");
		}
		
		System.out.println("adult ticket qty:" + adultTicketQty);
		System.out.println("youth ticket qty:" + youthTicketQty);
		System.out.println("child ticket qty:" + childTicketQty);
		
		int aQty = 0;
		int yQty = 0;
		int cQty = 0;
		
		// 받은 파라미터가 null이거나 비어있는 문자열인 경우에 대비해야한다
		if (adultTicketQty != null && !adultTicketQty.equals("")) {
			aQty = Integer.parseInt(adultTicketQty);
		}
		if (youthTicketQty != null && !youthTicketQty.equals("")) {
			yQty = Integer.parseInt(youthTicketQty);
		}
		if (childTicketQty != null && !childTicketQty.equals("")) {
			cQty = Integer.parseInt(childTicketQty);
		}
		
		int aPrice = priceMap.get("adult").get(adultTicketType);
		int yPrice = priceMap.get("youth").get(youthTicketType);
		int cPrice = priceMap.get("child").get(childTicketType);
		
		
		StringBuilder message = new StringBuilder();
		message.append("## 주문하신 티켓 현황 ##\n");
		message.append("대인: ");
		message.append(adultTicketQty);
		message.append("(");
		message.append(adultTicketType);
		message.append(") x ");
		message.append(aPrice);
		message.append("\n");
		message.append("청소년: ");
		message.append(youthTicketQty);
		message.append("(");
		message.append(youthTicketType);
		message.append(") x ");
		message.append(yPrice);
		message.append("\n");
		message.append("소인/경로: ");
		message.append(childTicketQty);
		message.append("(");
		message.append(childTicketType);
		message.append(") x ");
		message.append(cPrice);
		message.append("\n");
		message.append("----------------\n");
		message.append("총\t\t");
		
		int totalPrice = aPrice * aQty
						+ yPrice * yQty
						+cPrice * cQty;
		
		message.append(totalPrice);
		message.append("원\n");
		System.out.println(message);
	}
	
}




