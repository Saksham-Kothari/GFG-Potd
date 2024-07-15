//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int s = sc.nextInt();
            int d = sc.nextInt();

            Solution obj = new Solution();
            String res = obj.smallestNumber(s, d);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends



class Solution {
    public String smallestNumber(int s, int d) {
        // code here
        if(d*9 < s) return "-1";
        StringBuilder ans = new StringBuilder();
        
        while(d-- > 0) {
            int i= (ans.length() == 0) ? 1 : 0;
            
            if(d == 0) {
                ans.append(s);
                break;
            }
            
            while(d*9 < (s-i)) {
                i++;
            }
            
            ans.append(i);
            s -= i;
        }
        
        return ans.toString();
    }


}
