
package com.lyu.domain;

/**
 *
 * @author painter
 */
public class chat {
    private int ch_id;
    private String send_id;
    private String get_id;
    private String date;
    private String message;
    
     public int getCh_id(){
    return ch_id;
    }
    public void setCh_id(int id){
        this.ch_id=id;
    }
    
     public String getSend_id(){
    return send_id;
    }
    public void setSend_id(String id){
        this.send_id=id;
    }
    
     public String getGet_id(){
    return get_id;
    }
    public void setGet_id(String id){
        this.get_id=id;
    }
    
    public String getMessage(){
    return message;
    }
    public void setMessage(String s){
        this.message=s;
    }
    
    
     public String getDate(){
    return date;
    }
     
    public void setDate(String s){
        this.date=s;
    }
    
    
}
