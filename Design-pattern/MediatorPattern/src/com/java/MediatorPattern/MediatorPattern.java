package com.java.MediatorPattern;
public class MediatorPattern {
	
	public static void main(String args[])
	{
		
	      ChatRoom chat = new ChatRoomImpl();
	
	      User1 u1=new User1(chat);
	      u1.setname("MSD");
	      u1.sendMsg("Hi MSD! ?");
	  
	          
		  User2 u2=new User2(chat);
		  u2.setname(" Raina");
		  u2.sendMsg("Hello");
	}

}
