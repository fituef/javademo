<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><c:out value="${pageTitle}" /></title>
</head>
<body>

    <header>
        <h1>Header Section</h1>
    </header>
 
    <jsp:include page="${pageContent}" />

    <footer>
        <p>Footer Section</p>
    </footer>

</body>
</html>