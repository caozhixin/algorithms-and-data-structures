/*
  Copyright (C), 2015-2020
  FileName: HungerSingleton
  Author:   caozx
  Date:     2020/1/11 16:18
  Description: 饿汉模式-不涉及线程-耗费资源
  History:
  <author>        <time>                <desc>
  caozx           2020/1/11 16:18       饿汉模式-不涉及线程-耗费资源
 */

package main.algorithms.the_sword_refers_to_offer.singleton;


/**
 * 〈饿汉模式-不涉及线程-耗费资源〉
 *
 * @author caozx
 * @date 2020/1/11 16:18
 */
public class HungerSingleton {

    /**
     * 在调用到此类时就初始化该类, 但是内存不会被释放，造成资源浪费.
     */
    private static final HungerSingleton instance = new HungerSingleton();

    private HungerSingleton() {

    }

    public HungerSingleton getInstance() {
        return instance;
    }

}
