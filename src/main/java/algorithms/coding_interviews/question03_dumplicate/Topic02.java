/*
  Copyright (C), 2015-2020
  FileName: Topic02
  Author:   caozx
  Date:     2020/1/14 11:08
  Description: 题目二：不修改数组找出重复的数字 在一个长度为n+1的数组里的所有数字都在1~n的范围内，所以数组中至少有一个数字是重复的。请找出数组中任意一个重复的数字，但是不能修改输入的数组。例如，如果输入长度为8的数组{2,3,5,4,3,2,6,7}，那么对应的输出是重复的数字2或者3。
  History:
  <author>        <time>                <desc>
  caozx           2020/1/14 11:08       题目二：不修改数组找出重复的数字 在一个长度为n+1的数组里的所有数字都在1~n的范围内，所以数组中至少有一个数字是重复的。请找出数组中任意一个重复的数字，但是不能修改输入的数组。例如，如果输入长度为8的数组{2,3,5,4,3,2,6,7}，那么对应的输出是重复的数字2或者3。
 */

package algorithms.coding_interviews.question03_dumplicate;


/**
 * 〈题目二：不修改数组找出重复的数字
 * 在一个长度为n+1的数组里的所有数字都在1~n的范围内，所以数组中至少有一个数字是重复的。
 * 请找出数组中任意一个重复的数字，但是不能修改输入的数组。
 * 例如，如果输入长度为8的数组{2,3,5,4,3,2,6,7}，那么对应的输出是重复的数字2或者3。〉
 *
 * @author caozx
 * @date 2020/1/14 11:08
 */
public class Topic02 {

    public int dumplicate(int[] intArray) {
        if (!checkout(intArray)) {
            return -2;
        }
        int start = 0;
        int end = intArray.length - 1;
        while (start <= end) {
            int mid = ((end - start) >> 1) + start; //相当于(end - start) / 2 + start;
            int count = countRange(intArray, start, mid);
            if (start == end) {
                if (count > 1) {
                    return start;
                } else {
                    break;
                }
            }
            if (count > mid - start + 1) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private int countRange(int[] intArray, int start, int end) {
        int count = 0;
        for (int i : intArray) {
            if (i >= start && i <= end) {
                count++;
            }
        }
        return count;
    }

    private boolean checkout(int[] intArray) {
        // 判断异常输入: 数组为null 或者数组长度不足2
        if (intArray == null || intArray.length < 2) {
            return false;
        }

        // 判断数值是否符合范围
        for (int i : intArray) {
            if (i < 1 || i > intArray.length - 1) {
                return false;
            }
        }

        return true;

    }


}
