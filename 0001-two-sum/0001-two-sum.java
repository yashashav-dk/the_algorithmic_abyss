class Solution {
    public int[] twoSum(int[] nums, int target) {
       /**
       Approach using hashtable
       Store the entire row in the table along with it's index
       check if ele - target is present in the hashtablea for element i + 1
        */
       HashMap<Integer, Integer> hm = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
       }
       int[] res = {0,0};
       for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hm.get(diff) != null && hm.get(diff) != i) {
               res[0] = i;
               res[1] = hm.get(diff);
               break;
            }
       }
    //    System.out.println(hm);
    //    System.out.println(res[0] + " " + res[1]);
    return res;
    }
}