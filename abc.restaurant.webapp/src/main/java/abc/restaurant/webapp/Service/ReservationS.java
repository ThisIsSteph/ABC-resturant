package abc.restaurant.webapp.Service;

import java.sql.SQLException;
import java.util.List;

import abc.restaurant.webapp.Dao.ReservationDA;
import abc.restaurant.webapp.Model.ReservationM;

public class ReservationS {
    private ReservationDA reservationDAO;

    public ReservationS() {
        this.reservationDAO = new ReservationDA();
    }

    public List<ReservationM> getAllReservations() throws SQLException, ClassNotFoundException {
        return reservationDAO.getAllReservations();
    }

    // Methods for add, update, delete
}