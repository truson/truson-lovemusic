package com.truson.test.dataStructure.array;

import org.springframework.util.StringUtils;

import java.util.ArrayList;

/**
 * 学习数组相关知识并加以实践
 * Created by lezi on 2015/10/22.
 */

//数组初始化
public class Array {

    public interface Interface0{
        int a = 0;
    }

    public interface Interface1 extends Interface0{
        int a = 1;
    }

    public interface Interface2{
        int a = 2;
    }

    public static class Father implements Interface1{
        public static int a = 3;
    }

    public static class Sub extends Father implements Interface2{
        public static int a = 4;
    }

    static String str = "good";
    static char[] ch = {'a','b','c'};

    public static void exchange(String str, char[] ch){
        str = "ok";
        ch[0] = 'g';
    }

    public static void addList(ArrayList list){
        if(list == null)
            list = new ArrayList();
        String a = new String("test");
        list.add(a);
        for (Object b : list) {
            System.out.println(String.valueOf(b));
        }
    }

    public static void main(String[] args){

        /*验证引用类型为参数时的情况
        //ArrayList list = null;
        ArrayList list = new ArrayList();
        addList(list);
        if(list == null) {
            System.out.println("null");
        }else {
            for (Object a : list) {
                System.out.println(String.valueOf(a));
            }
        }*/

        /*验证String对象为final类型的特点
        exchange(str, ch);
        System.out.println(str + " and " + ch[0]);*/

        /*测试继承关系和变量的关系
        System.out.println(Sub.a);*/

        /*测试各类数组创建方式
        String[] array1 = new String[]{"a", "b", "c", "d"};
        String[] array3 = {"a", "b", "c", "d"};
        String[] array4 = new String[4];
        array4[0] = new String("a");
        array4[1] = new String("b");
        array4[2] = new String("c");
        array4[3] = new String("d");

        System.out.println("静态方式1：" + arrayToString(array1));
        System.out.println("静态方式2：" + arrayToString(array3));
        System.out.println("动态方式：" + arrayToString(array4));*/
    }

    public static String arrayToString(String[] array){
        String resultString = "";
        for(int i=0; i<array.length; i++){
            if(StringUtils.isEmpty(resultString)) {
                resultString += array[i];
                continue;
            }
            resultString = resultString + "," + array[i];
        }
        return resultString;
    }
}
