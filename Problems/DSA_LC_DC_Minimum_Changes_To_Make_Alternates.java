package Problems;

public class DSA_LC_DC_Minimum_Changes_To_Make_Alternates {
    public int minOperations(String s) {
        int z=0,o=0;
        for(int i=0; i<s.length();i++) {
            if(i%2==0) {
                if (s.charAt(i) == '0') o++;
                else z++;
            } else {
                if(s.charAt(i) == '0') z++;
                else o++;
            }
        }

        return Math.min(z,o);

    }
}
