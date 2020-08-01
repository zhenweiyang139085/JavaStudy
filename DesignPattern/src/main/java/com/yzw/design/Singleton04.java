package com.yzw.design;

/**
 * @Auther: yzw
 * @Date: 2020/8/1 - 08 - 01 - 14:39
 */
//懒汉式2
public class Singleton04 {
    private static Singleton04 instance;
    //私有构造方法
    private Singleton04(){}

    public synchronized  static Singleton04 getInstance(){
       if(instance==null){
           instance =  new Singleton04();
       }
       return instance;
    }


    public static void main(String[] args) {

    }
}
