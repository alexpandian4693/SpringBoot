package com.java.decorater;

import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
public class DecoratorPattern {  
    private static int  choice;  
    public static void main(String args[]) throws NumberFormatException, IOException    {  
       do{        
        System.out.print("========= Mobile List ============ \n");  
        System.out.print("            1. Android.   \n");  
        System.out.print("            2. Iphone.\n");  
        System.out.print("            3. padmobile.         \n");  
        System.out.print("            4. Exit                        \n");  
        System.out.print("Enter your choice: ");  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
        choice=Integer.parseInt(br.readLine());  
        switch (choice) {  
        case 1:{   
        	Android mob=new Android();  
              System.out.println(mob.name());  
              System.out.println( mob.price());  
            }  
            break;  
              
                case 2:{  
                	Mobile mob1=new Iphone((Mobile) new Android());  
                    System.out.println(mob1.name());  
                System.out.println( mob1.price());  
        }  
            break;    
     case 3:{  
    	 Mobile mob2=new Padmobile((Mobile) new Android());  
                     System.out.println(mob2.name());  
                    System.out.println( mob2.price());  
              }  
            break;    
              
         default:{    
            System.out.println("These mobiles are no  available");  
        }         
    return;  
     } 
          
}while(choice!=4);  
    }  
}  