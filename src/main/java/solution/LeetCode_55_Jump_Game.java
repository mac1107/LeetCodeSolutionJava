package solution;

import java.util.Arrays;

public class LeetCode_55_Jump_Game {
    public boolean canJump(int[] nums) {

        if (nums.length == 0) {
            return false;
        }
        int canReach = nums[0];
        for (int i = 0; i < nums.length; ) {
            if (i > canReach) {
                return false;
            }
            canReach = Math.max(canReach, i + nums[i]);
            if (canReach >= nums.length - 1) {
                return true;
            }
            i++;
        }
        return false;
    }
}
