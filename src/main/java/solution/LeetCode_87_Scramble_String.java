package solution;

import java.util.Arrays;

public class LeetCode_87_Scramble_String {

    int[][][][] memo; // 0 none, 1 false, 2 true
    int size;
    String s1_;
    String s2_;

    public boolean isScramble(String s1, String s2) {
        size = s1.length();
        memo = new int[size + 1][size + 1][size + 1][size + 1];
        s1_ = s1;
        s2_ = s2;
        return scramble(0, size, 0, size);
    }

    public boolean scramble(int s1Start, int s1End, int s2Start, int s2End) {
        if (memo[s1Start][s1End][s2Start][s2End] != 0) {
            return memo[s1Start][s1End][s2Start][s2End] == 2;
        }
        String s1 = s1_.substring(s1Start, s1End);
        String s2 = s2_.substring(s2Start, s2End);
        if (s1.equals(s2)) {
            memo[s1Start][s1End][s2Start][s2End] = 2;
            return true;
        }
        for (int i = 1; i < s1.length(); i++) {
            String s1Sub1 = s1.substring(0, i);
            String s2Sub1 = s2.substring(0, i);
            String s2Sub2 = s2.substring(s2.length() - i);

            char[] s1SubCharArray = s1Sub1.toCharArray();
            Arrays.sort(s1SubCharArray);
            char[] s2Sub1CharArray = s2Sub1.toCharArray();
            Arrays.sort(s2Sub1CharArray);
            char[] s2Sub2CharArray = s2Sub2.toCharArray();
            Arrays.sort(s2Sub2CharArray);
            if (Arrays.equals(s1SubCharArray, s2Sub1CharArray)) {
                if (scramble(s1Start, s1Start + i, s2Start, s2Start + i) && scramble(s1Start + i, s1End, s2Start + i, s2End)) {
                    memo[s1Start][s1End][s2Start][s2End] = 2;
                    return true;
                }
            }
            if (Arrays.equals(s1SubCharArray, s2Sub2CharArray)) {
                if (scramble(s1Start, s1Start + i, s2End - i, s2End) && scramble(s1Start + i, s1End, s2Start, s2End - i)) {
                    memo[s1Start][s1End][s2Start][s2End] = 2;
                    return true;
                }
            }
        }
        memo[s1Start][s1End][s2Start][s2End] = 1;
        return false;
    }

}