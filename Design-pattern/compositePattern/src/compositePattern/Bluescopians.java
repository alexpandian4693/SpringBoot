package compositePattern;

public interface Bluescopians {
	public  int getId();  
    public String getName();  
    public double getSalary();  
       public void print();  
    public void add(Bluescopians employee);  
       public void remove(Bluescopians employee);  
       public Bluescopians getChild(int i); 

}
