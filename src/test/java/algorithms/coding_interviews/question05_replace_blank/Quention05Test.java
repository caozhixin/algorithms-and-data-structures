/*
  Copyright (C), 2015-2020
  FileName: Quention05Test
  Author:   caozx
  Date:     2020/1/16 18:07
  Description: 
  History:
  <author>        <time>                <desc>
  caozx           2020/1/16 18:07       
 */

package algorithms.coding_interviews.question05_replace_blank;


/**
 * 〈〉
 *
 * @author caozx
 * @date 2020/1/16 18:07
 */
public class Quention05Test {

    public static void main(String[] args) {
        String s = "helle world, my name is caozx.";
        String s1 = "helleworld.";
        Question05 question05 = new Question05();
        System.out.println(question05.replaceBlank1(s));
        System.out.println(question05.replaceBlank1(null));
        System.out.println(question05.replaceBlank1(s1));
        System.out.println(question05.replaceBlank2(s));
        System.out.println(question05.replaceBlank2(null));
        System.out.println(question05.replaceBlank2(s1));

    }
}
