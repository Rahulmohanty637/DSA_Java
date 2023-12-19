package String;

public class DSA_LC_003_Length_0f_The_Last_Word {
    public int lengthOfLastWord(String s) {
        String[] arrOfStr = s.split(" ");
        return arrOfStr[arrOfStr.length-1].length();
    }
}
