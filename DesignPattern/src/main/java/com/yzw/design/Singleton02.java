package com.yzw.design;

/**
 * @Auther: yzw
 * @Date: 2020/8/1 - 08 - 01 - 14:39
 */
//饿汉式02
public class Singleton02 {
    private static  Singleton02 instance;
    //私有构造方法
    private Singleton02(){}
    static {
        instance=new Singleton02();
    }

    public Singleton02 getInstance(){
        return instance;
    }
    public static void main(String[] args) {

    }
}
