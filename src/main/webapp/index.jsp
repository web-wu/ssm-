<html>
<head>
    <title>add user</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/addUser" method="post">
        <input type="text" name="username"> <br />
        <input type="text" name="age"> <br />
        <input type="text" name="gender"> <br />
        <input type="submit" value="submit">
    </form>
</body>
</html>
