/*
  Copyright (C), 2015-2020, Bitnei
  FileName: Question07Test
  Author:   caozx
  Date:     2020/2/8 18:34
  Description: 
  History:
  <author>        <time>                  <version>          <desc>
  caozx           2020/2/8 18:34         版本号              
 */

package algorithms.coding_interviews.question07_constructTree;


/**
 * 〈〉
 *
 * @author caozx
 * @date 2020/2/8 18:34
 */
public class Question07Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Question07 c = new Question07();

        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};//前序遍历序列
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};//中序遍历序列

        //返回后序遍历结果
        TreeNode t = c.construct(pre, in);
        System.out.println("后序遍历结果为：");
        lastOrder(t);
    }


    //后序遍历结果    重建后的二叉树后序遍历方式输出二叉树
    public static void lastOrder(TreeNode t) {
        // TODO Auto-generated method stub
        if (t != null) {
            lastOrder(t.left);
            lastOrder(t.right);
            System.out.print(t.val + " ");
        }

    }
}
