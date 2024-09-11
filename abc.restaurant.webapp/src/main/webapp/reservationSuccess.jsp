<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Reservation Successful</title>
    <link rel="stylesheet" href="reservationSuccess.css">
    
</head>
<body>
    <header>
        <a href="#" class="logo"><i class="fas fa-utensils"></i>ABC Restaurant</a>
        <div id="menu-bar" class="fas fa-bars"></div>
        <nav class="navbar">
            <a href="index.html">Home</a>
            <a href="gallery.html">Gallery</a>
            <a href="menu.html">Product and Service</a>
            <a href="Search.html">Search Facilities</a>
            <a href="reservation.html">Reservations</a>
            <a href="customerreg.html">Register</a>
            <div class="dropdown">
                <button class="dropbtn">Check Availability <i class="fa fa-caret-down"></i></button>
                <div class="dropdown-content">
                    <a href="#">Check Availability</a>
                    <a href="reservation.jsp">Submit Queries</a>
                    <a href="#">Make Payment</a>
                </div>
            </div>
            <a href="login.html">Login</a>
        </nav>
    </header>

  

    <div class="reservation-container">
        <h2>Make a Reservation</h2>
        <form action="makeReservation" method="post">
            <input type="text" name="name" placeholder="Your Name" required>
            <input type="date" name="reservationDate" required>
            <input type="number" name="numberOfPeople" placeholder="Number of People" required min="1">
            <input type="submit" value="Submit Reservation">
        </form>
        <div class="error">
            <%= request.getAttribute("errorMessage") != null ? request.getAttribute("errorMessage") : "" %>
        </div>
    </div>
    
    <div class="success-container">
        <h2>Your Reservation Was Successful!</h2>
        <p>Thank you for making a reservation with us. We look forward to serving you.</p>
    </div>
 
    
    
</body>
</html>
