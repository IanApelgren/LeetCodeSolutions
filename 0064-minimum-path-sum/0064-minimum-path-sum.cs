public class Solution {
    public int MinPathSum(int[][] grid) {
        for(int i = 0; i < grid.Length; i++) {
            for (int j = 0; j < grid[i].Length; j++) {
                if (i == 0 && j == 0)
                    continue;

                if (i == 0) {
                    grid[i][j] += grid[i][j - 1];
                    continue;
                }

                if (j == 0) {
                    grid[i][j] += grid[i - 1][j];
                    continue;
                }

                grid[i][j] += Math.Min(grid[i][j - 1], grid[i - 1][j]);
            }
        }

        return grid[grid.Length - 1][grid[0].Length - 1];
    }
}