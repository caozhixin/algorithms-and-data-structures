package main.algorithms.the_sword_refers_to_offer.assignment;


/**
 * 〈面试题1：赋值运算符函数〉
 * <p>
 * 题目：如下为类型CMyString的声明，请为该类型添加赋值运算符函数。
 *
 * @author caozx
 * @date 2020/1/11 13:51
 */


public class CMyString {
    private char[] m_pData;

    public CMyString(char pData[]) {      //输入的是字符型
        m_pData = pData;
    }

    public CMyString(CMyString str) {    //输入的是CMyString类的对象
        m_pData = str.m_pData;
    }


    /**
     * java实现解题注意点：
     * 1、注意返回类型是否为该类的引用, 只有返回引用才可以进行连续赋值。
     * 2、判断传入对象是否是该对象引用本身, 是则直接返回
     */
    public CMyString assignment(CMyString str) {

        // 注意点2
        if (str == null || this == str) {
            return str;
        }

        this.m_pData = null; // 将属性初始化
        // 此题中数组元素是基本数据类型, 当元素是引用数据类型时需要进行深层赋值,可以使用Json转化
        // 创建相同长度字符数组
        this.m_pData = new char[str.m_pData.length];
        // 对每个元素进行赋值
        for (int i = 0; i < str.m_pData.length; i++) {      // 对每个元素进行赋值
            this.m_pData[i] = str.m_pData[i];
        }
        // 可使用jdk 自带方法进行复制
        // System.arraycopy(str.m_pData, 0, this.m_pData, 0, str.m_pData.length);

        return this;
    }

    /**
     * 为方便测试, 重写toString()
     */
    @Override
    public String toString() {
        /**
         * 此处引入一个常见面试题: String, StringBuffer 和 StringBuilder 三者之间的区别
         * String 是字符串常量, 初始化之后就是不可变的。
         * StringBuffer 是字符串变量, 同时线程安全
         * StringBuilder 是字符串变量, 非线程安全, 但是效率较快
         */
        StringBuilder stringBuilder = new StringBuilder("结果为: ");
        for (char m_pDatum : this.m_pData) {
            stringBuilder.append(m_pDatum);
        }
        return stringBuilder.toString();
    }


}
