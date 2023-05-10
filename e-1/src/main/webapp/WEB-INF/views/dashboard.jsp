<html>
<head>
<%@include file="./base.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@page isELIgnored="false" %>
</head >
<body >

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center">Welcome To Restaurant Management System</h1>
				<table class="table">
  <thead class="thead-dark">
    <tr>
    <th scope="col">Ordered Id</th>
      <th scope="col">Order Name</th>
      <th scope="col">Order Description</th>
      <th scope="col">price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${list}" var="p">
    <tr>
      <th scope="row">${p.id }</th>
      <td>${p.productname }</td>
      <td>${p.productdescription }</td>
      <td >${p.price }</td>
     	<td>
     <a href="delete/${p.id}"><i class="fa-sharp fa-solid fa-trash"></i></a>
     <a href="update/${p.id }"><i class="fa-solid fa-pen-nib"></i></a>
     </td>
  
    </tr> 
   </c:forEach>
  </tbody>
</table>
<div class="container text-center">
<a href="home" class="btn btn-outline-success">Add Details</a>
</div>
			</div>
		</div>
	</div>
</body>
</html>