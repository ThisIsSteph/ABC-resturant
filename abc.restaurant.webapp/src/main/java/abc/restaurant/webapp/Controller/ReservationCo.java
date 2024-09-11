package abc.restaurant.webapp.Controller;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import abc.restaurant.webapp.Model.ReservationM;
import abc.restaurant.webapp.Service.ReservationS;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/reservations")
public class ReservationCo extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ReservationS reservationService;

    public ReservationCo() {
        this.reservationService = new ReservationS();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        try {
            switch (action) {
                case "list":
                    listReservations(request, response);
                    break;
                case "add":
                    addReservation(request, response);
                    break;
                case "edit":
                    editReservation(request, response);
                    break;
                case "delete":
                    deleteReservation(request, response);
                    break;
                default:
                    listReservations(request, response);
                    break;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException(ex);
        }
    }

    private void deleteReservation(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void editReservation(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void addReservation(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void listReservations(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        List<ReservationM> listReservations = reservationService.getAllReservations();
        request.setAttribute("listReservations", listReservations);
        RequestDispatcher dispatcher = request.getRequestDispatcher("reservation-list.jsp");
        dispatcher.forward(request, response);
    }

    // Methods for add, edit, delete actions
}
