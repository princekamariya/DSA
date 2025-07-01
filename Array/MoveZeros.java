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
