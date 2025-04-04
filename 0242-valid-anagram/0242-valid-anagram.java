class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        Naive Approach n^2: run nested loop to check if letter is present or not
        Optimal n: Build a set and check for every character in string; at any point if the character is not preset return false else once loop finishes return true
        The above approach fails for duplicates which was not accounted; 
        Hence going with the hashmap approach sounds wise
         */
        
        HashMap <Character, Integer> hmap = new HashMap<>();
        if (s.length() > t.length() || s.length() < t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            // build hashmap
            Character c = s.charAt(i);
            // if character present then increment value
            if (hmap.get(c) != null) {
                hmap.put(c, hmap.get(c)+1);
            } else {
                hmap.put(c, 1);
            }
        }

        // once hashmap is built; start checking against the hashmap
        for (int i = 0; i < s.length(); i++) {
            Character c = t.charAt(i);
            if (hmap.get(c) != null && hmap.get(c) > 0) {
                hmap.put(c, hmap.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;

        
    }
}