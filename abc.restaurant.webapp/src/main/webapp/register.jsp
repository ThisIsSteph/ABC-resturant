<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="stylesheet" href="RegisterAS.css"> 
    
    
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
        <input type="hidden" name="action" value="register"/>

        <!-- Registration Fields -->
        Name: <input type="text" name="name" required/><br/>
        Username: <input type="text" name="username" required/><br/>
        Password: <input type="password" name="password" required/><br/>
        Email: <input type="email" name="email" required/><br/>

        <!-- Job Role Dropdown -->
        Job Role: 
        <select name="jobrole">
            <option value="admin">Admin</option>
            <option value="staff">Staff</option>
        </select><br/>

        <!-- Submit Button -->
        <input type="submit" value="Register"/>

        <!-- Button to go to login.jsp -->
        <button type="button" class="login-btn" onclick="window.location.href='login.jsp'">
            Already have an account? Login here
        </button>
    </form>

</body>
</html>
