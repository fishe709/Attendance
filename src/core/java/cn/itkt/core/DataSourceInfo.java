package cn.itkt.core;

public class DataSourceInfo{ 
    public String connUrl; 
    public String userName; 
    public String password; 
     
    public String toString(){ 
         
        return "(JcbcUrl:"+connUrl+", user:"+userName+", password:"+password+")"; 
    } 

} 
