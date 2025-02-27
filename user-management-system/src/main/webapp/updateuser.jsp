<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="ref" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        form {
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        h2 {
            text-align: center;
        }
        input[type="text"], input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"] {
            background-color: #28a745;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <form action="userInfo" method="post">
        <h2>User Registration</h2>
        <input type="text" name="id" hidden value="${user.getId()}" required>
        First Name: <input type="text" name="firstName" value="${user.getFirstName()}" required>
        Last Name: <input type="text" name="lastName" value="${user.getLastName()}" required>
        Email: <input type="text" name="email" value="${user.getEmail()}" required>
        Phone Number: <input type="text" name="phoneNumber" value="${user.getPhoneNumber()}" required>

<h4 align="center">${msg}</h4>

        <input type="submit" value="Update">

    </form>
</body>
</html>
