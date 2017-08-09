<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table style="width:100%;background:green;color:white" border="1">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Contact No</th>
            </tr>
            
                <tr th:each="customer: ${customers}">
                    <td th:text="${customer.customerId}"></td>
                    <td th:text="${customer.firstName}"></td>
                    <td th:text="${customer.email}"></td>
                    <td th:text="${customer.contactNo}"></td>
                </tr>
            
        </table>
    </body>
</html>
