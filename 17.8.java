//cci150 17.8

public class IntUtils {
    public static int largestContiguousSum(int[] arr) {
        int maxSum = 0;
        int curSum = 0;
        for(int i=0; i<arr.length; i++) {
            curSum += arr[i];
            maxSum = Math.max(maxSum, curSum);
            curSum = Math.max(curSum, 0);
        }
        return maxSum;
    }
}
