//cci150 17.12

import java.util.*;

public class Main {
    public static Set<List<Integer>> findPair(int[] arr, int sum) {
        Arrays.sort(arr);
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        for(int i = 0; i < arr.length; i++) {
            int j = Arrays.binarySearch(arr, i+1, arr.length, sum-arr[i]);
            if(j >= 0) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(arr[i]);
                list.add(arr[j]);
                set.add(list);
            }
        }
        return set;
    }
}
