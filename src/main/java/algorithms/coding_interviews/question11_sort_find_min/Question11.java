/*
  Copyright (C), 2015-2020, Bitnei
  FileName: Question11
  Author:   caozx
  Date:     2020/2/28 12:18
  Description: 
  History:
  <author>        <time>                  <version>          <desc>
  caozx           2020/2/28 12:18         版本号              
 */

package algorithms.coding_interviews.question11_sort_find_min;


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
public class Question11 {

    /**
     * 快排
     *
     * @param array
     * @param low
     * @param high
     */
    public void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = partition(array, low, high);
        quickSort(array, low, pivot - 1);
        quickSort(array, pivot + 1, high);

    }

    private int partition(int[] array, int low, int high) {

        if (low >= high) {
            return -1;
        }

        /**
         * 这种选基准点的策略比较粗暴
         * 【补充】：基准点的选取
         * https://www.cnblogs.com/y3w3l/p/6444837.html
         * https://blog.csdn.net/liuyi1207164339/article/details/50827608
         */
        int key = array[low];

        while (low < high) {
            while (array[high] >= key && low < high) {
                high--;
            }
            array[low] = array[high];
            while (array[low] <= key && low < high) {
                low++;
            }
            array[high] = array[low];
        }

        array[low] = key;// 执行到此代码时 high = low ,所以给谁赋值都可以

        return high;

    }


    /**
     * 旋转数组的最小数字
     * 思路: 使用二分法进行查找
     * 设置两个指针，第一个变量指向第一个元素，第二个变量指向最后一个元素
     * 找到中间的数，首先和第一个变量进行对比，若是比第一个变量大，则中间元素属于前半部分数组，将第一个元素的指向移到中间位置
     * 然后和第二个变量进行对比，若是比第二个变量小，则中间元素属于后半部分数组，将第二个元素的指向移到中间位置
     * 查找范围缩小一半，再进行新一轮的查找。。。
     * 直到第一个指向前半部分数组的最后一个，第二个指向后半数组的第一个，也就是两者相邻
     * 第二个指向的就是最小的元素
     * <p>
     * 其中根据旋转数组的定义还有一个特例，也就是将排序数组的前面0个元素搬到最后去，
     * 也就是排序数组本身，这仍然是数组的一个旋转，也就是第一个数字大于最后一个数字时，直接返回第一个数字就可
     * 若是左中右三值相等时，又该如何呢，前面的思路不能支持这种情况，
     * 所以原来的方法不可行，
     * 例如：1，0，1，1，1与1，1，1，0，1情况
     * 这里我们采用顺序查找的方式进行
     *
     * @return
     */
    public int min(int[] array) throws Exception {
        if (array == null || array.length <= 0) {
            throw new Exception("数组异常");
        }
        int left = 0;
        int right = array.length - 1;
        int mid = left;
        while (array[left] >= array[right]) {

            if (right - left == 1) {
                mid = right;
                break;
            }

            mid = (right + left) / 2;
            if (array[right] == array[mid] && array[mid] == array[left]) {
                mid = minInOrder(array, left, right);
            }

            if (array[mid] >= array[left]) {
                left = mid;
            }
            if (array[mid] <= array[right]) {
                right = mid;
            }

        }


        return array[mid];
    }

    private int minInOrder(int[] array, int low, int high) {
        int min = low;
        for (int i = low; i <= high; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }

}
