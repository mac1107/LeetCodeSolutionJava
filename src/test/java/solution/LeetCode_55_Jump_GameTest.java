package solution;

class LeetCode_55_Jump_GameTest {

    @org.junit.jupiter.api.Test
    void canJump() {
//        int[] nums = {0};
//        int[] nums = {2, 3, 1, 1, 4};
        int[] nums = {3, 2, 1, 0, 4};
        LeetCode_55_Jump_Game leetCode55JumpGame = new LeetCode_55_Jump_Game();
        boolean result = leetCode55JumpGame.canJump(nums);
        System.out.println(result);
    }
}