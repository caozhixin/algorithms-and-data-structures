/*
  Copyright (C), 2015-2020, Bitnei
  FileName: Question08
  Author:   caozx
  Date:     2020/2/8 18:42
  Description: 题目：给定一棵二叉树和其中的一个节点，如何找到中序遍历序列的下一个节点？     树中的节点除了有两个分别指向左、右子节点的指针 ，还有一个指向父节点的指针。
  History:
  <author>        <time>                  <version>          <desc>
  caozx           2020/2/8 18:42         版本号              题目：给定一棵二叉树和其中的一个节点，如何找到中序遍历序列的下一个节点？     树中的节点除了有两个分别指向左、右子节点的指针 ，还有一个指向父节点的指针。
 */

package algorithms.coding_interviews.question08_nextNode;


/**
 * 〈题目：给定一棵二叉树和其中的一个节点，如何找到中序遍历序列的下一个节点？    
 * 树中的节点除了有两个分别指向左、右子节点的指针 ，还有一个指向父节点的指针。〉
 *
 * @author caozx
 * @date 2020/2/8 18:42
 */
public class Question08 {

    /**
     *  总结一下，下一个节点可能出现的位置:
     *  1.若这一节点有右子树，则它下一个节点就是它右子树的最左子节点
     *  2.若这一节点没有右子树，但是它是父节点的左子节点，则它下一个节点就是它的父节点
     *  3.若这一节点（节点A）没有右子树，且是父节点的右子节点，
     *       那就沿着它（节点A）的父节点（节点B）一直往上找，。。。
     *       直到找到一个节点（节点C）是其（节点C）父节点的左子节点（若有这样的节点），
     *       则它下一个节点就是  找到的这个节点（节点C）的父节点
     *       若无这样的节点，则它下一个节点为null
     * （2情况其实是3的特殊情况  刚好其父节点就是左子节点）
     *
     * @param t
     * @return
     */
    public TreeNode getNext(TreeNode t) {
        if (t == null) {
            return null;
        }

        if (t.right != null) {
            //若有右子树，则它下一个节点为它右子树的最左子节点
            t = t.right;
            while (t.left != null) {
                t = t.left;
            }
            return t;
        }

        //若无右子树，看是否是其父节点们的左子节点，
        //若是则下一节点为它父节点
        while (t.parent != null) {
            if (t.parent.left == t) {
                return t.parent;

            }
            t = t.parent;
        }


        return null;
    }

}
