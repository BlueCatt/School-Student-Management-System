<%-- 
    Document   : login
    Created on : Nov 6, 2014, 12:23:12 AM
    Author     : painter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*" session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.css">
        
        <link href='css/my.css' rel='stylesheet' type='text/css'/>
        
        <script type="text/javascript" src="js/chkPwd.js"></script>
    </head>
    <body>
        
        <span class='div1'>NYIT Student Center</span>
                
            
        
                
                <div class="div5">
                    <div class="div6">Sign up</div>
                    <div class="div7">It's free and always will be.</div>
                    <form action="/NYIT1/sighupCL" method="post" autocomplete="off">
                        <span><input type="text" name="fname" placeholder="Firstname" style="font-size: 25px; width: 200px;height: 40px;"></span>
                        <span class="div8"><input type="text" name="lname" placeholder="Lastname" style="font-size: 25px; width: 200px;height: 40px"></span>
                        
                        <div style="height: 30px;font-size: 1px">.</div>
                        
                        <span><input type="text" name="id" placeholder="NYIT_ID" style="font-size: 25px; width: 160px;height: 40px"></span>
                        <span class="div9"><input type="password" name="password" placeholder="Password" onblur="chkpwd(this)" style="font-size: 25px; width: 240px;height: 40px">
                        <span id="chkResult"></span>
                        </span>
                        
                        
                        
                        
                        <div style="height: 30px;font-size: 1px">.</div>
                        
                        <div>
                            <select  name="major" style="font-size: 25px; width: 240px;height: 40px;color: gray">
                                <option selected>-Major-</option>
                                <option value="Computer science">Computer science</option>
                                <option value="Business">Business</option>
                                <option value="Telecommuincation">Telecommuincation</option>
                                <option value="Archetecture">Archetecture</option>
                            </select>
                        </div>
                        <div style="height: 30px;font-size: 1px">.</div>
                        
                        <div>
                            <select name="country" style="font-size: 25px; width: 240px;height: 40px;color: gray">
                        <option selected>-Country-</option>
                        <option value="United States">United States</option>
                        <option value="United Kingdom">United Kingdom</option>
                        <option value="Canada">Canada</option>
                        <option value="Serbia">Serbia</option>
                        <option value="Italy">Italy</option>
                        <option value="China">China</option>
                        <option value="Japan">Japan</option>
                        <option value="North Korea">North Korea</option>
                        <option value="India">India</option>
                        <option value="Korea">South Korea</option>
                        
                        
                    </select>
                        </div>
                        <div style="height: 30px;font-size: 1px">.</div>
                        
                        <div>
                            <input type="radio" name="gender" value="male" style=" width: 30px;height: 20px"> <span style="color:teal;font-size: 20px">Female</span>
                            <input type="radio" name="gender" value="female" style=" width: 30px;height: 20px"> <span style="color:teal;font-size: 20px">Male</span>
                        </div>
                        <div style="height: 30px;font-size: 1px">.</div>
                        
                        <span style="color: grey">By clicking Sign Up, you agree to our Terms and that you have read our Data Use Policy, including our Cookie Use.</span>
                        <div style="height: 30px;font-size: 1px">.</div>
                        
                        <input type="submit" value="Sigh Up" style="width: 150px;height: 30px;background-color: green;color: whitesmoke">                  
                    </form>    
                </div>
        
                
    </body>
</html> 
