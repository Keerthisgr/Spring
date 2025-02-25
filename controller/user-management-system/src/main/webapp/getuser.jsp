<%@ page language="java" contentType="text/html; charset=US-ASCII"
       pageEncoding="US-ASCII"%>
       <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
    table {
      font-family: arial, sans-serif;
      border-solid: black;
      width: 100%;
    }

    td, th {
      border: 4px solid #dddddd;
      text-align: center;
      padding: 8px;
    }

    tr:nth-child(even) {
      background-color: #dddddd;
    }
    </style>
</head>
<body>
<form action="getUser" >
Enter First Name <input type = "text" name="firstName"></br>
<input type="submit" value="Search">
</form>
<table >
<tr>
<th>Sl.No</th>
<th>User First Name</th>
<tr>
<td>${ user.getId() }</td>
<td>${ user.getFirstName() }</td>
</tr>
</table>
</body>
</html>