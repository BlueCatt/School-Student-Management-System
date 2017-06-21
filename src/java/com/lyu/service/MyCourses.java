
package com.lyu.service;

import com.lyu.domain.Course;
import java.util.*;

/**
 *
 * @author painter
 */
public class MyCourses {
    HashMap<String,Course> hm=new HashMap<String,Course>();
    
    public ArrayList showMyCourse(){
        ArrayList<Course> al=new ArrayList<Course>();
        
        //遍历hashmap
        Iterator iterator=hm.keySet().iterator();
        while(iterator.hasNext()){
            String id=(String) iterator.next();
            
            //取出course
            Course course=hm.get(id);
            al.add(course);
        }
        return al;
    }
    
    
    //添加课程
    public void addCourse(String id, Course course){
        hm.put(id, course);
    }
    
    
    //删除课程
    public void deleteCourse(String id){
        hm.remove(id);
    }
    
    //更新课程
    public void updateCourse(String id,String nums){
        
    }
    
    //清空课程
    public void clearCourse(){
        hm.clear();;
    }
    
}
