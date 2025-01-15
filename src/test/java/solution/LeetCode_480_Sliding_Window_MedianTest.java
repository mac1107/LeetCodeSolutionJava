package solution;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class LeetCode_480_Sliding_Window_MedianTest {

    @Test
    void medianSlidingWindow() {
        LeetCode_480_Sliding_Window_Median m = new LeetCode_480_Sliding_Window_Median();
        int[] nums = {2147483647,2147483647};
        int k = 2;
        System.out.println(Arrays.toString(m.medianSlidingWindow(nums, k)));
    }
}