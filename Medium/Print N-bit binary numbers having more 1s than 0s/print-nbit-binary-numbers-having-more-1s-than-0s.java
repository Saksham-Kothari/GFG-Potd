//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<String> NBitBinary(int N) {
        // code here
        ArrayList<String> ans = new ArrayList<String>();
        
         bit("",ans,1,N,0,0);
         
         return ans;
    }
    void bit(String root ,ArrayList<String> output, int size,int Allsize ,int zero,int one){
        
        if(size ==Allsize ){
            root = "1"+root;
            output.add(root);
        }else{
           
            if(size < Allsize){
                 bit(root+"1",output,size+1,Allsize,zero,one+1);
            }
            if(zero <= one){
                 bit(root+"0",output,size+1,Allsize,zero+1,one);
                
            }
        }
    }
}