package abc.restaurant.webapp.Service;

import abc.restaurant.webapp.Dao.EmployeeDao;
import abc.restaurant.webapp.Model.Employee;

public class EmployeeService {
    private static EmployeeService instance;
    private EmployeeDao employeeDao = new EmployeeDao();

    private EmployeeService() {}

    public static EmployeeService getInstance() {
        if (instance == null) {
            instance = new EmployeeService();
        }
        return instance;
    }

    public boolean registerEmployee(Employee employee) {
        return employeeDao.registerEmployee(employee);
    }
}

