
package com.lyu.service;

import com.lyu.domain.Student;
import com.lyu.util.SqlHelper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

/**
 *
 * @author painter
 */
public class StudentService {
    
    
    private Connection ct=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    
    public boolean checkUser(Student student){
        
        String sql="select * from student where s_id=? and s_password=?";
        String paras[]={student.getId()+"",student.getPassword()};
        ArrayList al=new SqlHelper().executeQuery(sql, paras);
        
        if(al.size()==0){
            return false;
        }else{
            Object [] objects=(Object[]) al.get(0);
            student.setLname((String) objects[1]);
            student.setFname((String) objects[2]);
            student.setMajor((String) objects[5]);
            return true;
        }
    }
    
    public Student getStudentById(String id){
        Student student=new Student();
        String sql="select * from student where s_id=?";
        String paras[]={id};
        ArrayList al=new SqlHelper().executeQuery(sql, paras);
        if(al.size()==1){
            Object [] obj=(Object[]) al.get(0);
            student.setId(Integer.parseInt(obj[0].toString()));
            student.setLname(obj[1].toString());
            student.setFname(obj[2].toString());
            student.setSex(obj[3].toString());
            student.setCountry(obj[4].toString());
            student.setMajor(obj[5].toString());
            student.setPassword(obj[6].toString());
    }
        return student;
}
    
    
       public ArrayList getStudentByMajor(String major){
         String sql="select * from student where s_major=?";
        String paras[]={major};
        ArrayList al=new SqlHelper().executeQuery(sql, paras);
        ArrayList<Student> newAl=new ArrayList<Student>();
        //二次业务封装
        for(int i=0;i<al.size();i++){
            Object obj[]=(Object[]) al.get(i);
            Student student=new Student();
            student.setId(Integer.parseInt(obj[0].toString()));
            student.setLname(obj[1].toString());
            student.setFname(obj[2].toString());
            student.setSex(obj[3].toString());
            student.setCountry(obj[4].toString());
            student.setMajor(obj[5].toString());
            student.setPassword(obj[6].toString());
            newAl.add(student);
        }
            return newAl;
        }

    
    
       
       
       public ArrayList getAllStudents(){
    
        String sql="select * from student where 1=? order by s_major";
        String paras[]={"1"};
        ArrayList al=new SqlHelper().executeQuery(sql, paras);
        ArrayList<Student> newAl=new ArrayList<Student>();
        //二次业务封装
        for(int i=0;i<al.size();i++){
            Object obj[]=(Object[]) al.get(i);
            Student student=new Student();
            student.setId(Integer.parseInt(obj[0].toString()));
            student.setLname(obj[1].toString());
            student.setFname(obj[2].toString());
            student.setSex(obj[3].toString());
            student.setCountry(obj[4].toString());
            student.setMajor(obj[5].toString());
            student.setPassword(obj[6].toString());
            newAl.add(student);
        }
            return newAl;
        }
       
       
       public ArrayList getStudentByName(String name){
        
        String sql="select * from student where lower(s_name) like lower(?)";
        String paras[]={"%"+name+"%"};
        ArrayList al=new SqlHelper().executeQuery(sql, paras);
        ArrayList<Student> newAl=new ArrayList<Student>();
        //二次业务封装
        for(int i=0;i<al.size();i++){
            Object obj[]=(Object[]) al.get(i);
            Student student=new Student();
            student.setId(Integer.parseInt(obj[0].toString()));
            student.setLname(obj[1].toString());
            student.setFname(obj[2].toString());
            student.setSex(obj[3].toString());
            student.setCountry(obj[4].toString());
            student.setMajor(obj[5].toString());
            student.setPassword(obj[6].toString());
            newAl.add(student);
        }
            return newAl;
        
}
       
       
       
       
        public void delete(String studentId)
    {
        
            String sql="delete from student where s_id=?";
           try{
                    //加载驱动
                    Class.forName("oracle.jdbc.OracleDriver");
                    
                    //得到链接
                     ct=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "test", "122588");
                     
            ps=ct.prepareStatement(sql);
            ps.setObject(1,studentId);
            
            ps.executeQuery();
    }catch(Exception e){
        
        e.printStackTrace();
        
    }finally{
        SqlHelper.close(rs, ps, ct);
    }
    
    }
            
          
    
    }
            



    
    


