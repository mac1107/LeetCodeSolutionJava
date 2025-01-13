package solution;

public class LeetCode_556_Next_Greater_Element_III {
    public int nextGreaterElement(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int i = chars.length - 1;
        try {
            for (int j = chars.length - 1; j >= 0; j--) {
                if (chars[i] > chars[j]) {
                    for (int k = i + 1; k < chars.length; k++) {
                        if (chars[k] > chars[j] && chars[k] < chars[i]) {
                            i = k;
                        }
                    }
                    char temp = chars[j];
                    chars[j] = chars[i];
                    chars[i] = temp;
                    sort(chars, j + 1);
                    return Integer.parseInt(String.valueOf(chars));
                } else if (chars[i] < chars[j]) {
                    i = j;
                }

            }
        } catch (Exception e) {
            return -1;
        }

        return -1;
    }

    public void sort(char[] chars, int start) {
        for (int i = start; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] > chars[j]) {
                    char temp = chars[j];
                    chars[j] = chars[i];
                    chars[i] = temp;
                }
            }
        }
    }
}
