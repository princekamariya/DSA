// https://takeuforward.org/plus/dsa/arrays/logic-building/move-zeros-to-end
class Solution {
    public void moveZeroes(int[] nums) {
        // create temp array in that we will store all the none zero numbers
        // then iterate that temp array and store back in original array
        // then remaining will be replaced with zero

        int[] temp = new int[nums.length];
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0) {
                temp[count] = nums[i];
                count++;
            }
        }

        for(int i=0; i<count; i++) {
            nums[i] = temp[i]; 
        }
        for(int i=count;i<nums.length;i++) {
            nums[i] = 0;
        }
    }
}


// Optimal
class Solution {
    public void moveZeroes(int[] nums) {
        // using 2 pointer approach
        int j = 0; // Initialize j to 0

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        // Fill the remaining elements with zeros
        while (j < nums.length) {
            nums[j++] = 0;
        }
    }
}
