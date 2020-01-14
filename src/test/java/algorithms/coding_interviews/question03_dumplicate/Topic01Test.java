/*
  Copyright (C), 2015-2020
  FileName: Topic01Test
  Author:   caozx
  Date:     2020/1/14 9:40
  Description: 
  History:
  <author>        <time>                <desc>
  caozx           2020/1/14 9:40       
 */

package algorithms.coding_interviews.question03_dumplicate;


/**
 * 〈〉
 *
 * @author caozx
 * @date 2020/1/14 9:40
 */
public class Topic01Test {

    public static void main(String[] args) {
        Topic01 topic01 = new Topic01();

        // 测试方法1
        int[] intArray01 = new int[]{4, 3, 3, 1, 5, 2, 6, 7, 9, 8};
        int dumplicate01 = topic01.dumplicate01(intArray01);
        System.out.println(dumplicate01);


        // 测试方法1
        int[] intArray02 = new int[]{1, 4, 2, 4, 5, 4, 6};
        int dumplicate02 = topic01.dumplicate01(intArray02);
        System.out.println(dumplicate02);


        // 测试方法3
        int[] intArray03 = new int[]{4, 11, 3, 1, 5, 2, 6, 7, 9, 11};
        int[] intArray04 = new int[]{4, 3, 3, 1, 5, 2, 6, 7, 9, 8};
        int dumplicate03 = topic01.dumplicate03(intArray03);
        int dumplicate04 = topic01.dumplicate03(intArray04);
        System.out.println(dumplicate03);
        System.out.println(dumplicate04);
    }

}
