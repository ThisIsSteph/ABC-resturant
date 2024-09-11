<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="login.css"> <!-- Link to your CSS file -->
</head>
<body>

      <header>
        <a href="#" class="logo"><i class="fas fa-utensils"></i>ABC Restaurant</a>
        <div id="menu-bar" class="fas fa-bars"></div>
        <nav class="navbar">
            <a href="index.jsp">Home</a>
            <a href="gallery.html">Gallery</a>
            <a href="Product.html">Product and Service</a>
            <a href="Search.html">Search Facilities</a>
            <a href="reservation.jsp">Reservations</a>
            <a href="registerEmployee.jsp">Register</a>
            <div class="dropdown">
                <button class="dropbtn">Check Availability <i class="fa fa-caret-down"></i></button>
                <div class="dropdown-content">
                    <a href="#">Check Availability</a>
                    <a href="submit-query.jsp">Submit Queries</a>
                    <a href="payment.jsp">Make Payment</a>
                </div>
            </div>
            <a href="register.jsp">Login</a>
        </nav>
    </header>
   





<form action="user" method="post">
    <input type="hidden" name="action" value="login"/>
    
    <label for="username">Username:</label>
    <input type="text" name="username" id="username" required/>

    <label for="password">Password:</label>
    <input type="password" name="password" id="password" required/>

    <input type="submit" value="Login"/>
</form>

<% if (request.getParameter("error") != null) { %>
    <p class="error-message">Invalid username or password!</p>
<% } %>

</body>
</html>
