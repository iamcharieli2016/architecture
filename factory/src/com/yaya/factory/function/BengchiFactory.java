package com.yaya.factory.function;

import com.yaya.factory.Bengchi;
import com.yaya.factory.Car;

/**
 * Created by lifenghua in 2018/5/18下午5:16
 */
public class BengchiFactory implements Factory{


    @Override
    public Car getCar() {
        return new Bengchi();
    }
}
