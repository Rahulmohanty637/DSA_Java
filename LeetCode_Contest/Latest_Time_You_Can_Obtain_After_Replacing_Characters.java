package LeetCode_Contest;

public class Latest_Time_You_Can_Obtain_After_Replacing_Characters {

    public static String latestTime(String s) {
        // Split the input time string
        String[] parts = s.split(":");
        String hour = parts[0];
        String minute = parts[1];

        // Handle hour part
        if (hour.equals("?")) {
            if (minute.equals("?")) {
                hour = "23";
            } else {
                hour = "11";
            }
        }

        // Handle minute part
        if (minute.equals("?")) {
            minute = "59";
        }

        // Format the result
        return hour + ":" + minute;
    }



    public static void main(String[] args) {
        // Test cases
        System.out.println(latestTime("1?:?4")); // Output: "11:54"
        System.out.println(latestTime("0?:5?")); // Output: "09:59"
    }
}
