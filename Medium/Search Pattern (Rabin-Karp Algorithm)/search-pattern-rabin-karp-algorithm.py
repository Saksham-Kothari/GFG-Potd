#User function Template for python3

class Solution:
    def search(self, pattern, text):
        # code here
        n = len(pattern)
        m = len(text)
        if n > m:
            return -1
        else:
            res = []
            for i in range(m):
                if(text[i:i+n] == pattern):
                    res.append(1+i)
            return res




#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        s = input().strip()
        patt = input().strip()
        ob = Solution()
        ans = ob.search(patt, s)
        for value in ans:
            print(value,end = ' ')
        print()
# } Driver Code Ends