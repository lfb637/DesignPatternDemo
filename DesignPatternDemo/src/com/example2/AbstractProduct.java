package com.example2;
/**
 *  生产A产品与B产品装箱到产品
 */
public  abstract class AbstractProduct {
        abstract AbstractProductA createProductA();  
        abstract AbstractProductB createProductB();
}
