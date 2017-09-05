/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labproject1;

import java.util.*;

/**
 *
 * @author koteswararaojavvaji
 */
public class Ui {
    
    Scanner s1 = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);
    Scanner s3 = new Scanner(System.in);
    Crud cr = new Crud();
    void showMenu()
    {
        System.out.println("Employee System!!!");
        while(true)
        {
            System.out.println("\n --------MENU-------- \n1.registration\n"+"2.search by id\n" +"3.total number of employee\n" +"4.employee list\n"+"5.quit\n"+"---------------------------\n"+"SELECT MENU 1 - 5:");
            
            int m = s1.nextInt();
            
            if(m==1)
            {
                System.out.println("\nREGISTRATION---------\n"+ " ");
                System.out.println("Enter id:");
                int id = s1.nextInt();
                System.out.println("Enter name:");
                String name = s2.nextLine();
                System.out.println("Enter DOB(mm/dd/yy):");
                String dob = s3.nextLine();
        
    
                Employee emp1 = new Employee(id,name,dob);
                
                Employee result = cr.register(emp1);
                
                System.out.println(result.getId()+" "+result.getName()+" "+result.getDob()+" "+" Successfully registered ");
                
                
                
                
            }
            else if(m==2)
            {
                System.out.println("Search---------\n"+ " ");
                System.out.println("Enter the search id: ");
                int id = s1.nextInt();
                cr.search(id);
                
                
                
            }
            else if(m==3)
            {
                System.out.println("Total Employees---------");
                cr.count();
               
            }
            else if(m==4)
            {
                System.out.println("Employee list---------\n"+ " ");
                
                cr.list();
               
            }
            else if(m==5)
            {
                System.out.println("Terminate the system!");
                break;
            }
            else
            {
                System.out.println("Invalid choice!!! Enter choice Between 1-5");
            }
            
            
        }
        
        
    }//smenue
    
}
