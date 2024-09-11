<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Staff Registration</title>
    
    <style>
    /* Global Reset */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Roboto', sans-serif;
  }
  
  /* Body Background */
  body {
    background-color: #f4f4f4;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    padding-top: 60px; /* Space for fixed header */
  }
  
  /* Header Section */
  header {
    background-color: #333;
    color: white;
    padding: 15px 0;
    position: fixed;
    width: 100%;
    top: 0;
    z-index: 1000;
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 10px 20px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
  }
  
  header .logo {
    font-size: 1.8rem;
    color: #ffffff;
    text-decoration: none;
    font-weight: bold;
  }
  
  header .navbar {
    display: flex;
    align-items: center;
  }
  
  header .navbar a {
    color: #fff;
    text-decoration: none;
    padding: 10px 15px;
    font-size: 1rem;
    transition: background-color 0.3s ease;
  }
  
  header .navbar a:hover {
    background-color: #555;
    border-radius: 5px;
  }
  
  /* Dropdown Styles */
  .dropdown {
    position: relative;
    display: inline-block;
  }
  
  .dropdown .dropbtn {
    background-color: #333;
    color: #fff;
    border: none;
    font-size: 1rem;
    padding: 10px 15px;
    cursor: pointer;
  }
  
  .dropdown-content {
    display: none;
    position: absolute;
    background-color: #555;
    min-width: 160px;
    box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.1);
    z-index: 1;
  }
  
  .dropdown-content a {
    color: #fff;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    transition: background-color 0.3s ease;
  }
  
  .dropdown-content a:hover {
    background-color: #666;
  }
  
  .dropdown:hover .dropdown-content {
    display: block;
  }
  
  #menu-bar {
    display: none;
    font-size: 2rem;
    color: white;
    cursor: pointer;
  }
  
  /* Container and Form Styling */
  .container {
    background-color: white;
    padding: 40px;
    border-radius: 10px;
    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
    width: 500px;
    max-width: 100%;
  }
  
  .container h2 {
    font-size: 2rem;
    color: #333;
    margin-bottom: 20px;
    text-align: center;
  }
  
  form {
    display: flex;
    flex-direction: column;
  }
  
  label {
    margin: 10px 0 5px;
    font-size: 1rem;
    color: #333;
  }
  
  input[type="text"],
  input[type="email"],
  input[type="date"],
  textarea {
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    font-size: 1rem;
    width: 100%;
    transition: border-color 0.3s ease;
  }
  
  input[type="text"]:focus,
  input[type="email"]:focus,
  input[type="date"]:focus,
  textarea:focus {
    border-color: #666;
  }
  
  button[type="submit"] {
    background-color: #333;
    color: white;
    padding: 15px;
    border: none;
    border-radius: 5px;
    font-size: 1rem;
    cursor: pointer;
    transition: background-color 0.3s ease;
    margin-top: 20px;
  }
  
  button[type="submit"]:hover {
    background-color: #555;
  }
  
  /* Responsive Design */
  @media (max-width: 768px) {
    header .navbar a {
      padding: 10px 5px;
    }
  
    .container {
      width: 90%;
    }
  }
  
  @media (max-width: 600px) {
    header {
      flex-direction: column;
    }
  
    #menu-bar {
      display: block;
    }
  
    header .navbar {
      display: none;
      flex-direction: column;
      width: 100%;
      background-color: #444;
      padding: 10px 0;
    }
  
    header .navbar a {
      padding: 10px;
      text-align: center;
    }
  
    header .navbar.active {
      display: flex;
    }
  }
  
    </style>
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
  
 
    <div class="container">
        <h2>Staff Registration</h2>
        <form action="registerEmployee" method="post">
            <label for="firstName">First Name:</label>
            <input type="text" id="firstName" name="firstName" required><br>

            <label for="lastName">Last Name:</label>
            <input type="text" id="lastName" name="lastName" required><br>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required><br>

            <label for="mobileNumber">Mobile Number:</label>
            <input type="text" id="mobileNumber" name="mobileNumber" required><br>

            <label for="homeAddress">Home Address:</label>
            <textarea id="homeAddress" name="homeAddress" required></textarea><br>

            <label for="dob">Date of Birth:</label>
            <input type="date" id="dob" name="dob" required><br>

            <label for="designation">Designation:</label>
            <input type="text" id="designation" name="designation" required><br>

            <button type="submit">Register Staff</button>
        </form>
        <br>
        
    </div>
</body>
</html>
