/*
  Copyright (C), 2015-2020, Bitnei
  FileName: Question06Test
  Author:   caozx
  Date:     2020/2/6 21:12
  Description: 
  History:
  <author>        <time>                  <version>          <desc>
  caozx           2020/2/6 21:12         版本号              
 */

package algorithms.coding_interviews.question06_printLinkedListReversely;


/**
 * 〈〉
 *
 * @author caozx
 * @date 2020/2/6 21:12
 */
public class Question06Test {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.setNext(new ListNode(3));
        listNode.getNext().setNext(new ListNode(4));
        listNode.getNext().getNext().setNext(new ListNode(0));

        System.out.println("-----借助栈实现的反向打印链表：" + Question06.printListReversingly_Iteratively(listNode));
        System.out.println("-----使用递归的方式反向打印链表：");
        Question06.printListReversingly_Recursively(listNode);
        System.out.println("-----使用ArrayList逆序打印链表：");
        Question06.printListFromTailToHeadByArrayList(listNode);
        System.out.println("-----递归反转链表，后遍历打印：");
        Question06.printListFromTailToHeadByReverseList(listNode);
        System.out.println("\n-----当传入null链表时：");
        Question06.printListReversingly_Recursively(null);

    }
}
