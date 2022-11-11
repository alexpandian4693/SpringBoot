package compositePattern;

public class CompositePattern {  
    public static void main(String args[]){  
    	Bluescopians emp1=new Cashier(101,"Naveen Kumar", 20000.0);  
         Bluescopians emp2=new Cashier(102,"Mohan Kumar", 25000.0);  
         Bluescopians emp3=new Accountant(103,"Maya", 30000.0);   
         Bluescopians manager1=new Hr(100,"Beena",100000.0);              
         
         manager1.add(emp1);  
          manager1.add(emp2);  
          manager1.add(emp3);  
          manager1.print();  
        }  
}
