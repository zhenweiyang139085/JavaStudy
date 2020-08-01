package com.yzw.design;

/**
 * @Auther: yzw
 * @Date: 2020/8/1 - 08 - 01 - 14:39
 */
//懒汉式1
public class Singleton03 {
    private static Singleton03 instance;
    //私有构造方法
    private Singleton03(){}

    public Singleton03 getInstance(){
       if(instance==null){
           instance =  new Singleton03();
       }
       return instance;
    }


    public static void main(String[] args) {

    }
}
