<%--
  Created by IntelliJ IDEA.
  User: LheaJLove
  Date: 5/9/2017
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Bits & Bytes Coffee Shop Registration Page</title>
    <style>
        body {
            background-color: #2E8B57;
        }
    </style>
</head>
<body>
<center>
    <h2 style="color:#98fb98;"><strong>Welcome to Bits and Bytes Coffee Shop Registry</strong></h2>


    <form:form method="POST" action="/customer">
        <table>
            <tr>
                <td><form:label path="name">Name</form:label></td>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td><form:label path="age">Age</form:label></td>
                <td><form:input path="age"/></td>
            </tr>
            <tr>
                <td><form:label path="favoriteDrink">Favorite Drink</form:label></td>
                <td><form:input path="favoriteDrink"/></td>
            </tr>
            <tr>
                <td><form:label path="favoritePastry">Favorite Pastry</form:label></td>
                <td><form:input path="favoritePastry"/></td>
            </tr>
            <tr>
                <td><form:label path="allergies">Allergies</form:label></td>
                <td><form:input path="allergies"/></td>
            </tr>
            <tr>
                <td><form:label path="time">Preferred Time of Day</form:label></td>
                <td><form:select path="time" items="${timeOfDay}" />
                <select id="time" name="time">
                    <option value="early">Early 5am - 10am</option>
                    <option value="lunch">Lunch 10am - 3pm</option>
                    <option value="dinner">Dinner 3pm - 8pm</option>
                    <option value="lateNight">Late 8pm - 2am</option>
                </select></td>
            </tr>
            <tr>
                <td colspan ="2"></td>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form:form>
</center>

</body>
</html>