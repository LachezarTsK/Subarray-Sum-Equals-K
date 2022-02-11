
import java.util.Map;
import java.util.HashMap;

public class Solution {

    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int countSubarrays = 0;
        int prefixSum = 0;
        frequencyMap.put(prefixSum, 1);

        for (int n : nums) {

            prefixSum += n;
            if (frequencyMap.containsKey(prefixSum - k)) {
                countSubarrays += frequencyMap.get(prefixSum - k);
            }
            frequencyMap.put(prefixSum, frequencyMap.getOrDefault(prefixSum, 0) + 1);
        }

        return countSubarrays;
    }
}
