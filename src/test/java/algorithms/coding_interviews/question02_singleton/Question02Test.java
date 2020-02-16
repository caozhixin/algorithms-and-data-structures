/*
  Copyright (C), 2015-2020, Bitnei
  FileName: Question02Test
  Author:   caozx
  Date:     2020/2/16 19:12
  Description: 
  History:
  <author>        <time>                  <version>          <desc>
  caozx           2020/2/16 19:12         版本号              
 */

package algorithms.coding_interviews.question02_singleton;


import org.junit.Test;

/**
 * 〈〉
 *
 * @author caozx
 * @date 2020/2/16 19:12
 */
public class Question02Test {

    @Test
    public void hungerSingletonTest(){
        HungerSingleton instance = HungerSingleton.getInstance();

        HungerSingleton instance1 = HungerSingleton.getInstance();

        System.out.println(instance == instance1);
    }

}
