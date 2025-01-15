package solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeetCode_480_Sliding_Window_Median {
    public double[] medianSlidingWindow(int[] nums, int k) {
        // init
        double[] ans = new double[nums.length - k + 1];
        List<Integer> window = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            window.add(nums[i]);
        }
        window.sort(Comparator.naturalOrder());
        for (int i = k; i < nums.length; i++) {
            // output
            if (k % 2 == 1) {
                ans[i - k] = window.get(k / 2);
            } else {
                ans[i - k] = window.get(k / 2 - 1) / 2.0 + window.get(k / 2) / 2.0;
            }
            // insert
            insert(window, nums[i]);
            remove(window, nums[i - k]);


        }
        if (k % 2 == 1) {
            ans[nums.length - k] = window.get(k / 2);
        } else {
            ans[nums.length - k] = window.get(k / 2 - 1) / 2.0 + window.get(k / 2) / 2.0;
        }
        return ans;
    }

    public void insert(List<Integer> window, int target) {
        int start = 0;
        int end = window.size() - 1;
        while (start < end - 1) {
            if (window.get((start + end) / 2) > target) {
                end = (start + end) / 2;
            } else {
                start = (start + end) / 2;
            }

        }
        if (target <= window.get(start)) {
            window.add(start, target);
        } else if (target <= window.get(end)) {
            window.add(end, target);
        } else {
            window.add(target);
        }
    }

    public void remove(List<Integer> window, int target) {
        int start = 0;
        int end = window.size() - 1;
        while (start < end - 1) {
            if (window.get((start + end) / 2) > target) {
                end = (start + end) / 2;
            } else {
                start = (start + end) / 2;
            }

        }
        if (target == window.get(start)) {
            window.remove(start);
        } else {
            window.remove(end);
        }
    }

}