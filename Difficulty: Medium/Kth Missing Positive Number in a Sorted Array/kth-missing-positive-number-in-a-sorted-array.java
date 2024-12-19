//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.kthMissing(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int kthMissing(int[] arr, int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        int max = arr[arr.length-1];
        int start = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int curr:arr){
            map.put(curr,0);
        }
        for(int i = start;i<=max+k;i++){
            if(!map.containsKey(i)){
            temp.add(i);
            }
        }
        return temp.get(k-1);
    }
}
