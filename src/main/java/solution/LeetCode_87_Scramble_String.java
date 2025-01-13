package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode_87_Scramble_String {

    Map<String, Boolean> memo = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        if (memo.containsKey(s1 + s2)) {
            return memo.get(s1 + s2);
        }
        if (s1.equals(s2)) {
            memo.put(s1 + s2, true);
            return true;
        }
        int[] s1SubCharArray = new int[26];
        int[] s2Sub1CharArray = new int[26];
        int[] s2Sub2CharArray = new int[26];

        for (int i = 1; i < s1.length(); i++) {

            s1SubCharArray[s1.charAt(i - 1) - 'a']++;
            s2Sub1CharArray[s2.charAt(i - 1) - 'a']++;
            s2Sub2CharArray[s2.charAt(s2.length() - i) - 'a']++;

            if (Arrays.equals(s1SubCharArray, s2Sub1CharArray)) {
                if (isScramble(s1.substring(0, i), s2.substring(0, i)) && isScramble(s1.substring(i), s2.substring(i))) {
                    memo.put(s1 + s2, true);
                    return true;
                }
            }
            if (Arrays.equals(s1SubCharArray, s2Sub2CharArray)) {
                if (isScramble(s1.substring(0, i), s2.substring(s2.length() - i)) && isScramble(s1.substring(i), s2.substring(0, s2.length() - i))) {
                    memo.put(s1 + s2, true);
                    return true;
                }
            }
        }
        memo.put(s1 + s2, false);
        return false;
    }


}