package com.java.decorater;
public abstract class MobileDecorator implements Mobile{  
    private Mobile newMobile;  
    public MobileDecorator(Mobile newMobile)  {  
        this.newMobile=newMobile;  
    }  
    @Override  
    public String name(){  
        return newMobile.name();   
    }  
    public double price(){  
        return newMobile.price();  
    }  
}  
