package thirdWeek;

public class MaxSquare {
    public int maximalSquare(char[][] matrix) {
        //方法一：动态规划 短板桶理论
        //dp 具体定义：dp[i + 1][j + 1] 表示 「以第 i 行、第 j 列为右下角的正方形的最大边长」
        //dp[i][j] = min(dp[i-1][j], dp[i][j-1],dp[i-1][j-1]) + 1
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return 0;
        }
        int hang = matrix.length;
        int lie = matrix[0].length;
        int[][] dp = new int[hang+1][lie+1]; // 加一行一列都为0 很巧妙
        //避免第一行第一列的特殊处理
        int maxSide = 0;

        for(int i = 0; i < hang; i++){
            for(int j = 0; j < lie; j++){
                if(matrix[i][j] == '1'){
                    dp[i+1][j+1] = Math.min(Math.min(dp[i][j+1], dp[i+1][j]),
                            dp[i][j]) + 1;
                }
                maxSide = Math.max(maxSide, dp[i+1][j+1]);
            }
        }
        return maxSide*maxSide;
    }
}
