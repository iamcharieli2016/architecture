package com.yaya.factory.abst;

/**
 * Created by lifenghua in 2018/5/18下午5:16
 */
public class AbstractCarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        System.out.println(factory.getBaoma());
    }
}
