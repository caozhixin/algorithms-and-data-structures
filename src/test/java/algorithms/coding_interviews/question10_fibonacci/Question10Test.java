package algorithms.coding_interviews.question10_fibonacci;


import org.junit.Test;

/**
 * @author caozx
 * @date 2020/2/19 11:51
 */
public class Question10Test {

    @Test
    public void fibonacciTest() {
        Question10 fibonacci = new Question10();

        System.out.println(fibonacci.fibonacciFor(10));
        System.out.println(fibonacci.fibonacciRecursive(10));
    }


}
