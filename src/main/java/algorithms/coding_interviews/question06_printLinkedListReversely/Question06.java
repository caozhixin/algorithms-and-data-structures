/*
  Copyright (C), 2015-2020, Bitnei
  FileName: Question06
  Author:   caozx
  Date:     2020/2/6 20:34
  Description: 面试题6：从尾到头打印链表 题目：输入一个链表的头节点，从尾到头反过来打印出每个节点的值。 链表节点定义： struct ListNode{ 	int m_nKey; 	ListNode* m_pNext; } 
  History:
  <author>        <time>                  <version>          <desc>
  caozx           2020/2/6 20:34         版本号              面试题6：从尾到头打印链表 题目：输入一个链表的头节点，从尾到头反过来打印出每个节点的值。 链表节点定义： struct ListNode{ 	int m_nKey; 	ListNode* m_pNext; } 
 */

package algorithms.coding_interviews.question06_printLinkedListReversely;


import java.util.ArrayList;
import java.util.Stack;

/**
 * 〈面试题6：从尾到头打印链表
 * 题目：输入一个链表的头节点，从尾到头反过来打印出每个节点的值。
 * 链表节点定义：
 * struct ListNode{
 * int m_nKey;
 * ListNode* m_pNext;
 * } 〉
 * <p>
 * 思路：借助栈实现，或使用递归的方式
 *
 * @author caozx
 * @date 2020/2/6 20:34
 */
public class Question06 {

    //方法一：通过栈来实现，第一个遍历的节点最后一个输出，最后一个节点第一个输出。
    //      先把链表中的数据都放到栈中，然后按顺序将栈中的数据pop出就好了
    //      典型的栈的结构   后进先出
    public static ArrayList<Integer> printListReversingly_Iteratively(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null) return list;

        //定义栈   数据为整型
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.getValue());
            listNode = listNode.getNext();
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }

        return list;

    }

    //方法二：使用递归的方式来实现，每访问一个节点的时候，
    //      先递归输出它后面的节点，再输出该节点自身，这样就会反向输出了
    public static void printListReversingly_Recursively(ListNode listNode) {
        if (listNode == null) return;
        if (listNode.getNext() != null) {
            printListReversingly_Recursively(listNode.getNext());
        }

        System.out.print(listNode.getValue() + " ");


    }

    /*
     * 方法三：使用ArrayList逆序打印链表
     */
    public static void printListFromTailToHeadByArrayList(ListNode node) {
        if (node == null)
            System.out.print("输入链表为null");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (node != null) {
            arrayList.add(node.getValue());
            node = node.getNext();
        }
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + ",");
        }
    }


    /*
     * 方法四：递归反转链表，后遍历打印, 此方法改变原始链表结构
     */
    public static void printListFromTailToHeadByReverseList(ListNode node) {
        ListNode reversedNode = reverse(node);
        while (reversedNode != null) {
            System.out.print(reversedNode.getValue() + ",");
            reversedNode = reversedNode.getNext();
        }

    }

    //递归反转
    private static ListNode reverse(ListNode head) {
        if (head.getNext() == null)
            return head;
        ListNode reversedListNode = reverse(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return reversedListNode;
    }

}


