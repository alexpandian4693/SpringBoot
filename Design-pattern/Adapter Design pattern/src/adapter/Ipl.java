package adapter;

import com.java.StrikeRate.StrikeRate;
import com.java.adapter.batsman;
import java.io.BufferedReader;  
import java.io.InputStreamReader;  

public class Ipl extends StrikeRate implements batsman {
	
	
	
	
	public Ipl(String playername, Integer over, Integer run) {
		super(playername, over, run);
		// TODO Auto-generated constructor stub
	}
	public void StrikeRate() {
		try 
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			System.out.println("Enter the player name:");
			String playername=br.readLine();  
			 System.out.print("\n");  
			 
			  System.out.print("Enter the over:");  
			   Integer over=Integer.parseInt(br.readLine());  
			   System.out.print("\n");  
			   setPlayername(playername);
			   setOver(over);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	public String Matches() {
	
	   String Playername=getPlayername();  
	   Integer over=getOver();  
	   return (Playername + "$" + over);
	}
	   
	     
	

}
