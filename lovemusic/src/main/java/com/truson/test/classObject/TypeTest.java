package com.truson.test.classObject;

/**
 * Java类型信息相关测试
 * Created by lezi on 2015/12/19.
 */
interface WaterProof{};

class Toy{
    private int count;
    Toy(){};
    Toy(int i){
        count = i;
    }
}

class FantasyToy extends Toy implements WaterProof{
    FantasyToy(int i){
        super(i);
    }
}

//测试Class类对象的某些方法
class TypeTest{
    static void printInfo(Class<?> classObject){
        System.out.println("this classObject is " + (classObject.isInterface()?"Interface":"Class"));
        System.out.println("It's name is " + classObject.getName());
    }
    public static void main(String[] args){
        Class<FantasyToy> classObject = FantasyToy.class;
        Class<? super FantasyToy> up = classObject.getSuperclass();
        //下面这两种写法都会造成编译器报错，说明classObject.getSuperclass(方法并不能返回具体的父类型)
        //Class<Toy> up1 = classObject.getSuperclass();
        try {
            //Toy toy = up.newInstance();
            Object object = up.newInstance();
        }catch (Exception e){
            //todo
        }
        printInfo(classObject);
        printInfo(classObject.getSuperclass());
        printInfo(classObject.getInterfaces()[0]);
    }
}







