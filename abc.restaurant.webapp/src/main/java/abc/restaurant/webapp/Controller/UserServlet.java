package abc.restaurant.webapp.Controller;

import abc.restaurant.webapp.Model.User;
import abc.restaurant.webapp.Service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    private UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if ("register".equals(action)) {
            String name = req.getParameter("name");
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            String email = req.getParameter("email");
            String jobrole = req.getParameter("jobrole");

            User user = new User();
            user.setName(name);
            user.setUsername(username);
            user.setPassword(password);
            user.setEmail(email);
            user.setJobRole(jobrole);

            userService.registerUser(user);
            resp.sendRedirect("login.jsp");

        } else if ("login".equals(action)) {
            String username = req.getParameter("username");
            String password = req.getParameter("password");

            User user = userService.loginUser(username, password);

            if (user != null) {
                HttpSession session = req.getSession();
                session.setAttribute("user", user);

                if ("admin".equals(user.getJobRole())) {
                    resp.sendRedirect("admin-dashboard.jsp");
                } else if ("staff".equals(user.getJobRole())) {
                    resp.sendRedirect("staff-dashboard.jsp");
                }
            } else {
                resp.sendRedirect("login.jsp?error=1");
            }
        }
    }
}