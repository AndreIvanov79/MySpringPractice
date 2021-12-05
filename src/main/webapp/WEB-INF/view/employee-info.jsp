<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>

<h2 style="display: flex; justify-content: center; margin-top: 10%">Employee Info</h2>
<div style="display: flex; justify-content: center">
<form:form action="saveEmployee" modelAttribute="employee" cssStyle="align-content: center">
    <form:hidden path="id"/>
    <div style="margin-bottom: 5px">Name <form:input path="name"/></div>
    <div style="margin-bottom: 5px">Surname <form:input path="surname"/></div>
    <div style="margin-bottom: 5px">Department <form:input path="department"/></div>
    <div style="margin-bottom: 5px">Salary <form:input path="salary"/></div>

    <input type="submit" value="OK" style="margin-top: 3%">

</form:form>
</div>

</body>
</html>