/*
  Copyright (C), 2015-2020, Bitnei
  FileName: ListNode
  Author:   caozx
  Date:     2020/2/6 20:39
  Description: 链表节点
  History:
  <author>        <time>                  <version>          <desc>
  caozx           2020/2/6 20:39         版本号              链表节点
 */

package algorithms.coding_interviews.question06_printLinkedListReversely;


/**
 * 〈链表节点〉
 *
 * @author caozx
 * @date 2020/2/6 20:39
 */
public class ListNode {
    private int value;

    private ListNode next = null;

    ListNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
