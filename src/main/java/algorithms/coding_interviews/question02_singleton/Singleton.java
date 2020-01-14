/*
  Copyright (C), 2015-2020
  FileName: Singleton
  Author:   caozx
  Date:     2020/1/11 15:59
  Description: 单例模式-懒汉模式-非线程安全
  History:
  <author>        <time>                <desc>
  caozx           2020/1/11 15:59       单例模式-懒汉模式-非线程安全
 */

package algorithms.coding_interviews.question02_singleton;


/**
 * 〈面试题2：单例模式-懒汉模式-非线程安全〉
 *
 * @author caozx
 * @date 2020/1/11 15:59
 */
public class Singleton {

    private static Singleton instance;

    // 构造方法私有化
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

}
