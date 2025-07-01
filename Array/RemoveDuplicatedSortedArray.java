// https://takeuforward.org/plus/dsa/arrays/logic-building/remove-duplicates-from-sorted-array

class Solution {
    // brute force : using hashset we can do 
    public int removeDuplicates(int[] nums) {
        
        // TreeSet to store unique elements in sorted order
        Set<Integer> s = new TreeSet<>();
        
        // Add all elements from array to the set
        for (int val : nums) {
            s.add(val);
        }
        
        // Get the number of unique elements
        int k = s.size();
        
        int j = 0;
        // Copy unique elements from set to array
        for (int val : s) {
            nums[j++] = val;
        }
        
        // Return the number of unique elements
        return k;
    }

    // optimal:
    // using two pointer approach , first one will be at 0 index and second will be 1
    // then traverse and it element is not matching then move first++ and swap
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i = 1;i<nums.length;i++) {
            if(nums[i]!=nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}
