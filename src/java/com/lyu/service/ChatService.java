
package com.lyu.service;

import com.lyu.domain.Comment;
import com.lyu.domain.Student;
import com.lyu.domain.chat;
import com.lyu.util.SqlHelper;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author painter
 */
public class ChatService {
    private Connection ct=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    
    public void submitChat(String sendId,String getId,String message,String date)
    {
        
    String sql="insert into chats values(seq.nextval,?,?,?,?)";
    
    try{
                    //加载驱动
                    Class.forName("oracle.jdbc.OracleDriver");
                    
                    //得到链接
                     ct=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "test", "122588");
                     
            ps=ct.prepareStatement(sql);
            ps.setString(1, sendId);
            ps.setString(2, getId);
            ps.setString(3, date);
            ps.setString(4, message);
            ps.executeQuery();
    }catch(Exception e){
        
        e.printStackTrace();
        
    }finally{
        SqlHelper.close(rs, ps, ct);
    }
    
    }
    
  
     
     
     
     
     public ArrayList showMyMessage(String getId){
          
        String sql="select * from chats where get_id=?";
                  
            String paras[]={getId};
            ArrayList al=new SqlHelper().executeQuery(sql, paras);
            ArrayList<chat> newAl=new ArrayList<chat>();
        //二次业务封装
        for(int i=0;i<al.size();i++){
            Object obj[]=(Object[]) al.get(i);
            
            chat c=new chat();
            
            c.setCh_id(Integer.parseInt(obj[0].toString()));
            c.setSend_id(obj[1].toString());
            c.setGet_id(obj[2].toString());
            c.setDate(obj[3].toString());
            c.setMessage(obj[4].toString());
        
            newAl.add(c);
        }
            

        return newAl;
    }
     
     
     public ArrayList showMySendMessage(String sendId){
          
        String sql="select * from chats where send_id=?";
                  
            String paras[]={sendId};
            ArrayList al=new SqlHelper().executeQuery(sql, paras);
            ArrayList<chat> newAl=new ArrayList<chat>();
        //二次业务封装
        for(int i=0;i<al.size();i++){
            Object obj[]=(Object[]) al.get(i);
            
            chat c=new chat();
            
            c.setCh_id(Integer.parseInt(obj[0].toString()));
            c.setSend_id(obj[1].toString());
            c.setGet_id(obj[2].toString());
            c.setDate(obj[3].toString());
            c.setMessage(obj[4].toString());
        
            newAl.add(c);
        }
            

        return newAl;
    }
     
     
     
     
     
     }

