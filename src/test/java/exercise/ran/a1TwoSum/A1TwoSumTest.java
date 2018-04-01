package exercise.ran.a1TwoSum;

import org.junit.Test;

/**
 * Created by ranmx on 2018/3/29.
 */
public class A1TwoSumTest {

    @Test
    public void appTest() {
        A1TwoSum app = new A1TwoSum();

        for(int num: app.twoSum(new int[]{2, 7, 11, 15}, 9)) System.out.print(num + " ");
        System.out.println(" ");
        for(int num: app.twoSum(new int[]{2, 9, 11, 15}, 9)) System.out.print(num + " ");
        System.out.println(" ");
        for(int num: app.twoSum(new int[]{1, 7, 2, 15}, 9)) System.out.print(num + " ");
        System.out.println(" ");
        for(int num: app.twoSum(new int[]{9, 7, 11, 15}, 9)) System.out.print(num + " ");
        System.out.println(" ");
        for(int num: app.twoSum(new int[]{18, 13, 11, 15}, 9)) System.out.print(num + " ");
        System.out.println(" ");
        for(int num: app.twoSum(new int[]{0, 13, 11, 0}, 0)) System.out.print(num + " ");
        System.out.println(" ");
        for(int num: app.twoSum(new int[]{-1, -2, -3, -4, -5}, -8)) System.out.print(num + " ");
        System.out.println(" ");

    }
}
