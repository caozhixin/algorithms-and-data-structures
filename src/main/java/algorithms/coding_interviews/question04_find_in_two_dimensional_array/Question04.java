/*
  Copyright (C), 2015-2020
  FileName: Question04
  Author:   caozx
  Date:     2020/1/16 11:43
  Description: 面试题4：在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
  History:
  <author>        <time>                <desc>
  caozx           2020/1/16 11:43       面试题4：在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

package algorithms.coding_interviews.question04_find_in_two_dimensional_array;


/**
 * 〈面试题4：在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。〉
 *
 * @author caozx
 * @date 2020/1/16 11:43
 */
public class Question04 {
    public boolean find(int[][] array, int target) {
        if (array == null
                || array.length < 1
                || array[0].length < 1) {
            return false;
        }
        int row = array.length - 1;
        int col = 0;

        while (row > 0 && col < array[0].length) {
            if (target == array[row][col]) {
                return true;
            } else if (target > array[row][col]) {
                col++;
            } else {
                row--;
            }
        }
        return false;
    }
}
