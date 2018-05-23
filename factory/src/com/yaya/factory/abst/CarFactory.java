package com.yaya.factory.abst;

import com.yaya.factory.Car;
import com.yaya.factory.function.BaomaFactory;
import com.yaya.factory.function.BengchiFactory;

/**
 * Created by lifenghua in 2018/5/18下午5:22
 */
public class CarFactory extends AbstractCarFactory{

    @Override
    public Car getBaoma() {
        return new BaomaFactory().getCar();
    }

    @Override
    public Car getBenchi() {
        return new BengchiFactory().getCar();
    }
}
