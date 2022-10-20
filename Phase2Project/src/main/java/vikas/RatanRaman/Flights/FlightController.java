package vikas.RatanRaman.Flights;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FlightController
 */
public class FlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("addfrm"))
			addFlightsFrm(request,response);
		else if(action.equalsIgnoreCase("deletefrm"))
			deleteFlightsFrm(request,response);
		else if(action.equalsIgnoreCase("displayfrm"))
			displayFlightFrm(request,response);
		else if(action.equalsIgnoreCase("editfrm"))
			editFlightsFrm(request,response);
				
	}

	private void editFlightsFrm(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void displayFlightFrm(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void deleteFlightsFrm(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void addFlightsFrm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("addFlightFrm.jsp").forward(request, response);
		
	}
}
