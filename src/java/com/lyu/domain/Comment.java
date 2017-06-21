/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyu.domain;

/**
 *
 * @author painter
 */
public class Comment {
    
    
    private int co_id;
    private int s_id;
    private int c_id;
    private String comment;
    private String date;
    
    
    
    public int getCoId(){
    return co_id;
    }
    public void setCoId(int id){
        this.co_id=id;
    }
    
  
  public int getSId(){
      return s_id;
  }
  public void setSId(int id){
      this.s_id=id;
  }
  
   public int getCId(){
      return c_id;
  }
  public void setCId(int id){
      this.c_id=id;
  }
    
    public String getComment(){
    return comment;
    }
    public void setComment(String s){
        this.comment=s;
    }
    
    
     public String getDate(){
    return date;
    }
     
    public void setDate(String s){
        this.date=s;
    }
    
    
  
}
