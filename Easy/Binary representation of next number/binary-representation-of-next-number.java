//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.binaryNextNumber(s));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String binaryNextNumber(String s) {
        // code here.
        int n=s.length(), i=0, j=n-1;
        
        for(;i<=j;i++)  if(s.charAt(i)=='1')   break;
        
        for(;i<=j;j--)   if(s.charAt(j)=='0')   break;
        
        if(j<i) return "1" + "0".repeat(n-j-1);
        return s.substring(i,j)+ "1" + "0".repeat(n-j-1);
    }
}