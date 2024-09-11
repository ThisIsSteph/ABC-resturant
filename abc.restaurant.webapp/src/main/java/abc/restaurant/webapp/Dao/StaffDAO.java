package abc.restaurant.webapp.Dao;

import abc.restaurant.webapp.Model.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StaffDAO {

    private Connection connection;

    public StaffDAO(Connection connection) {
        this.connection = connection;
    }

    public void registerStaff(Staff staff) throws SQLException {
        String sql = "INSERT INTO staff (firstName, lastName, email, phoneNumber, department) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, staff.getFirstName());
            statement.setString(2, staff.getLastName());
            statement.setString(3, staff.getEmail());
            statement.setString(4, staff.getPhoneNumber());
            statement.setString(5, staff.getDepartment());
            statement.executeUpdate();
        }
    }
}