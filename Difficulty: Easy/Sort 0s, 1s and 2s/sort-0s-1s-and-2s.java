//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int numb1=0,numb2=0;
        int len=arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]==1){
                numb1++;
            }else if(arr[i]==2){
                numb2++;
            }
        }
        // fill 0
        int k=0;
        int j=0;
       while(j<len && j<(len-(numb1+numb2))){
           arr[j++]=0;
           k++;
       }
        // fill 1
        k=0;
        while(j<len && k<numb1){
            arr[j++]=1;
            k++;
        }
        // fill 2
        k=0;
        while(j<len && k<numb2){
            arr[j++]=2;
        }
    }
}

//{ Driver Code Starts.
// } Driver Code Ends