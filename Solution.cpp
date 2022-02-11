
#include<vector>
#include<unordered_map>
using namespace std;

class Solution {
    
public:

    int subarraySum(vector<int>& nums, int k) {

        unordered_map<int, int> frequencyMap;
        int countSubarrays = 0;
        int prefixSum = 0;
        frequencyMap[prefixSum] = 1;

        for (int n : nums) {

            prefixSum += n;
            if (frequencyMap.find(prefixSum - k) != frequencyMap.end()) {
                countSubarrays += frequencyMap[prefixSum - k];
            }
            frequencyMap[prefixSum]++;
        }

        return countSubarrays;
    }
};
