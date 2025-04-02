import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
        Naive Approach n^2 : Run two loops; outer loop to track the element from the arr; inner loop to check for duplicacy
        Better Approach n: Keep building a hash table; check for membership at every insert.   
        */
        HashMap <Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];
            if ((hmap.get(ele)) != null) {
                return true;
            } else {
                hmap.put(ele, 1);
            }
        }
        return false;

    }
}