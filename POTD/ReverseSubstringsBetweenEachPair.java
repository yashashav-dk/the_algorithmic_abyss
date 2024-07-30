package POTD;
import java.util.ArrayList;
import java.util.Stack;

class ReverseSubstringsBetweenEachPair {

    public static void main(String[] args) {
       /*
        * POTD 1190. Reverse Substrings Between Each Pair of Parentheses
        * 
        * 
        */
        String s = "(ed(et(oc))el)";
        Stack <Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c1 = s.charAt(i);
            if (c1 == ')') {
                // append the characters present between the starting braces 
                ArrayList<Character> aux_list = new ArrayList<>();
                while (st.peek() != '(') {
                    Character c2 = st.pop();
                    aux_list.add(c2);
                }
                if (st.peek() == '(') {
                    st.pop();
                }
                for (Character character : aux_list) {
                    st.push(character);
                }
                
            } else {
                st.push(c1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder("");
        for (Character character : st) {
            stringBuilder.append(character);
        }
        System.out.println(stringBuilder);
    }


}
