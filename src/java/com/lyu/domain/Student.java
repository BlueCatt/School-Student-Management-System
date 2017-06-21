package com.lyu.domain;

/**
 *
 * @author painter
 */
public class Student {
    private int id;
    private String password;
    private String lname;
    private String fname;
    private String major;
    private String country;
    private String sex;
    
    public int getId(){
    return id;
    }
    public void setId(int id){
        this.id=id;
    }
    
     public String getPassword(){
    return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    
    public String getLname(){
    return lname;
    }
    public void setLname(String lname){
        this.lname=lname;
    }
    
    public String getFname(){
    return fname;
    }
    public void setFname(String fname){
        this.fname=fname;
    }
    
    public String getSex(){
    return sex;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    
    public String getMajor(){
    return major;
    }
    public void setMajor(String major){
        this.major=major;
    }
    
    public String getCountry(){
    return country;
    }
    public void setCountry(String country){
        this.country=country;
    }
    
   
    
    
}
