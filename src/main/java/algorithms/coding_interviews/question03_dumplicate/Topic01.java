/*
  Copyright (C), 2015-2020
  FileName: Topic01
  Author:   caozx
  Date:     2020/1/13 17:17
  Description: 题目一： 找出数组中重复的数字
             在一个长度为n的数组里的所有数字都在0到n-1的范围内。
             数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复的次数。
             请找出数组中任意一个重复的数字。
             例如如果输入长度为7的数组{2,3,1,0,2,5,3},
             那么对应的输出是重复的数字2或者3。
  History:
  <author>        <time>                <desc>
  caozx           2020/1/13 17:17       
 */

package algorithms.coding_interviews.question03_dumplicate;


/**
 * 〈题目一： 找出数组中重复的数字
 * 在一个长度为n的数组里的所有数字都在 0 到 n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复的次数。
 * 请找出数组中任意一个重复的数字。
 * 例如如果输入长度为7的数组{2,3,1,0,2,5,3},
 * 那么对应的输出是重复的数字2或者3。〉
 *
 * @author caozx
 * @date 2020/1/13 17:17
 */
public class Topic01 {


    /**
     * 方法一:
     * 先将数组排序, 再遍历数组查找重复值。
     * 这种方法排序数组需要O(nlogn)的时间。
     */
    public int dumplicate01(int[] intArray) {
        if (!checkout(intArray)) {
            return -2;
        }
        quirkSort(intArray, 0, intArray.length - 1);
        for (int element : intArray) {
            System.out.print(element);
        }
        System.out.println();

        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] == intArray[i + 1]) {
                return intArray[i];
            }
        }


        return -1;
    }

    private void quirkSort(int[] intArray, int left, int right) {
        int loc;
        if (left < right) {
            loc = moveElement(intArray, left, right);
            quirkSort(intArray, left, loc - 1);
            quirkSort(intArray, loc + 1, right);
        }
    }

    private int moveElement(int[] intArray, int left, int right) {
        int low = left;
        while (left < right) {
            while (intArray[low] <= intArray[right] && left < right) {
                right--;
            }
            while (intArray[left] <= intArray[low] && left < right) {
                left++;
            }
            if (intArray[left] > intArray[low] && intArray[right] < intArray[low]) {
                swap(intArray, left, right);
            }
        }
        swap(intArray, low, left);
        return left;
    }

    /**
     * 通过数组构建哈希表，空间复杂度和时间复杂度都为O(n)
     */
    public int dumplicate02(int[] intArray) {
        if (!checkout(intArray)) {
            return -2;
        }
        int[] hashList = new int[intArray.length];
        for (int i : intArray) {
            if (hashList[i] == 0) {
                hashList[i]++;
            } else {
                return i;
            }
        }
        return -1;
    }

    /**
     * 方法三:
     * 遍历数组, 当进行到i位置时, 判断当前位置值(m)是否等于i
     * 等于则判断下一个元素; 不等于则判断m处元素是否等于m
     * 等于则找到重复值, 不等于则交换i位置的元素和m处的元素后继续判断.
     * <p>
     * 这种方法中每个元素最多交换两次便可以找到相应位置, 并且没有创建新的数组,
     * 所以时间复杂度为O(n), 空间复杂为O(1).
     */
    public int dumplicate03(int[] intArray) {
        if (!checkout(intArray)) {
            return -2;
        }

        for (int i = 0; i < intArray.length; i++) {
            while (intArray[i] != i) {
                if (intArray[i] == intArray[intArray[i]]) {
                    return intArray[i];
                }
                swap(intArray, i, intArray[i]);
            }
        }

        return -1;
    }

    /**
     * 交换数组array中 m索引处和n索引处的值
     */
    private void swap(int[] array, int m, int n) {
        int temp = array[m];
        array[m] = array[n];
        array[n] = temp;
    }


    private boolean checkout(int[] intArray) {
        // 判断异常输入: 数组为null 或者数组长度不足2
        if (intArray == null || intArray.length < 2) {
            return false;
        }

        // 判断数值是否符合范围
        for (int i : intArray) {
            if (i < 0 || i > intArray.length - 1) {
                return false;
            }
        }

        return true;

    }

}
