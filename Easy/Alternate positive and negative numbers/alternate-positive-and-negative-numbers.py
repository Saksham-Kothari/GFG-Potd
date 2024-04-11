#User function Template for python3

class Solution:
    def rearrange(self, arr, n):
        p, n, ans = [], [], []
        for i in arr:
            if i >= 0:
                p.append(i)
            else:
                n.append(i)
        
        i, j = 0, 0
        
        
        while i < len(p) and j < len(n):
            ans.append(p[i])
            i += 1
            ans.append(n[j])
            j += 1
        
        
        ans.extend(p[i:])
        ans.extend(n[j:])
        
        
        arr[:] = ans[:]



#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	tc = int(input())
	while tc > 0:
		n = int(input())
		arr = list(map(int, input().strip().split()))
		ob = Solution()
		ob.rearrange(arr, n)
		for x in arr:
			print(x, end=" ")
		print()
		tc -= 1

# } Driver Code Ends