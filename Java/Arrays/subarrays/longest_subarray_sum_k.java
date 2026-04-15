package Java.Arrays.subarrays;

import java.util.HashMap;

public class longest_subarray_sum_k {
    public static sum(int[] arr, int k){
        HashMap<Integer, Integer> prefix_seen = new HashMap<>();
        int curr_sum = 0;
        int max_length = 0;

        for(int i = 0;i<arr.length;i++){
            curr_sum += arr[i];

            if (curr_sum == k)
                max_length = i + 1;

            if (prefix_seen.containsKey(curr_sum - k)) {
                int lgth = i - prefix_seen.get(curr_sum - k);
                if (lgth > max_length)
                    max_length = lgth;
            }

            if (!prefix_seen.containsKey(curr_sum))
                prefix_seen.put(curr_sum, i);
        }
    
        return max_length;
    }
}
