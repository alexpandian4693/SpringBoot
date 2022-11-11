package compositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hr implements Bluescopians {
	
    private int id;  
    private String name;  
    private double salary;  
 
    public Hr(int id,String name,double salary) {  
     this.id=id;      
     this.name = name;  
     this.salary = salary;  
    }  
        List<Bluescopians> employees = new ArrayList<Bluescopians>();  

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}


	@Override
	public void add(Bluescopians employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Bluescopians employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Bluescopians getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	  @Override  
	     public void print() {  
	      System.out.println("==========================");  
	      System.out.println("Id ="+getId());  
	      System.out.println("Name ="+getName());  
	      System.out.println("Salary ="+getSalary());  
	      System.out.println("==========================");  
	        
	      Iterator<Bluescopians> it = employees.iterator();  
	        
	          while(it.hasNext())  {  
	        	  Bluescopians employee = it.next();  
	            employee.print();  
	         }  
	     }  

}
