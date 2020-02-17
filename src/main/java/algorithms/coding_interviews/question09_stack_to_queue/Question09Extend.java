/*
  Copyright (C), 2015-2020
  FileName: Question09Extend
  Author:   caozx
  Date:     2020/2/17 11:15
  Description: 
  History:
  <author>        <time>                <desc>
  caozx           2020/2/17 11:15       
 */

package algorithms.coding_interviews.question09_stack_to_queue;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 〈面试题9扩展（extend）：用两个队列实现栈
 * 题目：用两个队列实现一个栈。
 * 请实现它的两个函数push和pop，（都是对栈尾进行操作）
 * 分别完成在栈尾部插入节点和删除节点的操作
 * <p>
 * 思路：#所有元素{a,b,c}进入q1，
 * 因为目的是实现栈，也就是最先进c，而队列是从对头开始出，
 * #所以先把ab出q1并进q2，此时目标c到了q1对头，
 * #出q1即可。
 * 此时q1已经为空，下一个要出的是b，
 * #把a从q2出队并进q1，
 * 此时目标b在q2队头
 * #出q2......
 * <p>
 * 也就是--->把非空队列中的n-1个元素压入空队列，剩下的第n个元素出队列，
 * 这样保证了两个队列中总有一个是空队列
 * 〉
 *
 * @author caozx
 * @date 2020/2/17 11:15
 */
public class Question09Extend {


    private static Queue<Integer> queue1 = new LinkedList<>();
    private static Queue<Integer> queue2 = new LinkedList<>();

    public static Queue<Integer> getQueue1() {
        return queue1;
    }

    public static Queue<Integer> getQueue2() {
        return queue2;
    }

    //进栈  在栈尾部插入  尾插
    public void push(Integer element) {
        queue1.add(element);
    }

    //出栈  在栈尾部删除     一个队列中有元素，另一个队列为空  进行操作
    public int pop() throws Exception {
        if (queue1.isEmpty()) {
            throw new Exception("队列为空！");
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return queue2.remove();

    }
}
