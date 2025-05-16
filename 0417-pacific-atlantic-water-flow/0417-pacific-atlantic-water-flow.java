class Solution {
        private static final int[][] DIRECTIONS = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0) return result;
        
        int m = heights.length, n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        
        // Perform DFS for Pacific Ocean
        for (int i = 0; i < m; i++) {
            dfs(heights, pacific, i, 0);
            dfs(heights, atlantic, i, n - 1);
        }
        
        // Perform DFS for Atlantic Ocean
        for (int j = 0; j < n; j++) {
            dfs(heights, pacific, 0, j);
            dfs(heights, atlantic, m - 1, j);
        }
        
        // Collect cells reachable by both oceans
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        
        return result;
    }
     private void dfs(int[][] heights, boolean[][] visited, int i, int j) {
        int m = heights.length, n = heights[0].length;
        visited[i][j] = true;
        
        for (int[] dir : DIRECTIONS) {
            int x = i + dir[0], y = j + dir[1];
            if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y]) continue;
            if (heights[x][y] >= heights[i][j]) {
                dfs(heights, visited, x, y);
            }
        }
    }
}