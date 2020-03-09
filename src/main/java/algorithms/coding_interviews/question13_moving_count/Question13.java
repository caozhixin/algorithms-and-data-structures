/*
  Copyright (C), 2015-2020
  FileName: Question13
  Author:   caozx
  Date:     2020/3/9 17:27
  Description: 
  History:
  <author>        <time>                <desc>
  caozx           2020/3/9 17:27       
 */

package algorithms.coding_interviews.question13_moving_count;


/**
 * 〈
 * 面试题13：机器人的运动范围
 * 题目：地上有一个m行n列的方格。一个机器人从坐标（0，0）的格子开始移动，
 * 它每次可以向上、下、左、右移动一格，但不能进入行坐标和列坐标的数位之和大于k的格子
 * 例如：当k为18时，机器人能够进入方格为（35，37），因为3+5+3+7=18.
 * 但它不能进（35，38），因为3+5+3+8=19.
 * 请问该机器人能够到达多少个格子
 * <p>
 * 思路:
 * 和面试题12类似，这个方格也可以看成一个m*n的矩阵。
 * 同样在这个矩阵中，除边界上的格子之外其他格子都有四个相邻的格子。
 * 机器人从坐标(0,0)开始移动。
 * 当它准备进入坐标为(i，j)的格子时，通过检查坐标的数位和来判断机器人是否能够进入。
 * 如果机器人能够进入坐标为(i，j)的格子，
 * 我们接着再判断它能否进入四个相邻的格子(i，j-1)、(i-1，j),(i，j+1)和(i+1，j)。
 * 〉
 *
 * @author caozx
 * @date 2020/3/9 17:27
 */
public class Question13 {

    /**
     * 返回机器人能到达的格子数
     *
     * @param threshold 阈值
     * @param rows      矩阵行数
     * @param cols      矩阵列数
     * @return
     */
    public int movingCount(int threshold, int rows, int cols) {

        // 入参校验
        if (threshold < 0 || rows < 1 || cols < 1) {
            return 0;
        }

        boolean[] moved = new boolean[rows * cols];

        return movingCountCore(threshold, rows, cols, 0, 0, moved);

    }

    private int movingCountCore(int threshold, int rows, int cols, int row, int col, boolean[] moved) {

        int count = 0;

        if (row >= 0 && row < rows && col >= 0 && col < cols
                && check(threshold, row, col)
                && !moved[row * cols + col]) {
            System.out.println("row ={" + row + "},col = {" + col + "}");
            ;
            moved[row * cols + col] = true;
            count = 1
                    + movingCountCore(threshold, rows, cols, row - 1, col, moved)
                    + movingCountCore(threshold, rows, cols, row + 1, col, moved)
                    + movingCountCore(threshold, rows, cols, row, col - 1, moved)
                    + movingCountCore(threshold, rows, cols, row, col + 1, moved);
        }
        return count;

    }

    private boolean check(int threshold, int row, int col) {
        return (getDigitSum(row) + getDigitSum(col)) <= threshold;
    }

    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
