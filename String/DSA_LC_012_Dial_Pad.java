package String;

import java.util.ArrayList;

public class DSA_LC_012_Dial_Pad {
    public static void main(String[] args) {
        letterCombination("", "12");
        ArrayList<String> ans = letterCombinationRet("", "12");
        System.out.println(ans);
    }

    public static void letterCombination(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int n = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (n - 1) * 3; i < n * 3; i++) {
            char ch = (char) ('a' + i);
            letterCombination(p + ch, up.substring(1));
        }
    }

    public static ArrayList<String> letterCombinationRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        int ch = up.charAt(0) - '0';

        ArrayList<String> ans = new ArrayList<>();
        for (int i = (ch - 1) * 3; i < ch * 3; i++) {
            char n = (char) ('a' + i);
            ans.addAll(letterCombinationRet(p + n, up.substring(1)));
        }
        return ans;
    }
}
