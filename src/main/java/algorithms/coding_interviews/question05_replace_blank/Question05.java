/*
  Copyright (C), 2015-2020
  FileName: Question04
  Author:   caozx
  Date:     2020/1/16 17:47
  Description: 面试题5：请实现一个函数，把字符串中的每个空格替换成"%20"。 例如，输入"We are happy."，则输出"We%20are%20happy."。
  History:
  <author>        <time>                <desc>
  caozx           2020/1/16 17:47       面试题5：请实现一个函数，把字符串中的每个空格替换成"%20"。 例如，输入"We are happy."，则输出"We%20are%20happy."。
 */

package algorithms.coding_interviews.question05_replace_blank;


/**
 * 〈面试题5：请实现一个函数，把字符串中的每个空格替换成"%20"。
 * 例如，输入"We are happy."，则输出"We%20are%20happy."。〉
 *
 * @author caozx
 * @date 2020/1/16 17:47
 */
public class Question05 {

    /**
     * 方式一：开辟新空间
     */
    public String replaceBlank1(String s) {
        if (s == null) {
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder();
        // 遍历字符串, 复制每个字符, 当遇到空格时, 就增加替换字符。
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }

    /**
     * 方式二：从后往前复制
     */
    public String replaceBlank2(String s) {
        if (s == null) {
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder(s);

        // 记录空格数
        int blankNum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                blankNum++;
            }
        }

        int sEndIndex = s.length() - 1;
        int newStringEndIndex = s.length() - 1 + 2 * blankNum;
        stringBuilder.setLength(newStringEndIndex + 1);
        while (sEndIndex < newStringEndIndex) {
            if (s.charAt(sEndIndex) == ' ') {
                stringBuilder.setCharAt(newStringEndIndex--, '0');
                stringBuilder.setCharAt(newStringEndIndex--, '2');
                stringBuilder.setCharAt(newStringEndIndex--, '%');
            } else {
                stringBuilder.setCharAt(newStringEndIndex--, s.charAt(sEndIndex));
            }
            sEndIndex--;

        }

        return String.valueOf(stringBuilder);
    }


}
