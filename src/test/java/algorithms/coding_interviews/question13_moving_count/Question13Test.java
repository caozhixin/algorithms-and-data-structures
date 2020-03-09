/*
  Copyright (C), 2015-2020
  FileName: Question13Test
  Author:   caozx
  Date:     2020/3/9 17:27
  Description: 
  History:
  <author>        <time>                <desc>
  caozx           2020/3/9 17:27       
 */

package algorithms.coding_interviews.question13_moving_count;


import org.junit.Test;

/**
 * 〈
 * 面试题13：机器人的运动范围
 * 题目：地上有一个m行n列的方格。一个机器人从坐标（0，0）的格子开始移动，
 * 它每次可以向上、下、左、右移动一格，但不能进入行坐标和列坐标的数位之和大于k的格子
 * 例如：当k为18时，机器人能够进入方格为（35，37），因为3+5+3+7=18.
 * 但它不能进（35，38），因为3+5+3+8=19.
 * 请问该机器人能够到达多少个格子
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
public class Question13Test {

    @Test
    public void testMovingCount() {

        Question13 question13 = new Question13();
        System.out.println("question13.movingCount(8,5,20) = " + question13.movingCount(8, 5, 20));

    }

}
