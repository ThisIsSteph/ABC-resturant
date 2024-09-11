package abc.restaurant.webapp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import abc.restaurant.webapp.Model.Employee;
import abc.restaurant.webapp.Util.DatabaseUtil;

public class EmployeeDao {

    public boolean registerEmployee(Employee employee) {
        String query = "INSERT INTO Employee(firstName, lastName, email, mobileNumber, homeAddress, dob, designation) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, employee.getFirstName());
            pstmt.setString(2, employee.getLastName());
            pstmt.setString(3, employee.getEmail());
            pstmt.setString(4, employee.getMobileNumber());
            pstmt.setString(5, employee.getHomeAddress());
            pstmt.setDate(6, java.sql.Date.valueOf(employee.getDob()));
            pstmt.setString(7, employee.getDesignation());

            int rowsInserted = pstmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

