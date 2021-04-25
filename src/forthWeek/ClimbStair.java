package forthWeek;

public class ClimbStair {
        public int climbStairs(int n) {
            //方法一 ：普通的递归 时间O(2的n次幂)
            // if(n == 1 || n == 2){
            //     return n;
            // }
            // return climbStairs(n - 2) + climbStairs(n - 1);
            //方法2：动态规划 自底向上 找通项公式 时间O(n) 空间O(n)
            // int[] dp = new int[n+1];
            // dp[0] = 1;
            // dp[1] = 1;
            // for(int i = 2; i<=n; i++){
            //     dp[i] = dp[i - 1] + dp[i - 2];
            // }
            // return dp[n];

            //方法3: 滚动数组 时间O(n) 空间O(1)
            int p = 0, q = 0, r = 1;
            for(int i = 1; i<=n ; i++){
                p = q;
                q = r;
                r = p + q;
            }
            return r;
        }
}
