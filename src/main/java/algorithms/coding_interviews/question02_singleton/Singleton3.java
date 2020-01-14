/*
  Copyright (C), 2015-2020
  FileName: Singleton3
  Author:   caozx
  Date:     2020/1/11 16:28
  Description: 静态内部类
  History:
  <author>        <time>                <desc>
  caozx           2020/1/11 16:28       静态内部类
 */

package algorithms.coding_interviews.question02_singleton;


/**
 * 〈面试题2：单例模式-静态内部类〉
 * 通过静态内部类的方式进行, 达到按需创建的目的
 *
 * @author caozx
 * @date 2020/1/11 16:28
 */
public class Singleton3 {

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static Singleton3 instance = new Singleton3();
    }

}
