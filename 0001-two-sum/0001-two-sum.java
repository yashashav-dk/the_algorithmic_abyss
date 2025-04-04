class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        naive approach n^2 : Use two loops; outer loop to keep track of x and inner loop to keep track of y so that x + y == target
        faster approach n: build hashmap of the entier nums arr, later look at the equation x + y == target; negate y on both sides -> x == target - y; now iterate y and minus the target to check if x is present in the hashmap
        */
       Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        // In case no two numbers add up to the target (though the problem statement assumes exactly one solution)
        return new int[0];
    }
}