package String;

public class DSA_01_Substring {
    public static void main(String[] args) {
        skipChar("", "cbaabdhaa");
        System.out.println(skipChar2("cbaabdhaa"));
        System.out.println(skipString("This is a freaking huge house!", "huge"));
    }

    public static void skipChar(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skipChar(p, up.substring(1));
        } else {
            skipChar(p + ch, up.substring(1));
        }
    }

    public static String skipChar2(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skipChar2(up.substring(1));
        } else {
            return ch + skipChar2(up.substring(1));
        }
    }

    public static String skipString(String up, String word) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith(word)) {
            return skipString(up.substring(word.length() + 1), word);
        } else {
            return up.charAt(0) + skipString(up.substring(1), word);
        }
    }
}
