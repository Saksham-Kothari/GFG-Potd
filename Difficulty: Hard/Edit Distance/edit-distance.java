//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    int m;
    int n;
    int dp[][];
    public int editDistance(String str1, String str2) {
        // Code here
        m=str1.length();
        n=str2.length();
        dp=new int[m+1][n+1];
        for(int d[]:dp)Arrays.fill(d,-1);
        return solve(str1,str2,0,0);
    }
    public int solve(String s1,String s2,int i,int j){
        if(j>=n)return m-i;
        if(i>=m)return n-j;
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        // first character is matched
        if(s1.charAt(i)==s2.charAt(j)){
            return solve(s1,s2,i+1,j+1);
        }
        
        //other wise we have three options either we make same---delete --- or replace
        int insert=1+solve(s1,s2,i,j+1);
        
        
        int remove=1+solve(s1,s2,i+1,j);
        
        int replace=1+solve(s1,s2,i+1,j+1);
        
        return dp[i][j]= Math.min(insert,Math.min(remove,replace));
        
        
        
    }
}