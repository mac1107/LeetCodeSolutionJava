package solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_115_Distinct_SebsequencesTest {

    @Test
    void numDistinct() {
        String s = "daacaedaceacabbaabdccdaaeaebacddadcaeaacadbceaecddecdeedcebcdacdaebccdeebcbdeaccabcecbeeaadbccbaeccbbdaeadecabbbedceaddcdeabbcdaeadcddedddcececbeeabcbecaeadddeddccbdbcdcbceabcacddbbcedebbcaccac";
        String t = "ceadbaa";
//        String s = "bbabag";
//        String t = "bag";
        LeetCode_115_Distinct_Sebsequences obj = new LeetCode_115_Distinct_Sebsequences();
        System.out.println(obj.numDistinct(s, t));
    }
}