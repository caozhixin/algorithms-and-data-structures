package algorithms.coding_interviews.question01_assignment;




/**
 * 〈面试题1：赋值运算符函数〉
 *
 * @author caozx
 * @date 2020/1/11 13:51
 */
public class AssignmentMethodTest {

    public static void main(String[] args) {

        CMyString cMyStringBefore = new CMyString("change before".toCharArray());
        CMyString cMyStringAfter = new CMyString("change after".toCharArray());
        CMyString cMyStringContinuous1 = new CMyString("change Continuous1".toCharArray());
        CMyString cMyStringContinuous2 = new CMyString("change Continuous2".toCharArray());

        System.out.println(cMyStringBefore);
        cMyStringBefore.assignment(cMyStringAfter);
        System.out.println(cMyStringBefore);
        cMyStringBefore.assignment(cMyStringContinuous1).assignment(cMyStringContinuous2);
        System.out.println(cMyStringBefore);

    }

}
