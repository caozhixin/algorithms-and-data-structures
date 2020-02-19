/*
  Copyright (C), 2015-2020
  FileName: Question10
  Author:   caozx
  Date:     2020/2/19 11:51
  Description: 题目1：求斐波那契数列的第n项。      写一个函数，输入n，求斐波那契（Fibonacci）数列的第n项。      斐波那契数列的定义：             f(n) = 0              n=0                    1              n=1                    f(n-1)+f(n-2)  n>1
  History:
  <author>        <time>                <desc>
  caozx           2020/2/19 11:51       题目1：求斐波那契数列的第n项。      写一个函数，输入n，求斐波那契（Fibonacci）数列的第n项。      斐波那契数列的定义：             f(n) = 0              n=0                    1              n=1                    f(n-1)+f(n-2)  n>1
 */

package algorithms.coding_interviews.question10_fibonacci;


/**
 * 〈题目1：求斐波那契数列的第n项。      
 * 写一个函数，输入n，求斐波那契（Fibonacci）数列的第n项。      
 * 斐波那契数列的定义：            
 * f(n) =   0              n=0                    
 * 1              n=1                    
 * f(n-1)+f(n-2)  n>1
 * 〉
 *
 * @author caozx
 * @date 2020/2/19 11:51
 */
public class Question10 {

    public int fibonacciRecursive(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public int fibonacciFor(int n) {
        int[] result = {0, 1};
        if (n < 2) {
            return result[n];
        }

        int fibN = 0;
        int fibNMinusOne = 1;
        int fibNminusTwo = 0;

        for (int i = 2; i <= n; i++) {
            fibN = fibNMinusOne + fibNminusTwo;

            fibNminusTwo = fibNMinusOne;
            fibNMinusOne = fibN;
        }

        return fibN;

    }


}
