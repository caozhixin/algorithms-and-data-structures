/*
  Copyright (C), 2015-2020
  FileName: Question09Test
  Author:   caozx
  Date:     2020/2/17 11:01
  Description: 
  History:
  <author>        <time>                <desc>
  caozx           2020/2/17 11:01       
 */

package algorithms.coding_interviews.question09_stack_to_queue;


import org.junit.Test;

/**
 * 〈〉
 *
 * @author caozx
 * @date 2020/2/17 11:01
 */
public class Question09Test {

    @Test
    public void queueTest() {
        Question09 queue = new Question09();
        queue.appendTail(1);
        queue.appendTail(2);
        queue.appendTail(3);
        queue.appendTail(4);
        queue.appendTail(5);

        System.out.println("queue.stack1" + Question09.getStack1());
        System.out.println("queue.stack2" + Question09.getStack2());

        try {
            System.out.println(queue.deleteHead());
            System.out.println(queue.deleteHead());
            System.out.println(queue.deleteHead());
        } catch (Exception e) {
            e.printStackTrace();
        }

        queue.appendTail(6);
        queue.appendTail(7);

        System.out.println("queue.stack1" + Question09.getStack1());
        System.out.println("queue.stack2" + Question09.getStack2());

        try {
            System.out.println(queue.deleteHead());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("queue.stack1" + Question09.getStack1());
        System.out.println("queue.stack2" + Question09.getStack2());

    }

    @Test
    public void stackTest() {
        Question09Extend stack = new Question09Extend();

        System.out.println("依次压入1、2、3");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("队列1中的数据：" + Question09Extend.getQueue1());
        System.out.println("队列2中的数据：" + Question09Extend.getQueue2());

        System.out.println("弹出2次");
        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("队列1中的数据：" + Question09Extend.getQueue1());
        System.out.println("队列2中的数据：" + Question09Extend.getQueue2());

        System.out.println("依次压入4、5");
        stack.push(4);
        stack.push(5);
        System.out.println("队列1中的数据：" + Question09Extend.getQueue1());
        System.out.println("队列2中的数据：" + Question09Extend.getQueue2());

        System.out.println("弹出3次");
        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("队列1中的数据：" + Question09Extend.getQueue1());
        System.out.println("队列2中的数据：" + Question09Extend.getQueue2());

    }

}
