package Problems;

import java.util.Arrays;
import java.util.TreeMap;

public class DSA_LC_DC_Maximum_Profit_In_Job_Scheduling {

    class Job {
        int startTime;
        int endTime;
        int profit;

        Job(int _startTime, int _endTime, int _profit) {
            startTime = _startTime;
            endTime = _endTime;
            profit = _profit;
        }

    }

    public int newJobScheduling(int[] startTime, int[] endTime, int[] profit) {

        int n = startTime.length;
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; ++i) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }

        Arrays.sort(jobs, (a, b) -> (a.endTime - b.endTime));
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; ++i) {
            int k = binarySearch(jobs, i - 1, jobs[i - 1].startTime);
            dp[i] = Math.max(dp[i - 1], dp[k] + jobs[i - 1].profit);
        }

        return dp[n];

    }

    public int binarySearch(Job[] jobs, int right, int target) {
        int left = 0;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (jobs[mid].endTime > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];
        for (int i = 0; i < n; i++) {
            jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }
        Arrays.sort(jobs, (a, b) -> a[1] - b[1]);
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);
        for (int[] job : jobs) {
            int val = job[2] + dp.floorEntry(job[0]).getValue();
            if (val > dp.lastEntry().getValue()) {
                dp.put(job[1], val);
            }
        }

        return dp.lastEntry().getValue();
    }
}
