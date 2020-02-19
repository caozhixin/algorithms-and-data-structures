/*
  Copyright (C), 2015-2020
  FileName: FibonacciN
  Author:   caozx
  Date:     2020/2/19 13:45
  Description: 
  History:
  <author>        <time>                <desc>
  caozx           2020/2/19 13:45       
 */

package algorithms.coding_interviews.question10_fibonacci;


/**
 * 〈
 * 扩展问题:
 * N级台阶（比如100级），
 * 每次可走1级或者2级（或更多 k级），
 * 求总共有多少种走法？（或列举所有走法）
 * 〉
 *
 * @author caozx
 * @date 2020/2/19 13:45
 */
public class FibonacciN {

    private static int k; //每次可以走k级
    private static int m = 0; //记录第m次选择
    private static int count = 1; //记录总的走法种数
    private static int[] step; //将每次

    public FibonacciN(int n, int k) {
        FibonacciN.k = k;
        FibonacciN.step = new int[n];

    }

    public void walk(int rest) {

        if (rest < 0) {
            return;
        }
        // 剩余台阶为0，走完输出
        if (rest == 0) {
            printStep();
            count++;
            return;
        }
        // 每种走法的第m次可以走i步
        for (int i = 1; i <= k; i++) {
            step[m] = i;
            m++;
            walk(rest - i);
            m--;
        }

    }

    private void printStep() {
        System.out.print("走法" + count + ":");
        for (int i = 0; i < m; i++) {
            System.out.print(step[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10;
        int k = 2;
        FibonacciN fibonacciN = new FibonacciN(n, k);
        fibonacciN.walk(n);
    }
}
