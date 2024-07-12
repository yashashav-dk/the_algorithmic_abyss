package POTD;
import java.util.Stack;

public class MaximumScoreFromRemovingSubstrings_1717 {

    /*
     * POTD. 1717. Maximum Score From Removing Substrings
     * TC = O(N) + O(N)
     * SC = O(N)
     */
    public static void main(String[] args) {
        String str = new String("cdbcbbaaabab");
        int x = 4; // "ab"
        int y = 5; // "ba"
        String greaterString = new String();
        String lesserString = new String();
        int biggerScore = 0;
        int smallerScore = 0;
        int totalScore = 0;
        if (x > y) {
            greaterString = "ab";
            lesserString = "ba";
            biggerScore = x;
            smallerScore = y;
        } else {
            greaterString = "ba";
            lesserString = "ab";
            biggerScore = y;
            smallerScore = x;
        }
        // System.out.println(greaterString + " " + lesserString + " " + biggerScore + " " + smallerScore);
        Stack<Character> st = new Stack<>();
        st.push(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            Character c = str.charAt(i);
            Character st_c = st.peek();
            String combi = new String(st_c + "" + c);
            if (combi.equals(greaterString)) {
                st.pop();
                totalScore += biggerScore;
            } else {
                st.push(c);
            }
        }
        // System.out.println(totalScore);
        // System.out.println(st);
        StringBuilder sb = new StringBuilder();
        while(!st.empty()) {
            sb.append(st.pop());
        }
        String newStr = sb.reverse().toString();
        // System.out.println(newStr);
        st.push(newStr.charAt(0));
        for (int i = 1; i < newStr.length(); i++) {
            Character c = newStr.charAt(i);
            Character st_c = st.peek();
            String combi = new String(st_c + "" + c);
            if (combi.equals(lesserString)) {
                st.pop();
                totalScore += smallerScore;
            } else {
                st.push(c);
            }
            // System.out.println(st);
        }
        System.out.println(totalScore);
    }
}
