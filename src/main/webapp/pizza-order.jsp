<%--
  Created by IntelliJ IDEA.
  User: destineyrodney
  Date: 12/24/21
  Time: 7:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <%@ include file="partials/head.jsp"%>
</head>
<body>

<h1>Welcome to Pizza World!</h1>

<form action="pizza-order" method="POST">
    <div class="form-group">
        <label for="pizza-crust">Pizza Crust</label>
        <select class="form-control" name="crust" id="pizza-crust">
            <option>Please select crust type</option>
            <option value="hand-tossed">Hand Tossed</option>
            <option value="thin-crust">Thin Crust</option>
            <option  value="Pan Crust">Pan-crust</option>
            <option value="Stuffed Crust">Stuffed Crust</option>
        </select>
    </div>
    <div class="form-group">
        <label for="sauce-type">Sauce Type</label>
        <select class="form-control" name="sauce" id="sauce-type">
            <option>Please choose a sauce</option>
            <option value="Marinara">Marinara</option>
            <option value="Alfredo">Alfredo</option>
            <option value="Meat-sauce">Meat</option>
            <option value="No sauce">No sauce</option>
        </select>
    </div>
    <div class="form-group">
        <label for="size">Size</label>
        <select class="form-control" name="size" id="size">
            <option>Please select size</option>
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>
    </div>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="checkbox" name="topping" id="cheese" value="cheese">
        <label class="form-check-label" for="cheese">Cheese</label>
    </div>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="checkbox" name="topping" id="pepperoni" value="pepperoni">
        <label class="form-check-label" for="pepperoni">Pepperoni</label>
    </div>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="checkbox" name="topping" id="italianSausage" value="italianSausage">
        <label class="form-check-label" for="italianSausage">Italian Sausage </label>
    </div>
    <br>
    <div>
        <label>Delivery Address</label>
        <div class="form-group">
            <label for="inputAddress">Address</label>
            <input name="address" type="text" class="form-control" id="inputAddress" placeholder="input you address">
        </div>
    </div>

    <input type="submit">
</form>
</body>
</html>
