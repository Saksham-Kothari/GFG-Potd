//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


class Solution {
    ArrayList<String> res = new ArrayList<>();
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        int n = mat.length;
        if(mat[0][0]==0||mat[n-1][n-1]==0){
            res.add("-1");
            return res;
        }
        
        boolean[][] vis = new boolean[n][n];
        String path = "";
        dfs(mat,0,0,n,vis,path);
        return res;
    }
    void dfs(int[][] mat, int i, int j, int n, boolean[][] vis,String path){
        if(i < 0 || j < 0 || i >= n || j >= n ) return;
        if (mat[i][j]== 0 || vis[i][j] == true) return; 
        if(i== n-1 && j==n-1){
            res.add(path);
            return;
        }
        vis[i][j] = true;
        dfs(mat,i+1,j,n,vis,path + 'D');
        dfs(mat,i-1,j,n,vis,path + 'U');
        dfs(mat,i,j+1,n,vis,path + 'R');
        dfs(mat,i,j-1,n,vis,path + 'L');
        vis[i][j] = false;
    }
}