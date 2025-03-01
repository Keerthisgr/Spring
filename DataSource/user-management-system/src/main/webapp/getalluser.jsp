<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="ref" %>
<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
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
<table >
    <tr>
        <th>Sl.No</th>
        <th>User First Name</th>
        <th>User Last Name</th>
        <th>Email Id</th>
        <th>Phone Number</th>
        <th> Action </th>
    </tr>
    <ref:forEach items="${ listOfUsers }" var="dto">
        <tr>
            <td>${ dto.getId() }</td>
            <td>${ dto.getFirstName() }</td>
            <td>${ dto.getLastName() }</td>
            <td>${ dto.getEmail() }</td>
            <td>${ dto.getPhoneNumber() }</td>

           <td><a href="delete?id=${dto.getId()}"><i class="material-icons">delete</i></a> &nbsp
                           <a href="fetchUser?id=${dto.getId()}"><i class="material-icons orange600">edit</i></a></td>
        </tr>
    </ref:forEach>
</table>
</body>
</html>