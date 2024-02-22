# Your task is to complete this function
# Finction should return Integer
class Solution:
    def sequenceCount(self,s, t):
    # Code here
        m=10**9+7
        x,y=len(s),len(t)
        dp=[0 for _ in range(y+1)]
        dp[0]=1
        for i in range(1,x+1):
            for j in range(min(i,y),0,-1):
                if s[i-1]==t[j-1]:
                    dp[j]=(dp[j]+dp[j-1])%m
        return dp[-1]



#{ 
 # Driver Code Starts
#Initial template for Python 3

import sys
sys.setrecursionlimit(10**6)

if __name__=='__main__':
    t = int(input())
    for i in range(t):
        arr = input().strip().split()
        print(Solution().sequenceCount(str(arr[0]), str(arr[1])))
# } Driver Code Ends