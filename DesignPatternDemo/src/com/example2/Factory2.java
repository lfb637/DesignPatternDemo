package com.example2;

public  class Factory2 extends AbstractProduct{
	AbstractProductA createProductA(){
    	return new ProductA2();
    }
    AbstractProductB createProductB(){
    	return new ProductB2();      
    }
}
