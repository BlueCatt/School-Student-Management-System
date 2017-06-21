package testView;
import java.util.*;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
// @author Michael.Wu
//JavaMail 发送邮件
public class test {

public static void main(String[] args) throws AddressException, MessagingException {
	
Properties properties = new Properties();
properties.setProperty("mail.transport.protocol", "smtp");//发送邮件协议
properties.setProperty("mail.smtp.auth", "true");//需要验证
// properties.setProperty("mail.debug", "true");//设置debug模式 后台输出邮件发送的过程
Session session = Session.getInstance(properties);
session.setDebug(true);//debug模式
//邮件信息
Message messgae = new MimeMessage(session);
messgae.setFrom(new InternetAddress("chouhll@qq.com"));//设置发送人
messgae.setText("what's up man, java邮件功能ok");//设置邮件内容
messgae.setSubject("哥们该吃饭了，邮件功能可以了");//设置邮件主题
//发送邮件
Transport tran = session.getTransport();
// tran.connect("smtp.sohu.com", 25, "wuhuiyao@sohu.com", "xxxx");//连接到新浪邮箱服务器
//tran.connect("smtp.sina.com", 25, "whyao@sina.cn", "xxxxxxx");//连接到新浪邮箱服务器
 tran.connect("smtp.qq.com", 25, "chouhll@qq.com", "shabi&daohaogou");//连接到QQ邮箱服务器
tran.sendMessage(messgae, new Address[]{ new InternetAddress("chouhl@qq.com")});//设置邮件接收人
tran.close();
}
}