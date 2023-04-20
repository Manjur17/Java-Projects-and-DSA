package BackTracking;

import java.util.*;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        recurse(list, 0, 0, "", n);
        return list;
    }

    public static void recurse(List<String> list, int left, int right, String s, int n) {
        if (s.length() == n * 2) {
            list.add(s);
            return;
        }

        if (left < n) {
            recurse(list, left + 1, right, s + "(", n);
        }

        if (right < left) {
            recurse(list, left, right + 1, s + ")", n);
        }
    }
}
