import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class code {

    /*
     * POTD. 1717. Maximum Score From Removing Substrings
     * TC = O(N) + O(N)
     * SC = O(N)
     */
    public static void main(String[] args) {
        /* 
        POTD - 1701. Average Waiting Time
        */
        int[][] customers = {{1,2},{2,5},{4,3}};
        int arrival_time = 0;
        int total_wait_time = 0;
        int chef_time = 0;
        int prev_wait_time = 0;
        for (int i = 0; i < customers.length; i++) {
            arrival_time = Math.max(prev_wait_time, customers[i][0]);
            chef_time = customers[i][1];
            prev_wait_time = arrival_time + chef_time;
            total_wait_time += prev_wait_time - customers[i][0];
        }
        double avg = total_wait_time / customers.length;
        System.out.println(avg);
    }

}
