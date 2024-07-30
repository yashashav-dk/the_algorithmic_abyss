package POTD;
import java.util.Stack;

class CrawlerLogFolder_1598 {

    public static void main(String[] args) {
        /* 
        POTD - 1598. Crawler Log Folder
        */
        String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
        Stack<String> st = new Stack<>();

        for (int i = 0; i < logs.length; i++) {
            String str = logs[i];
            if (str.equals("./")) {
                continue;
            }
            if (str.equals("../")) {
                if (st.empty()) {
                    continue;
                } else {
                    st.pop();
                }
            } else {
                st.push(str);
            }
        }
        System.out.println(st.size());
        
    }

}
