package abc.restaurant.webapp.Service;

import abc.restaurant.webapp.Dao.ReservationDao;
import abc.restaurant.webapp.Dao.ReservationDaoImpl;
import abc.restaurant.webapp.Model.Reservation;

public class ReservationServiceImpl implements ReservationService {

    private ReservationDao reservationDao = new ReservationDaoImpl();

    @Override
    public void makeReservation(Reservation reservation) {
        reservationDao.addReservation(reservation);
    }
}