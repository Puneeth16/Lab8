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
public class Crud {
    
    //field
    int id;
    Db db = new Db();
    
    
    //method
    
    Employee register(Employee e)
    {
        Employee result = db.register(e);
        
        return result;
        
        
        
    }//reg
    
    void list()
    {
          db.list();
       
    }//list
    
    void count()
    {
        db.count();
    }//count
    
    
    void search(int id)
    {
        this.id = id;
        db.search(id);
    }
    
    
    
    ///constructor
    
    
}
