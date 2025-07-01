// https://takeuforward.org/plus/dsa/arrays/logic-building/find-missing-number
class Solution {
    // brute force: using two for loops to find missing element
    // better: using frequency array
    // better: using sorting and compare index
    // optimal 1: use concept of sum of n natural numbers and find out sum and minus that from given array sum
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum1 = (n*(n+1)/2);
        int sum2 = 0;
        for(int i=0;i<nums.length;i++) {
            sum2 = sum2+nums[i];
        }

        return sum1-sum2;
    }

    // optimal 2: use concept of XOR, if you xor same numbers with eachother then it alwasy 0. like 2^2 = 0
    public int missingNumber(int[] nums) {
        int xor1 = 0, xor2 = 0;

        // Calculate XOR of all array elements
        for (int i = 0; i < nums.length; i++) {
            xor1 = xor1 ^ (i + 1); // XOR up to [1...N]
            xor2 = xor2 ^ nums[i]; // XOR of array elements
        }

        // XOR of xor1 and xor2 gives missing number
        return (xor1 ^ xor2);
    }
}
