<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>NYIT_HOMEPAGE</title>
    <meta name="keywords" content="NYIT,social,chat,friend,meet,date,dating,nearby,people,IM,free,stranger,network,discover">
    <meta name="description" content="NYIT is a fun and simple way to discover, meet and make friends with people in school.">
   
    <link rel="stylesheet" href="css/wcss.css" type="text/css"/>
<style>

.wrapper{min-width:1002px;overflow:hidden;padding-top:0px;}

.banner{height:640px;padding-top:90px;background:#1f79e8;}
.banner a, .banner a:hover {text-decoration: none;cursor: pointer;}
.banner .banner-info{width:1002px;margin:0 auto;height:100%;position:relative;}
.banner .banner-info .text{width:521px;height:121px;color:white;font-size:36px;line-height:42px;padding-top:169px;}
.banner .banner-btn {width: 134px;height: 51px;display: block;border: 2px solid #fff;font-size: 20px;line-height: 55px;padding-left: 65px;position: absolute;}
.banner .download-btn {color: #1e78e7;background: #fff url('/static/w5/img/website/icon.png') 21px -57px no-repeat;bottom:172px;left: 0;}
.banner .pics{position: absolute;bottom:0;width:626px;right:-155px;height:581px;background:url('/static/wen2/img/website/hand.png')}

.intro-text{font-size:24px;color:#858585;}
.intro-text .title{font-size:36px;color:#1f79e8;}

.intro{max-width:1002px;margin:0 auto;min-height:400px;margin-top:80px;padding-bottom:160px;position:relative;}
.intro .intro-text{color:#A8A8A8;background-image:url('/static/wen2/img/website/quate.png');background-repeat:no-repeat;padding-top:110px;}
.intro .intro-text p{padding-left:2px;white-space: nowrap;}
.intro .intro-text .title{padding:0;}

.intro .pic{width:500px;height:400px;background-position:center center ;background-repeat: no-repeat;}
.intro .pic1{margin-left:100px;background-image:url('images/1.jpg');}
.intro .pic2{margin-right:30px;margin-top:-37px;background-image:url('images/2.jpg') ;}
.intro .pic3{margin-left:56px;margin-top:-20px;background-image:url('images/3.png') ;}
.intro.pic-left .pic{float:left;}
.intro.pic-left .intro-text{ background-position:686px 30px; padding-left:686px;}
.intro.pic-right .pic{float:right;}
.intro.pic-right .intro-text{background-position:0px 30px;}
.intro.intro3 .intro-text{background-position:626px 30px; padding-left:626px;}
.intro1 .after{
	position: absolute;
	left: -72px;
	bottom: -99px;
	width: 992px;
	height: 401px;
	background: url('images/dot1.png');
}
.intro2 .after{
	position: absolute;
	left: 53px;
	bottom: -197px;
	width: 746px;
	height: 429px;
	background: url('images/dot2.png');
}
.intro3 .after{
	position: absolute;
	right: -13px;
	bottom: -569px;
	width: 1004px;
	height: 490px;
	background: url('/static/wen2/img/website/dotted3.png');
}


</style>

   <script type="text/javascript">
       
        
       
       function validate_required(field,alerttxt)
{
with (field)
  {
  if (value==null||value=="")
    {alert(alerttxt);return false}
  else {return true}
  }
}

function validate_form1(thisform)
{
with (thisform)
  {
  if (validate_required(id,"Your id must be filled out!")==false)
    {
        id.focus();return false;
    }
    
    if (validate_required(password,"Your password must be filled out!")==false)
    {
        password.focus();return false;
    }
    
    
    
  }
}
       
       
function validate_email(field,alerttxt)
{
with (field)
{
apos=value.indexOf("@")
dotpos=value.lastIndexOf(".")

if (apos<1||dotpos-apos<2) 
  {alert(alerttxt);return false}
else {return true}
}
}

function validate_form2(thisform)
{
with (thisform)
{
if (validate_email(email,"Not a valid e-mail address!")==false)
  {email.focus();return false}
}
}
</script>

</head>
<body>
 
	
    
    <span class="shadow"><Strong>NYIT</Strong></span>
        <span class="sc">Student Center</span>
        <span class="login">
                <form action="/NYIT1/loginCL" onsubmit="return validate_form1(this)" method="post">
                    <span class="div3">NYIT_ID <input type="text" name="id" placeholder="NYIT_ID"></span>
                    <span class="div3">Password <input type="password" name="password" placeholder="Password"></span>
                        <span><input type="submit" value="Log In" style="background-color: green;color: whitesmoke;width:50px"></span>
                        <span class="div4"><a href="">Forget your password?</a></span>
                    </form>
            
                </span>

 
            <div class="wrapper">
    
    <section class="font-titillium-250">
        <div class="check_email">
            <div style="margin-left: 100px;color:teal;font-size: 24px;">
                Serving NYIT Students with Information about Courses and Friends. 
            </div>
            <div style="margin-left: 100px;margin-top: 50px;color:grey;font-size: 30px;">
                First time being here? Confirm your Email, then you can sign up! 
            </div>
            <form action="/NYIT1/checkEmail" onsubmit="return validate_form2(this);" method="post">
                <textarea cols="40" rows="1" name="email" placeholder="Your Email.." style="margin-left: 100px;"></textarea>
                <input type="submit" value="confirm" style="margin-left: 100px;">
            </form>
        </div>
        
        <div style="height: 60px;font-size: 1px">.</div>
        
      <div class="intro pic-left intro1">
            <div class="pic pic1"></div>
       <div class="intro-text">
                <p class="title"><strong>Search For Friends</strong> </p>
                <p>Find friends in your major   <br/>
              and all NYIT students.</p>
        </div> 
            <div class="after"></div>
      </div>
        
        
        
      <div class="intro pic-right intro2">
            <div class="pic pic2"></div>
          <div class="intro-text">
                <p class="title"><strong>Announcement</strong></p>
                <p>Discover the news around your school, <br/>Join the activities and share happiness.</p>
        </div>
            <div class="after"></div>
            
      </div>
        <div class="intro pic-left intro3">
            <div class="pic pic3"></div>
          <div class="intro-text">
            <p class="title"><strong>Communicate  </strong></p>
         
                <p>chat with friends,
            <br>share your course comments with others.</p>
          </div>
          
          <div align="right"><div class="after"></div></div>
        </div>
    </section>
    <section id="mm_downloads" class="dowload-sec font-titillium-250"></section>
</div>

 
<footer class="common-footer">Contact & Support | happydream 2014-2015 © Images from www.immomo.com. </footer>

</body>
</html>