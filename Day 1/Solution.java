// https://leetcode.com/problems/arranging-coins/

class Solution {
    public int arrangeCoins(int n) {
        if(n == 0)
            return 0;
        
        int res = n;
        for(int i=1; i<=n; i++) {
            res = res-i;
            if( res <= -1 )
                return i-1;
            if(res == 0)
                return i;
        }
        return -1;
    }
}
