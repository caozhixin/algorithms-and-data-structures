/*
  Copyright (C), 2015-2020, Bitnei
  FileName: Question07
  Author:   caozx
  Date:     2020/2/8 18:30
  Description: 题目：输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。      假设输入的前序遍历和中序遍历的结果中都不包含重复的数字。      例如：输入前序遍历序列{1，2，4，7，3，5，6，8}和中序遍历序列{4，7，2，1，5，3，8，6}，          则重建二叉树并输出它的头节点      二叉树节点的定义：      struct BinaryTreeNode{          int m_nValue;            //value      BinaryTreeNode* m_pLeft;   //左子树      BinaryTreeNode* m_pRight;  //右子树      }       思路：先找出根节点，然后利用递归方法构造二叉树
  History:
  <author>        <time>                  <version>          <desc>
  caozx           2020/2/8 18:30         版本号              题目：输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。      假设输入的前序遍历和中序遍历的结果中都不包含重复的数字。      例如：输入前序遍历序列{1，2，4，7，3，5，6，8}和中序遍历序列{4，7，2，1，5，3，8，6}，          则重建二叉树并输出它的头节点      二叉树节点的定义：      struct BinaryTreeNode{          int m_nValue;            //value      BinaryTreeNode* m_pLeft;   //左子树      BinaryTreeNode* m_pRight;  //右子树      }       思路：先找出根节点，然后利用递归方法构造二叉树
 */

package algorithms.coding_interviews.question07_constructTree;


import java.util.Arrays;

/**
 * 〈题目：输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。      
 * 假设输入的前序遍历和中序遍历的结果中都不包含重复的数字。      
 * 例如：输入前序遍历序列{1，2，4，7，3，5，6，8}和中序遍历序列{4，7，2，1，5，3，8，6}，          
 * 则重建二叉树并输出它的头节点      
 * 二叉树节点的定义：      
 * struct BinaryTreeNode{
 *          int m_nValue;            //value
 *      BinaryTreeNode* m_pLeft;   //左子树
 *      BinaryTreeNode* m_pRight;  //右子树
 *      }
 *      
 * 思路：先找出根节点，然后利用递归方法构造二叉树〉
 *
 * @author caozx
 * @date 2020/2/8 18:30
 */
public class Question07 {
    //通过前序和中序遍历序列重建二叉树
    public TreeNode construct(int[] pre, int[] in) {
        if (pre == null || in == null) {
            return null;
        }
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        if (pre.length != in.length) {
            return null;
        }

        TreeNode root = new TreeNode(pre[0]);  //根节点为前序遍历的第一个
        for (int i = 0; i < pre.length; i++) {
            if (pre[0] == in[i]) {    //遍历中序序列 in[i]
                /*在中序遍历序列中查找根节点，找到根节点，
                 *然后可得到左子树root.left和右子树root.left
                 *    然后再将左子树（前序+中序）作为一个二叉树，进行中序遍历找到其中的根节点，
                 *    然后根据根节点得到左子树root.left和右子树root.right
                 * */

                root.left = construct(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                //构建子树时可以直接使用Arrays.copyOfRange(int []original,int from,int to),original为原始的int型数组，from为开始角标值，to为终止角标值。（其中包括from角标，不包括to角标。即处于[from,to)左闭右开状态

                root.right = construct(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));

            }

        }
        return root;
    }
}
