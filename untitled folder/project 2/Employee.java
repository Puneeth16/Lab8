/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labproject1;

/**
 *
 * @author koteswararaojavvaji
 */
public class Employee {
    
     //field
    
    private int id;
    private String name;
    private String dob;
   
    
    //method
    
    int getId()
    {
        
        return id;
        
    }//getid
    
    String getName()
    {
        return name;
        
    }//getname
    
    String getDob(){
        return dob;
        
    }//getdob
    
    //constructor
    
    Employee(int id,String name,String dob){
        
        this.id=id;
        this.name=name;
        this.dob=dob;
        
        
    }//cons

    
}
