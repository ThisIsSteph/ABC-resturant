package abc.restaurant.webapp.Controller;

import abc.restaurant.webapp.Model.Staff;
import abc.restaurant.webapp.Service.StaffService;
import abc.restaurant.webapp.Dao.StaffDAO;
import abc.restaurant.webapp.Util.DatabaseUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registerStaff")
public class StaffController extends HttpServlet {

    private StaffService staffService;

    @Override
    public void init() throws ServletException {
        try {
            // Initialize StaffService with a StaffDAO
            staffService = new StaffService(new StaffDAO(DatabaseUtil.getConnection()));
        } catch (Exception e) {
            throw new ServletException("Failed to initialize StaffService", e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        String department = request.getParameter("department");

        Staff staff = new Staff();
        staff.setFirstName(firstName);
        staff.setLastName(lastName);
        staff.setEmail(email);
        staff.setPhoneNumber(phoneNumber);
        staff.setDepartment(department);

        try {
            staffService.registerStaff(staff);
            response.sendRedirect("registrationSuccess.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}
