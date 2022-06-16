class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        char[] modified = new char[2 * s.length() + 2];
        for (int i = 0; i < s.length(); i++) {
            modified[2 * i + 1] = s.charAt(i);
            modified[2 * i] = '#';
        }
        modified[modified.length - 1] = '#';
        int[] lengths = new int[modified.length];
        int maxCenter = 0, maxRadius = 0, rightCenter = 0, rightRadius = 0;
        for (int i = 0; i < modified.length; i++) {
            lengths[i] = i < rightRadius ? Math.min(rightRadius - i, lengths[2 * rightCenter - i]) : 0;
            while (i - lengths[i] - 1 >= 0 && i + lengths[i] + 1 < modified.length && modified[i - lengths[i] - 1] == modified[i + lengths[i] + 1]) {
                lengths[i] += 1;
            }
            if (lengths[i] >= maxRadius) {
                maxRadius = lengths[i];
                maxCenter = i;
            }
            if (lengths[i] + i > rightRadius) {
                rightRadius = lengths[i] + i;
                rightCenter = i;
            }
        }
        StringBuilder str = new StringBuilder();
        for (int i = maxCenter - maxRadius; i < maxCenter + maxRadius + 1; i++) {
            if (modified[i] != '#') str.append(modified[i]);
        }
        return str.toString();
    }
}