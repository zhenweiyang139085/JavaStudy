package com.yzw.design;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @Auther: yzw
 * @Date: 2020/8/1 - 08 - 01 - 14:39
 */
//懒汉式3 双重检查锁
public class Singleton05 {
    private static volatile Singleton05 instance;
    //私有构造方法
    private Singleton05(){}

    public static Singleton05 getInstance()  {
       if(instance==null){
           synchronized(Singleton05.class){
               try {
                   Thread.sleep(10);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               if(instance==null){
                   instance =  new Singleton05();
               }
           }

       }
       return instance;
    }


    public static void main(String[] args) throws InterruptedException {
        HashSet set = new HashSet();
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                System.out.println(Singleton05.getInstance().hashCode());
                set.add(Singleton05.getInstance().hashCode());
            }).start();
        }
        Thread.sleep(10000);
        System.out.println("---"+ set.size());
    }
}
