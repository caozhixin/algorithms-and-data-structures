/*
  Copyright (C), 2015-2020
  FileName: Singleton1
  Author:   caozx
  Date:     2020/1/11 16:03
  Description: 单例模式-懒汉模式-给方法加锁-线程安全-但效率较低
  History:
  <author>        <time>                <desc>
  caozx           2020/1/11 16:03       单例模式-懒汉模式-线程安全
 */

package algorithms.the_sword_refers_to_offer.singleton;


/**
 * 〈单例模式-懒汉模式-给方法加锁-线程安全-但效率较低〉
 *
 * @author caozx
 * @date 2020/1/11 16:03
 */
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1(){}

    /**
     * 引入了线程锁 synchronized
     */
    public synchronized static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }

}
