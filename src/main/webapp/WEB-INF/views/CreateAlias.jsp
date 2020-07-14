<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>AliasCreation</title>
<h1 style="text-align: center; color: Blue;">Fetch Alias Data
    Creation</h1>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
    font-family: Arial;
}

label {
    width: 240px;
    display: inline-block;
}

button {

        width: 40%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=text], select {
    width: 40%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 10%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

div.container {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}

.aliasClass {
    column-count: 2;
}

.submit {
    
}
</style>
</head>
<body>
    <div class="aliasClass">

        <form:form action="aliasCreation" method="post"
            modelAttribute="inputData">
            <form:label path="alias">Alias : </form:label>
            <form:input path="alias" type="text" />
            <br />
            <form:label path="aliasType"> Chose a AliasType : </form:label>
            <form:select path="aliasType" name="aliasType" >
                <form:option value="phone">Phone</form:option>
                <form:option value="email">Email</form:option>
                <form:option value="nationalId">national ID</form:option>
                <form:option value="iban">IBAN</form:option>
                <form:option value="ussd">USSD</form:option>
                <form:option value="bid">BID</form:option>
                <form:option value="custom">Custom</form:option>
            </form:select>
            <br />
            <form:label path="value">PaymentInstrument Value : </form:label>
            <form:input path="value" type="text" />
            <br>
            <form:label path="valueType">PaymentInstrument Value Type : </form:label>
            <form:select path="valueType" name="valueType">
                <form:option value="pan">PAN</form:option>
                <form:option value="token">TOKEN</form:option>
                <form:option value="iban">IBAN</form:option>
                <form:option value="custom">Custom</form:option>
            </form:select>
            <br />
            <form:label path="firstName">FirstName : </form:label>
            <form:input path="firstName" type="text" />
            <br />

            <form:label path="lastName">LastName : </form:label>
            <form:input path="lastName" type="text" />
            <br />

            <form:label path="firstNameLocal">FirstLocalName : </form:label>
            <form:input path="firstNameLocal" type="text" />
            <br>
            <form:label path="lastNameLocal">LastLocalName : </form:label>
            <form:input path="lastNameLocal" type="text" />
            <br />
            <form:label path="contactEmail">Email : </form:label>
            <form:input path="contactEmail" type="text" />
            <br>
            <form:label path="city">City : </form:label>
            <form:input path="city" type="text" />
            <br>
            <form:label path="region">State : </form:label>
            <form:input path="region" type="text" />
            <br>
            <form:label path="country">Country : </form:label>
            <form:input path="country" type="text" />
            <br>

            <form:label path="postalCode">PostalCode : </form:label>
            <form:input path="postalCode" type="text" />
            <br />
            <form:label path="networkName">NetworkName : </form:label>
            <form:input path="networkName" type="text" />
            <br />
            <form:label path="networkType">NetworkType : </form:label>
            <form:input path="networkType" type="text" />
            <br />
            <form:button>Submit </form:button>

        </form:form>
    </div>

</body>
</html>
