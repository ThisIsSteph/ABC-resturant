package abc.restaurant.webapp.Service;

import abc.restaurant.webapp.Dao.StaffDAO;
import abc.restaurant.webapp.Model.Staff;
import java.sql.SQLException;

public class StaffService {

    private StaffDAO staffDAO;

    public StaffService(StaffDAO staffDAO) {
        this.staffDAO = staffDAO;
    }

    public void registerStaff(Staff staff) throws SQLException {
        staffDAO.registerStaff(staff);
    }
}