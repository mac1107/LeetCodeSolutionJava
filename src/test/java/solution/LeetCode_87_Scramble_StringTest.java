package solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_87_Scramble_StringTest {

    @Test
    void isScramble() {
        LeetCode_87_Scramble_String scramble = new LeetCode_87_Scramble_String();
//        String s1 = "abcdbdacbdac";
//        String s2 = "bdacabcdbdac";
//        String s1 = "ccababcaabcb";
//        String s2 = "bccbccaaabab";
        String s1 = "eebaacbcbcadaaedceaaacadccd";
        String s2 = "eadcaacabaddaceacbceaabeccd";
        System.out.println(scramble.isScramble(s1, s2));
    }
}