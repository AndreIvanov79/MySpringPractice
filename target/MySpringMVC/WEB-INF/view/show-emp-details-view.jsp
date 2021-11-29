<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<body>
<div style="text-align: center; margin-top: 50px">
    <h2 style="text-align: center">Dear Employee ${employee.name}, you are WELCOME!</h2>
    <h3 style="margin-bottom: 10px">Employee name: ${employee.name}</h3>
    <h3 style="margin-bottom: 10px">Employee surname: ${employee.surname}</h3>
    <h3 style="margin-bottom: 10px">Employee salary: ${employee.salary}</h3>
    <h3 style="margin-bottom: 10px">Employee department: ${employee.department}</h3>
    <h3 style="margin-bottom: 10px">Employee system: ${employee.system}</h3>
    <h3 style="margin-bottom: 10px">Employee language(s):
        <ul>
            <c:forEach var="lang" items="${employee.languages}">
                <li>${lang}</li>
            </c:forEach>
        </ul>
    </h3>
    <h3 style="text-align: center">Employee phone: ${employee.phoneNumber}</h3>
    <h3 style="margin-bottom: 10px">Employee email: ${employee.email}</h3>
</div>

</body>

</html>