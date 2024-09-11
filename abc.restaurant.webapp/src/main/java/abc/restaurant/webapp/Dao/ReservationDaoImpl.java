package abc.restaurant.webapp.Dao;



import abc.restaurant.webapp.Model.Reservation;
import abc.restaurant.webapp.Util.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReservationDaoImpl implements ReservationDao {

    @Override
    public void addReservation(Reservation reservation) {
        String query = "INSERT INTO reservations (name, reservation_date, number_of_people) VALUES (?, ?, ?)";
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, reservation.getName());
            statement.setDate(2, reservation.getReservationDate());
            statement.setInt(3, reservation.getNumberOfPeople());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
