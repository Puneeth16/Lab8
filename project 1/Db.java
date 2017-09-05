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
public class Db {
    
    //field
    
    Employee DB[] = new Employee[10];
    
    int db1=0;
    
    
    
    //method
    
   Employee register(Employee e)
            {
                DB[db1] = e;
                /*System.out.println("Stored details are: ");
                System.out.println("Memory Locastion is: "+DB[db1]);
                System.out.println(DB[db1].getId());
                System.out.println(DB[db1].getName());
                System.out.println(DB[db1].getDob());
                
                */
                
                Employee result = DB[db1];
                
                db1++;
                
                return result;
            }//reg
    
    void list()
    {
            
            System.out.println("\n EMPLOYEE LIST IS: \n");
            for(db1=0;db1<10;db1++)
            {
                if(DB[db1]!=null)
                {
                    System.out.println(" "+DB[db1].getId()+" "+DB[db1].getName()+" "+DB[db1].getDob());
                }//fi
            }//fr
    }//list
    
    void count()
    {
           int count=0;
            System.out.println("\nTotal Number of EMPLOYEE:\n");
            for(db1=0;db1<10;db1++)
            {
                if(DB[db1]!=null)
                {
                    count++;
                }//fi
                
            }//fr
            System.out.println(count);
        
    }
   
   void search(int id)
    {
        
            for(db1=0;db1<10;db1++)
            {
                if(DB[db1]!=null)
                {
                    if(DB[db1].getId()==id)
                     {
                         System.out.println(DB[db1].getId()+" "+DB[db1].getName()+" "+DB[db1].getDob());
                         break;
                      }//fi nested
                     
                }//fi
                if(db1==9)
                     {
                        System.out.println("Sorry!! Not a valid Employee id");
                     }
                
            }//fr
        
        

        
        
    }
   
    
    //cons
    
    
    
}//db
