package com.truson.test.classObject;

/**
 * 工厂模式理解
 * 这么玩儿的作用是什么.....
 * 隐藏对象的具体创建过程...但是貌似在我的例子里看不到任何必要
 * Created by lezi on 2015/12/20.
 */

interface Factory<T> {
    T create();
}

abstract class Shape{
    void draw(){
        System.out.println(getClass().getSimpleName() + ":draw()");
    }
    public abstract String toString();
}

class Circle extends Shape{
    @Override
    public String toString() {
        return "Circle";
    }
}

class CircleFactory implements Factory<Circle>{
    public Circle create() {
        return new Circle();
    }
}

class Part{
    public String toString(){
        return getClass().getName();
    }
    public static Part createPart(){
        Factory<? extends Part> thisPart = new FuelFilter.FuelFactory();
        return thisPart.create();
    }
}

class Filter extends Part{}

class FuelFilter extends Filter{
    static class FuelFactory implements Factory<FuelFilter>{
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

public class FactoryTest{
    public static void main(String[] args){
        System.out.println(Part.createPart());
    }
}