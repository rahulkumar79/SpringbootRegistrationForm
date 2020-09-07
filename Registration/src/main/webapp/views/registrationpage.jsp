<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1> REGISTRATION FORM</h1>
   
    <form action="userDetail">
        User Name : <input id="UName" name="UName"/> <br>
        Email ID : <input id="EmailId" name="EmailId"/> <br>
        Password : <input type="password" id="Password" name="Password"/><br>
        Gender : <input type="radio" name="Gender" value="1" checked=true/> Male
        <input type="radio" name="Gender" value="2"/> Female<br>
        <br>
        Mob no: <input type="text" name="contact" /> <br>
        Address : <input type="text" name="address" /> <br>
        Country:  
           <select name="userCountry">  
           <option>India</option>  
           <option>Pakistan</option>
           <option>other</option>  
           </select>  
  
           <br/><br/>  
          <input type="submit" value="register"/> 
    </form>
</body>
</html>