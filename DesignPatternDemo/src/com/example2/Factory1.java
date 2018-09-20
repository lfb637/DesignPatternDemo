package com.example2;

public class Factory1 extends AbstractProduct{
    AbstractProductA createProductA(){
    	return new ProductA1();
    }
    AbstractProductB createProductB(){
		return new ProductB1();
    }
}
