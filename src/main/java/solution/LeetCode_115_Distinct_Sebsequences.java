package solution;

public class LeetCode_115_Distinct_Sebsequences {
    public int numDistinct(String s, String t) {

        int[][] dp = new int[s.length()][t.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i && j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    if (i == 0) {
                        dp[i][j] = 1;
                    } else if (j == 0) {
                        dp[i][j] = dp[i - 1][j] + 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];

                    }
                } else {
                    if (i == 0) {
                        dp[i][j] = 0;
                    }else{
                        dp[i][j] = dp[i - 1][j];
                    }
                }

            }
        }
        return dp[s.length() - 1][t.length() - 1];
    }
}
