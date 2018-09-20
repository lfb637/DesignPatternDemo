package com.example2;

public class Test {
	public static void main(String[] args) {
		   /**
		    * 创建不同工厂,但产品是一致的 
		    * 
		    * */
	       AbstractProduct abt1 = new Factory1();	                 //创建1工厂 
	       AbstractProduct abt2 = new Factory2();	                //创建2工厂 
	       AbstractProductA  productA1 = abt1.createProductA();    //创建A类产品
	       AbstractProductB  productB1 = abt1.createProductB();   //创建B类产品
	       AbstractProductA  productA2 = abt2.createProductA();  //创建A类产品
	       AbstractProductB  productB2 = abt2.createProductB(); //创建B类产品
	       productA1.createProductA1();      //A1产品信息
	       productB1.createProductB1();     //B1产品信息 
	       productA2.createProductA2();    //A2产品信息
	       productB2.createProductB2();   //B2产品信息 
          
	       
	}
}
