package com.java.decorater;

public class Padmobile extends MobileDecorator{  
    public Padmobile(Mobile newMobile)    {  
          super(newMobile);  
    }  
      public String name(){  
          return super.name() +" With Earphone ";   
      }  
      public double price()   {  
          return super.price()+650.0;  
          }  
  }  
