package abc.restaurant.webapp.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import abc.restaurant.webapp.Model.ReservationM;
import abc.restaurant.webapp.Util.DatabaseUtil;

public class ReservationDA {
    public List<ReservationM> getAllReservations() throws SQLException, ClassNotFoundException {
        List<ReservationM> reservations = new ArrayList<>();
        String sql = "SELECT * FROM reservations";

        try (Connection connection = DatabaseUtil.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                ReservationM reservation = new ReservationM();
                reservation.setId(resultSet.getInt("id"));
                reservation.setCustomerName(resultSet.getString("customer_name"));
                reservation.setReservationDate(resultSet.getDate("reservation_date").toLocalDate());
                reservation.setReservationTime(resultSet.getTime("reservation_time").toLocalTime());
                reservations.add(reservation);
            }
        }

        return reservations;
    }

    // Other methods for insert, update, and delete
}