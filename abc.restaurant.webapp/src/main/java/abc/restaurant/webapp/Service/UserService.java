package abc.restaurant.webapp.Service;

import abc.restaurant.webapp.Dao.UserDAO;
import abc.restaurant.webapp.Model.User;

public class UserService {
    private UserDAO userDAO = new UserDAO();

    public void registerUser(User user) {
        userDAO.registerUser(user);
    }

    public User loginUser(String username, String password) {
        return userDAO.loginUser(username, password);
    }
}