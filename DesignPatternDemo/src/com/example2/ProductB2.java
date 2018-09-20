package com.example2;
/**
 *  抽象类/接口不能被实例化
 * */
public class ProductB2 extends AbstractProductB{
	public void createProductB1() {
		   //System.out.println("B1产品被生产");
	} 
	public void createProductB2() {
		 System.out.println("B2产品被生产");
	}
}
