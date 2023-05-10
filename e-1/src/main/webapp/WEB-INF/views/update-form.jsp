<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Restaurant Management System</title>
    <link rel="stylesheet" type="text/css" href="style.css">
    <style type="text/css">
    body {
  font-family: Arial, sans-serif;
  background-color: #f2f2f2;
}

header {
  background-color: #333;
  color: #fff;
  padding: 10px;
}

nav {
  background-color: #ccc;
  padding: 10px;
}

nav ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
}

nav li {
  display: inline-block;
  margin-right: 10px;
}

nav li a {
  color: #333;
  text-decoration: none;
}

main {
  padding: 20px;
}

label {
  display: block;
  margin-bottom: 5px;
}

input[type="text"] {
  padding: 5px;
  width: 200px;
  margin-bottom: 10px;
}

input[type="password"],
input[type="submit"],
input[type="reset"] {
  background-color: #333;
  color: #fff;
  padding: 5px 10px;
  border: none;
  cursor: pointer;
}

input[type="submit"]:hover,
input[type="reset"]:hover {
  background-color: #555;
}
    
    </style>
  </head>
  <body>
    <header>
      <h1>Restaurant Management System</h1>
    </header>
    
    <nav>
      <ul>
        <li><a href="#">Home</a></li>
        <li><a href="${pageContext.request.contextPath }">Order History</a></li>
      </ul>
    </nav>
    
    <main>
      <h2>Bill Payment</h2>
      <form action="${pageContext.request.contextPath }/save" modelAttribute="registerpost" method="post">
      <input type="hidden" value="${p.id }" name="id"/>
        <label for="customer-name">Product Name:</label>
        <input type="text" id="customer-name" name="productname" required value="${p.productname }"> <br><br>
        
        <label for="customer-address">Product Description:</label>
        <input type="text" id="customer-address" name="productdescription" required value="${p.productdescription }"><br><br>
        
        <label for="customer-phone">Price:</label>
        <input type="tel" id="customer-phone" name="price" required value="${p.price }"><br><br>
        
        <input type="submit" value="Submit">

    </main>
    
    <footer>
      <p>&copy; Restaurant Management System</p>
    </footer>
    
  </body>
</html>
