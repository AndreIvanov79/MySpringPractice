<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<body>
<div style="text-align: center">
<h2>Dear Employee, Please enter your details</h2>
<div style="height: 10px"></div>

<form:form action="showDetails" modelAttribute="employee">
    <div> Name <form:input cssStyle="margin-bottom: 10px" path="name"/>
               <form:errors cssStyle="color: red" path="name"/>
    </div>
    <div>Surname <form:input cssStyle="margin-bottom: 10px" path="surname"/>
                 <form:errors cssStyle="color: red" path="surname"/>
    </div>
    <div>Salary <form:input cssStyle="margin-bottom: 10px" path="salary"/>
                <form:errors cssStyle="color: red" path="salary"/>
    </div>
    <div>Department <form:select cssStyle="margin-bottom: 10px" path="department">
        <form:options items="${employee.departments}"/>
        </form:select>
    </div>
    <div>System preferences:
        <form:radiobuttons cssStyle="margin-bottom: 20px" path="system" items="${employee.systems}"/>
    </div>

    <div>Foreign language(s):
        <form:checkboxes cssStyle="margin-bottom: 20px" path="languages" items="${employee.langList}"/>
    </div>

    <div>Phone Number <form:input cssStyle="margin-bottom: 10px" path="phoneNumber"/>
                       <form:errors cssStyle="color: red" path="phoneNumber"/>
    </div>

    <div>Email <form:input cssStyle="margin-bottom: 10px" path="email"/>
        <form:errors cssStyle="color: red" path="email"/>
    </div>

    <input type="submit" value="Submit">
</form:form>
</div>

</body>

</html>