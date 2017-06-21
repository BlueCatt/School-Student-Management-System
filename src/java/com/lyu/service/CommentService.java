
package com.lyu.service;

import com.lyu.domain.Comment;
import com.lyu.domain.Course;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import com.lyu.util.SqlHelper;
import java.sql.DriverManager;
import java.util.ArrayList;

/**
 *
 * @author painter
 */
public class CommentService {
    
    private Connection ct=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    
    public void submitComment(String s_id,String c_id,String comment,String date)
    {
        
    String sql="insert into comments values(seq.nextval,?,?,?,?)";
    
    try{
                    //加载驱动
                    Class.forName("oracle.jdbc.OracleDriver");
                    
                    //得到链接
                     ct=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "test", "122588");
                     
            ps=ct.prepareStatement(sql);
            ps.setString(1, s_id);
            ps.setString(2, c_id);
            ps.setString(3, comment);
            ps.setString(4, date);
            ps.executeQuery();
    }catch(Exception e){
        
        e.printStackTrace();
        
    }finally{
        SqlHelper.close(rs, ps, ct);
    }
    
    }
    
    public ArrayList showComments(String courseId){
        
        String sql="select * from comments where course_id=?";
        
       
                     
            String paras[]={courseId};
            ArrayList al=new SqlHelper().executeQuery(sql, paras);
            ArrayList<Comment> newAl=new ArrayList<Comment>();
        //二次业务封装
        for(int i=0;i<al.size();i++){
            Object obj[]=(Object[]) al.get(i);
            Comment comment=new Comment();
            
            comment.setCoId(Integer.parseInt(obj[0].toString()));
            comment.setSId(Integer.parseInt(obj[1].toString()));
            comment.setCId(Integer.parseInt(obj[2].toString()));
            comment.setComment(obj[3].toString());
            comment.setDate(obj[4].toString());
            
            
            newAl.add(comment);
        }
            

        return newAl;
    }
    
    
    public void delete(String commentId)
    {
        
    String sql="delete from comments where co_id=?";
    
    try{
                    //加载驱动
                    Class.forName("oracle.jdbc.OracleDriver");
                    
                    //得到链接
                     ct=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "test", "122588");
                     
            ps=ct.prepareStatement(sql);
            ps.setObject(1,commentId);
            
            ps.executeQuery();
    }catch(Exception e){
        
        e.printStackTrace();
        
    }finally{
        SqlHelper.close(rs, ps, ct);
    }
    
    }
}


