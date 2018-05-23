package com.yaya.factory.simple;

/**
 * Created by lifenghua in 2018/5/18下午1:47
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getCar("BaomaFactory"));
    }
}
