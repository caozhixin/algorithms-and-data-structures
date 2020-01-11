/*
  Copyright (C), 2015-2020
  FileName: Singleton2
  Author:   caozx
  Date:     2020/1/11 16:11
  Description: 单例模式-懒汉模式-给方法加锁-双重检测-线程安全-效率提升
  History:
  <author>        <time>                <desc>
  caozx           2020/1/11 16:11       单例模式-懒汉模式-给方法加锁-双重检测-线程安全-效率提升
 */

package algorithms.the_sword_refers_to_offer.singleton;


/**
 * 〈单例模式-懒汉模式-给方法加锁-双重检测-线程安全-效率提升〉
 *
 * @author caozx
 * @date 2020/1/11 16:11
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2(){}

    /**
     * 采用双重检测策略, 只有在没有创建实例时才给方法加锁, 这样效率可以有一定提升.
     *
     */
    public static Singleton2 getInstance(){

        if(instance == null){
            synchronized(Singleton2.class){
                if(instance == null){
                    instance = new Singleton2();
                }
            }
        }
        return instance;

    }

}
