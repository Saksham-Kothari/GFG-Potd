#User function Template for python3
class Solution:
	def print2largest(self,arr, n):
		# code here
		a = arr.sort(reverse = True)
		ans = set()
		i = len(arr)-1
		for i in arr:
		    ans.add(i)
    		if len(ans) == 2:
    		    return i
        return -1		    


#{ 
 # Driver Code Starts
# Initial Template for Python 3
if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.print2largest(arr, n)
        print(ans)
        tc -= 1

# } Driver Code Ends