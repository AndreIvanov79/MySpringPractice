<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<h2 style="text-align: center; margin-top: 10%">All Employees</h2>
<div style="display: flex; justify-content: center; margin-bottom: 3%">
<table style="margin-bottom: 10px">
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="emp" items="${allEmps}">
        <c:url var="updateButton" value="/updateInfo">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteEmployee">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>



        <tr>
            <td style="text-align: center">${emp.name}</td>
            <td style="text-align: center">${emp.surname}</td>
            <td style="text-align: center">${emp.department}</td>
            <td style="text-align: center">${emp.salary}</td>
            <td style="text-align: center">
                <input type="button" value="Update" onclick="window.location.href='${updateButton}'"/>

                <input type="button" value="Delete" onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>

    </c:forEach>
</table>

</div>
<div style="display: flex; justify-content: center">
<input type="button" value="Add" onclick="window.location.href='addNewEmployee'"/>
</div>

</body>
</html>