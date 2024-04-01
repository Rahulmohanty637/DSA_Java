package String;

public class DSA_LC_04_Add_Strings {
    class Solution {
        public String addStrings(final String num1, final String num2) {
            final StringBuilder sb = new StringBuilder();

            int i = num1.length() - 1, j = num2.length() - 1, tmp = 0;

            while(i >= 0 || j >= 0) {
                int v1 = 0, v2 = 0;

                if(i >= 0)
                    v1 = num1.charAt(i--) - '0';

                if(j >= 0)
                    v2 = num2.charAt(j--) - '0';

                int sum = v1 + v2 + tmp;

                if(sum > 9)
                    tmp = 1;
                else
                    tmp = 0;

                sb.append(sum % 10);
            }

            if(tmp == 1)
                sb.append(1);

            return sb.reverse().toString();
        }
    }
}
