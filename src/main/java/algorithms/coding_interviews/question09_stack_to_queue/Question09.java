/*
  Copyright (C), 2015-2020
  FileName: Question09
  Author:   caozx
  Date:     2020/2/17 9:37
  Description:    *    题目：用两个栈实现一个队列。队列的声明如下，      *              请实现它的两个函数appendTail和deleteHead，      *              分别完成在队列尾部插入节点和在队列的首部删除节点的操作
  History:
  <author>        <time>                <desc>
  caozx           2020/2/17 9:37          *    题目：用两个栈实现一个队列。队列的声明如下，      *              请实现它的两个函数appendTail和deleteHead，      *              分别完成在队列尾部插入节点和在队列的首部删除节点的操作
 */

package algorithms.coding_interviews.question09_stack_to_queue;


import java.util.Stack;

/**
 * 〈
 * 面试题9：用两个栈实现队列
 * 题目：用两个栈实现一个队列。队列的声明如下，
 * template <typename T> class CQueue{
 * public :
 * CQueue(void);
 * ~CQueue(void);
 * <p>
 * void append(const T& node);
 * T deleteHead();
 * private:
 * stack<T> stack1;
 * stack<T> stack2;
 * }
 * 请实现它的两个函数appendTail和deleteHead，
 * 分别完成在队列尾部插入节点和在队列的首部删除节点的操作
 * <p>
 * 思路：
 * 操作时先向栈1中压入元素保证元素的有序性，
 * 要保证元素先进先出，根据栈的特性先进后出，正好与队列相反，
 * 那么将栈1的元素依次弹出压入到栈2，此时栈2弹栈变实现先进先出
 * 即，元素新增向栈1添加，元素出队列用栈2弹出，当栈2无元素时，将栈1的元素转移到栈2再进行弹出。〉
 *
 * @author caozx
 * @date 2020/2/17 9:37
 */
public class Question09 {

    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();

    public static Stack<Integer> getStack1() {
        return stack1;
    }


    public static Stack<Integer> getStack2() {
        return stack2;
    }


    // 进队列
    public void appendTail(Integer element) {
        stack1.push(element);
    }

    // 出队列
    public Integer deleteHead() throws Exception {
        if (stack2.size() <= 0) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new Exception("队列无元素");
        }

        return stack2.pop();

    }

}
