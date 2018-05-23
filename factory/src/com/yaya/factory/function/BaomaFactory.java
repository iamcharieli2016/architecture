package com.yaya.factory.function;

import com.yaya.factory.Baoma;
import com.yaya.factory.Car;

/**
 * Created by lifenghua in 2018/5/18下午5:18
 */
public class BaomaFactory implements Factory{

    @Override
    public Car getCar() {
        return new Baoma();
    }
}
