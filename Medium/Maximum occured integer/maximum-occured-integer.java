//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            // taking size of array
            int n = Integer.parseInt(br.readLine().trim());
            int l[] = new int[n];
            int r[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            // adding elements to array L
            for (int i = 0; i < n; i++) {
                l[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int maxx = Integer.MIN_VALUE;

            // adding elements to array R
            for (int i = 0; i < n; i++) {
                r[i] = Integer.parseInt(inputLine[i]);
                if (r[i] > maxx) {
                    maxx = r[i];
                }
            }

            Solution obj = new Solution();

            // calling maxOccured() function
            System.out.println(obj.maxOccured(n, l, r, maxx));
        }
    }
}


// } Driver Code Ends
// L[] and R[] are input ranges
// n : size of array
// maxx: maximum element in R[]
// arr[]: declared globally with size equal to 1000000

public class Solution {
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int n, int[] l, int[] r, int maxx) {
        // Step 1: Initialize the frequency array with size maxx + 2.
        int[] freq = new int[maxx + 2];
        
        // Step 2: Apply range updates to the frequency array.
        for (int i = 0; i < n; i++) {
            // Increment at the start of the range
            freq[l[i]]++;
            // Decrement at the position just after the end of the range
            freq[r[i] + 1]--;
        }
        
        // Step 3: Compute the prefix sums to get the actual frequencies.
        int maxFreq = freq[0];
        int result = 0;
        for (int i = 1; i <= maxx; i++) {
            // Update the current frequency value with the previous one.
            freq[i] += freq[i - 1];
            
            // Step 4: Find the maximum frequency and the smallest integer with that frequency.
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = i;
            }
        }
        
        return result;
    }// The smallest integer with the maximum frequency.
}

//{ Driver Code Starts.

// } Driver Code Ends