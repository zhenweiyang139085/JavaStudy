package com.yzw.design;

/**
 * @Auther: yzw
 * @Date: 2020/8/1 - 08 - 01 - 14:39
 */
//饿汉式01
public class Singleton01 {
    private static final Singleton01 instance=new Singleton01();
    //私有构造方法
    private Singleton01(){}
    public Singleton01 getInstance(){
        return instance;
    }

    public static void main(String[] args) {

    }
}
