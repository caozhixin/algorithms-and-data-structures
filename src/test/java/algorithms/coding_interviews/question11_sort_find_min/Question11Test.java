/*
  Copyright (C), 2015-2020, Bitnei
  FileName: Question11Test
  Author:   caozx
  Date:     2020/2/28 12:18
  Description: 
  History:
  <author>        <time>                  <version>          <desc>
  caozx           2020/2/28 12:18         版本号              
 */

package algorithms.coding_interviews.question11_sort_find_min;


import org.junit.jupiter.api.Test;

/**
 * 〈面试题11: 旋转数组的最小数字
 * 题目:
 * 把一个数组最开始的若干个元素搬到数组的末尾, 我们称之为数组的旋转.
 * 输入一个递增排序的数组的一个旋转, 输出旋转数组的最小元素.
 * 例如: 数组{3，4，5，1，2}为{1，2，3，4，5}的一个选装，该数组的最小值为1.〉
 *
 * @author caozx
 * @date 2020/2/28 12:18
 */
public class Question11Test {

    /**
     * 快排
     */
    @Test
    public void quickSortTest() {

        Question11 question11 = new Question11();
        int[] array = new int[]{8, 4, 6, 3, 7, 3, 8, 2, 1};
        System.out.println("原始数组：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("输出快速排序的结果：");
        question11.quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();

    }

    /**
     * 旋转数组的最小数字
     */
    @Test
    public void min() {
        Question11 question11 = new Question11();
        int[] array = new int[]{7, 8, 9, 1, 1, 4, 5, 6};
        System.out.println("原始数组：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        try {
            System.out.println("最小值：" + question11.min(array));
        } catch (Exception e) {
            e.printStackTrace();
        }

        int[] array1 = new int[]{1, 1, 1, 1, 1, 0, 1};
        System.out.println("原始数组：");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        try {
            System.out.println("最小值：" + question11.min(array1));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
