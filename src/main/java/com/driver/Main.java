package com.driver;

public class Main {
  public static void main(String args[]){
    
  }
  class A{
    public String meth(){
      return "Invoking method from class A";
    }
  }
  class B extends A{
    B obj1=new B();
    super.meth();
    public String meth(){
      return "Method is overridden in Extendend class B";
    }
    obj1.meth();
  }
    
}
