package com.yaya.factory.simple;

import com.yaya.factory.Baoma;
import com.yaya.factory.Bengchi;
import com.yaya.factory.Car;

/**
 * Created by lifenghua in 2018/5/18下午1:27
 */
public class SimpleFactory {

    public Car getCar(String name) {

        if (name.equals("BaomaFactory")) {
            return new Baoma();
        } else if (name.equals("Bengchi")) {
            return new Bengchi();
        } else {
            return null;
        }

    }
}
