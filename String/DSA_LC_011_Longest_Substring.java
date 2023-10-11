package String;

public class DSA_LC_011_Longest_Substring {
    public static void main(String[] args) {

    }

    public static int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        StringBuilder str = new StringBuilder();
        str.append(ch[0]);
        int pre = 0;
        int length = 0;
        for (int i = 1; i < ch.length; i++) {
            String c = new String(String.valueOf(ch[i]));
            pre = str.indexOf(c);
            if (pre == 0) {
                str.append(ch[i]);
                if (str.length() > length) {
                    length = str.length();
                }
            } else {
                str.delete(0, i);
                str.append(ch[i]);
            }
        }
        return length;
    }
}
