package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DSA_LC_DC_Minimum_Number_of_Operations_to_Make_Array_Empty {
    public static int minOperations(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums)
            map.put(i, map.getOrDefault(i,0)+1);
        int ans = 0;
        for(int v:map.values()){
            if(v==1)
                return -1;
            if(v%3 == 0)
                ans += v/3;
            else if((v-2)%3 == 0)
                ans = ans + 1 + (v-2)/3;
            else if((v-4)%3 == 0)
                ans = ans + 2 + (v-4)/3;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 2, 2, 4, 2, 3, 4, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4};
        System.out.println(minOperations(nums));
    }
}
