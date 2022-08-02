// https://leetcode.com/problems/regular-expression-matching/

import java.util.regex.*;

class Solution {
    public boolean isMatch(String s, String p) {
        return Pattern.matches(p, s);
    }
}
