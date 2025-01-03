//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String s[] = br.readLine().split(" ");
            int arr[] = new int[s.length];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int k = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            System.out.println(obj.subarrayXor(arr, k));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public long subarrayXor(int arr[], int k) {
        long count = 0;
        int prefixXor = 0;
        HashMap<Integer, Long> map = new HashMap<>();
        
        // Initialize the map with prefix XOR of 0 occurring once (important for cases where prefixXor == k)
        map.put(0, 1L);
        
        for (int num : arr) {
            // Update the prefix XOR up to the current index
            prefixXor ^= num;
            
            // Check if the current prefix XOR ^ k exists in the map
            if (map.containsKey(prefixXor ^ k)) {
                count += map.get(prefixXor ^ k); // Add the count of previous prefix XORs that satisfy the condition
            }
            
            // Add the current prefix XOR to the map
            map.put(prefixXor, map.getOrDefault(prefixXor, 0L) + 1);
        }
        
        return count;
    }
}