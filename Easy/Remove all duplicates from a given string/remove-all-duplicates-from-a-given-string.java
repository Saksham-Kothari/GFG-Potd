// { Drive Code Starts
// Initial Template for java


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();
            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Drive Code Ends

//User function Template for Java
class Solution {
    String removeDuplicates(String str) {
        String res = "";
        for( int i=0; i< str.length(); i++) {
            char c = str.charAt(i);
            if (res.indexOf(c) == -1){
                res += c;
                
            }
            
        }
        return res;
    }
}