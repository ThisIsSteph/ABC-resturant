package abc.restaurant.webapp.Controller;

import abc.restaurant.webapp.Model.Reservation;
import abc.restaurant.webapp.Service.ReservationService;
import abc.restaurant.webapp.Service.ReservationServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet("/makeReservation")
public class ReservationController extends HttpServlet {
    private ReservationService reservationService = new ReservationServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Date reservationDate = Date.valueOf(request.getParameter("reservationDate"));
        int numberOfPeople = Integer.parseInt(request.getParameter("numberOfPeople"));

        Reservation reservation = new Reservation();
        reservation.setName(name);
        reservation.setReservationDate(reservationDate);
        reservation.setNumberOfPeople(numberOfPeople);

        reservationService.makeReservation(reservation);

        response.sendRedirect("reservationSuccess.jsp"); // Redirect to a success page
    }
}