<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<h3> ${ updateInfo }  </h3>
<body>
<form action="updateUser" method="post">
    <input type ="text" hidden name="id" value=${ userInfo.getId() }>
    First Name : <input type = "text" name="fName" value=${ userInfo.getFirstName() }></br>
    <input type="submit" value="Update">
</form>
</body>
</html>