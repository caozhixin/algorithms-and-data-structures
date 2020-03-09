/*
  Copyright (C), 2015-2020
  FileName: Question12Test
  Author:   caozx
  Date:     2020/3/9 16:23
  Description: 
  History:
  <author>        <time>                <desc>
  caozx           2020/3/9 16:23       
 */

package algorithms.coding_interviews.question12_has_path;


import org.junit.Test;

/**
 * 〈
 * 题目：请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一个。
 * 如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
 * 例如：3*4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用下划线标出）
 * 但矩阵中不包含字符串“abfd”的路径，
 * 因为字符串的第一个字符b占据了矩阵的第一行第二个各自以后，路径就不能再次进入这个格子。
 * a b c e
 * s f c s
 * a d e e
 * 〉
 *
 * @author caozx
 * @date 2020/3/9 16:23
 */
public class Question12Test {

    @Test
    public void testHasPath() {
        char[] matrix = new char[]{
                'A', 'B', 'C', 'E',
                'S', 'F', 'C', 'S',
                'A', 'D', 'E', 'E'
        };
        char[] str = new char[]{'A', 'B', 'C', 'C', 'E', 'D'};
        Question12 question12 = new Question12();
        System.out.println("question12.hasPath(matrix, 3, 4, str) = " + question12.hasPath(matrix, 3, 4, str));

    }

}
