package Week06;
//Java：最小路径和
public class P64MinimumPathSum{


    public int minPathSum(int[][] grid) {


        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                //如果是0
                if(i == 0 && j == 0)
                    continue;
                //如果上边是边界 证明只能从左边来 + 当前值
                else if(i == 0)
                    grid[i][j] = grid[i][j - 1] + grid[i][j];
                else if
                //如果左边是边界 证明只能从上边来
                    (j == 0)  grid[i][j] = grid[i - 1][j] + grid[i][j];
                else
                // 当前值 比较 左边来 or 上边来
                    grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }
        }


        return grid[grid.length - 1][grid[0].length - 1];
    }


}
//leetcode submit region end(Prohibit modification and deletion)

