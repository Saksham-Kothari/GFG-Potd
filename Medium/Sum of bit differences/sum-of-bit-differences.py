#User function Template for python3
class Solution:
    def sumBitDifferences(self,arr, n):
     # code here
     count,res=0,0
     for i in range(32):
         one,zero=0,0
         for j in arr:
             if j&(1<<i)==0:
                 zero+=1
             else:
                 one+=1
         res+=zero*one*2
     return res

#{ 
 # Driver Code Starts

#Initial Template for Python 3


if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.sumBitDifferences(arr, n)
        print(ans)
        tc -= 1

# } Driver Code Ends