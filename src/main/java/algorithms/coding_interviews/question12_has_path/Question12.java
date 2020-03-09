/*
  Copyright (C), 2015-2020
  FileName: Question12
  Author:   caozx
  Date:     2020/3/9 16:23
  Description: 
  History:
  <author>        <time>                <desc>
  caozx           2020/3/9 16:23       
 */

package algorithms.coding_interviews.question12_has_path;


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
public class Question12 {


    /**
     * 思路：
     * 回溯法，使用递归。
     * 1. 将matrix字符串映射为一个字符矩阵（index = i * cols + j）
     * 2. 遍历matrix的每个坐标，与str的首个字符对比，如果相同，用visited做标记，
     * matrix的坐标分别上、下、左、右、移动（判断是否出界或者之前已经走过[visited的坐标为true]），
     * 再和str的下一个坐标相比，直到str全部对比完，即找到路径，否则找不到。
     * 要点：
     * 1、定义row、column生成矩阵
     * 2、先默认标记为符合条件，然后遍历4个方向，递归完成路径深度遍历，最后判断条件不满足时，将标记恢复
     * 扩展：
     * 通常二维矩阵上查找路径都可以通过回溯法解决
     */
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] visited = new boolean[rows * cols];
//        for (boolean[] booleans : visited) {
//            for (boolean aBoolean : booleans) {
//                System.out.println("aBoolean = " + aBoolean);
//            }
//        }
        if (matrix == null || str == null || str.length > matrix.length || rows < 1 || cols < 1) {
            return false;
        }

        // 遍历矩阵, 找到与路径第一个元素相同的元素进行路径查找
        int pathLength = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (hasPathCore(matrix, rows, cols, str, pathLength, row, col, visited)) {
                    return true;
                }
            }
        }


        return false;
    }

    private boolean hasPathCore(char[] matrix, int rows, int cols, char[] str, int pathLength, int row, int col, boolean[] visited) {
        if (pathLength >= str.length) {
            return true;
        }

        boolean hasPath = false;

        // 判断此点是否为路径中的 pathLength元素
        if (row >= 0 && row < rows && col >= 0 && col < cols
                && matrix[row * cols + col] == str[pathLength]
                && !visited[row * cols + col]) {
            // 先标记此点符合条件
            ++pathLength;
            visited[row * cols + col] = true;

            // 判断周围点是否符合路径的下一个条件
            hasPath = hasPathCore(matrix, rows, cols, str, pathLength, row - 1, col, visited)
                    || hasPathCore(matrix, rows, cols, str, pathLength, row + 1, col, visited)
                    || hasPathCore(matrix, rows, cols, str, pathLength, row, col - 1, visited)
                    || hasPathCore(matrix, rows, cols, str, pathLength, row, col + 1, visited);

            // 回溯判断
            if (!hasPath) {
                --pathLength;
                visited[row * cols + col] = false;
            }
        }

        return hasPath;

    }

}
