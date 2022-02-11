
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function (nums, k) {

    const frequencyMap = new Map();
    let countSubarrays = 0;
    let prefixSum = 0;
    frequencyMap.set(prefixSum, 1);

    for (let n of nums) {

        prefixSum += n;
        if (frequencyMap.has(prefixSum - k)) {
            countSubarrays += frequencyMap.get(prefixSum - k);
        }
        frequencyMap.set(prefixSum, (frequencyMap.get(prefixSum) | 0) + 1);
    }

    return countSubarrays;
};
