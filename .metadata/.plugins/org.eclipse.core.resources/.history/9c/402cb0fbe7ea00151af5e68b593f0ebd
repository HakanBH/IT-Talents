package mobile.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mobile.jdbc.AdvertDAO;
import mobile.model.*;

@WebServlet("/PublishVehicle")
public class PublishVehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PublishVehicle() {
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String brand = request.getParameter("brand");
		String model = request.getParameter("model");
		String engine = request.getParameter("engine");
		String gearbox = request.getParameter("gearbox");
		String currency = request.getParameter("currency");
		int price = Integer.parseInt(request.getParameter("price"));
		String region = request.getParameter("region");
		String location = request.getParameter("location");
		String month = request.getParameter("month");
		int year = Integer.parseInt(request.getParameter("year"));
		String color = request.getParameter("color");
		String number = request.getParameter("number");
		String email = request.getParameter("email");
		int power =	Integer.parseInt(request.getParameter("power"));
		int mileage = Integer.parseInt(request.getParameter("mileage"));
		String condition = request.getParameter("condition");
		String subcategory = request.getParameter("subcategory");
		int validity = Integer.parseInt(request.getParameter("validity"));

		Vehicle car = new Car(condition, brand, model, currency, color, price, engine, 
				gearbox, subcategory, mileage, power, year, month); 
	
		Advert a = new Advert(car, number, email, region, location, validity);
				
		AdvertDAO advertDao = new AdvertDAO();
		try {
			advertDao.insertVehicle(a, car);
		} catch (SQLException e) {	
			e.printStackTrace();
		}		
		
		Map<String, String[]> extras = new HashMap<String, String[]>();
		String[] safety = request.getParameterValues("safety");
		String[] comfort = request.getParameterValues("comfort");
		String[] exterior = request.getParameterValues("exterior");
		String[] interior = request.getParameterValues("interior");
		String[] security = request.getParameterValues("security");
		String[] special = request.getParameterValues("special");
		String[] other = request.getParameterValues("other");
		extras.put("Safety: ", safety);
		extras.put("Comfort: ", comfort);
		extras.put("Exterior: ", exterior);
		extras.put("Interior: ", interior);
		extras.put("Security: ", security);
		extras.put("Specialized: ", special);
		extras.put("Other: ", other);

		for (String x : extras.keySet()) {
			System.out.println(x);
			if (extras.get(x) != null) {
				for (String y : extras.get(x)) {
					System.out.println(y);
				}
			}
		}
	}
}
