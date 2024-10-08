//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int minOperations(String str1, String str2) 
    { 
        // Your code goes here
        return solve(str1,str2);
    } 
    int solve(String str1,String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 0;i<n+1;i++) {
            dp[i][0] = i; 
        }
        for(int j = 0;j<m+1;j++) {
            dp[0][j] = j;
        }
        
        for(int i = 1;i<n+1;i++) {
            for(int j = 1;j<m+1;j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }else {
                    int add = dp[i][j-1]+1;
                    int del = dp[i-1][j]+1;
                    dp[i][j] = Math.min(add,del);
                }
            }
        }
        return dp[n][m];
    }
}