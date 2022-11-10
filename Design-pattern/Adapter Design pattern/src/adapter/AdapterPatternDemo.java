package adapter;

import com.java.adapter.batsman;

public class AdapterPatternDemo {
	
	public static void main(String args[]){  
		batsman targetInterface = new Ipl(null, null, null);
		  targetInterface.StrikeRate();
		  System.out.print(targetInterface.Matches());  
			

}
}
