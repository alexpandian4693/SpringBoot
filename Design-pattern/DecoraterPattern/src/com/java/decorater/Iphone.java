package com.java.decorater;

public class Iphone extends MobileDecorator{    
    public Iphone(Mobile newMobile) {  
        super(newMobile);  
    }  
    public String name(){  
        return super.name() +" With Charger  ";   
    }  
    public double price()   {  
        return super.price()+150000.0;  
    }  
}  
