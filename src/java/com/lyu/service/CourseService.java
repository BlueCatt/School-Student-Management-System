
package com.lyu.service;

import com.lyu.domain.Course;
import com.lyu.util.SqlHelper;
import java.util.ArrayList;

/**
 *
 * @author painter
 */
public class CourseService {
    
    //根据课程编号返回课程实例
    public Course getCourseById(String id){
        Course course=new Course();
        String sql="select * from Course where c_id=?";
        String paras[]={id};
        ArrayList al=new SqlHelper().executeQuery(sql, paras);
        if(al.size()==1){
            Object [] obj=(Object[]) al.get(0);
            course.setId(Integer.parseInt(obj[0].toString()));
            course.setName(obj[1].toString());
            course.setProfessor(obj[2].toString());
            course.setTime(obj[3].toString());
            course.setInfo(obj[4].toString());
            course.setCode(obj[5].toString());
    }
        return course;
}
    
    
    
    public ArrayList getAllCourses(){
    
        String sql="select * from course where 1=?";
        String paras[]={"1"};
        ArrayList al=new SqlHelper().executeQuery(sql, paras);
        ArrayList<Course> newAl=new ArrayList<Course>();
        //二次业务封装
        for(int i=0;i<al.size();i++){
            Object obj[]=(Object[]) al.get(i);
            Course course=new Course();
            course.setId(Integer.parseInt(obj[0].toString()));
            course.setName(obj[1].toString());
            course.setProfessor(obj[2].toString());
            course.setTime(obj[3].toString());
            course.setInfo(obj[4].toString());
            course.setCode(obj[5].toString());
            newAl.add(course);
        }
        
        
            return newAl;
        }
    
    
    
   
    
    //根据专业返回课程实例
    public Course getCourseByMajor(String major){
        Course course=new Course();
        String sql="select * from Course where c_major=?";
        String paras[]={major};
        ArrayList al=new SqlHelper().executeQuery(sql, paras);
        if(al.size()==1){
            Object [] obj=(Object[]) al.get(0);
            course.setId(Integer.parseInt(obj[0].toString()));
            course.setName(obj[1].toString());
            course.setProfessor(obj[2].toString());
            course.setTime(obj[3].toString());
            course.setInfo(obj[4].toString());
            course.setCode(obj[5].toString());
    }
        return course;
}
    
    
    
}
