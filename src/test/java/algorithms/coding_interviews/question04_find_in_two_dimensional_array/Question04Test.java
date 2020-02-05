/*
  Copyright (C), 2015-2020
  FileName: Question04Test
  Author:   caozx
  Date:     2020/1/16 11:52
  Description: 
  History:
  <author>        <time>                <desc>
  caozx           2020/1/16 11:52       
 */

package algorithms.coding_interviews.question04_find_in_two_dimensional_array;


/**
 * 〈〉
 *
 * @author caozx
 * @date 2020/1/16 11:52
 */
public class Question04Test {
    public static void main(String[] args) {
        Question04 question04 = new Question04();
        int[][] array = null;
        System.out.println("在空数组中是否有7: " + question04.find(array, 7));
        array = new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}};
        System.out.println("在非空数组中是否有7: " + question04.find(array, 7));

    }
}
