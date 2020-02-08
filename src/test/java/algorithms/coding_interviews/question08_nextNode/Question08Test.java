/*
  Copyright (C), 2015-2020, Bitnei
  FileName: Question08Test
  Author:   caozx
  Date:     2020/2/8 18:44
  Description: 
  History:
  <author>        <time>                  <version>          <desc>
  caozx           2020/2/8 18:44         版本号              
 */

package algorithms.coding_interviews.question08_nextNode;


/**
 * 〈〉
 *
 * @author caozx
 * @date 2020/2/8 18:44
 */
public class Question08Test {
    public static void main(String[] args) {

        Question08 n = new Question08();
        //调用No8getNext的方法    也可以使用TreeNode类创建对象

        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);

        a.left = b;
        a.right = c;


        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        e.left = h;
        e.right = i;

        h.parent = e;
        i.parent = e;

        e.parent = b;
        d.parent = b;

        f.parent = c;
        g.parent = c;

        b.parent = a;
        c.parent = a;

        TreeNode next = n.getNext(f);
        if (next != null) {
            System.out.println(g.val + "节点的下一个节点为" + next.val);
        } else
            System.out.println(g.val + "节点无下一个节点");
    }


}
