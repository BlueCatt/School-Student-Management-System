
package com.lyu.domain;

/**
 *
 * @author painter
 */
public class Course {
    
    private int id;
    private String name;
    private String professor;
    private String time;
    private String info;
    private String code;
    
    public int getId(){
    return id;
    }
    public void setId(int id){
        this.id=id;
    }
    
  
  
    
    public String getName(){
    return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    
     public String getProfessor(){
    return professor;
    }
     
    public void setProfessor(String professor){
        this.professor=professor;
    }
    
    
     public String getTime(){
    return time;
    }
    public void setTime(String time){
        this.time=time;
    }
    
     public String getInfo(){
    return info;
    }
    public void setInfo(String info){
        this.info=info;
    }
    
    
     public String getCode(){
    return code;
    }
    public void setCode(String code){
        this.code=code;
    }
}
