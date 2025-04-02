class Solution {
    public int[] getConcatenation(int[] nums) {
        /*
        Approach 1:
        Create a new arr of size 2 x len(input arr)
        naive: one loop to populate first half; second loop to populate the other half
        better: one loop to populate both the places in the same array using an offset
                offset calc: ith location + size(nums)
                0 1 2 3 4 5 6 7
                2 4 6 8 
                2 4 6 8 2 4 6 8
        */
        int[] new_arr = new int[nums.length * 2];
        for(int i = 0; i < nums.length; i++) {
            new_arr[i] = nums[i];
            new_arr[i+nums.length] = nums[i];
        }
        return new_arr;

    }
}