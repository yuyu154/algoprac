package kakao.test2017;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem1Test {

    @Test
    public void test1() {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] actual = Problem1.test(5, arr1, arr2);
        String[] expected = {"#####", "# # #", "### #", "#  ##", "#####"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};
        String[] actual = Problem1.test(6, arr1, arr2);
        String[] expected = {"######", "###  #", "##  ##", " #### ", " #####", "### # "};
        assertArrayEquals(expected, actual);
    }
}
