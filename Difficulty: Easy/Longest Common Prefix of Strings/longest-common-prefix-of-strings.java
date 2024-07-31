//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        StringBuilder res = new StringBuilder();
        Arrays.sort(arr);
        
        String sml = arr[0];
        String lrg = arr[arr.length-1];
        int n = Math.min(sml.length(), lrg.length());
        
        for (int i=0; i<n; i++) {
            if (sml.charAt(i) != lrg.charAt(i)) {
                break;
            }
            res.append(sml.charAt(i));
        }
        
        if(res.length()==0) return "-1";
        
        return res.toString();
    }
}