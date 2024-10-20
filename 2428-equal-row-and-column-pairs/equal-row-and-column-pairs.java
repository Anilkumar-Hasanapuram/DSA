class Solution {
    public int equalPairs(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        Map<String, Integer> count = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid[0].length; j++) {
                sb.append(grid[i][j]);
                sb.append('-');
            }
            count.put(sb.toString(), count.getOrDefault(sb.toString(), 0) + 1);
        }

        int res = 0;
        for (int j = 0; j < grid[0].length; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < grid.length; i++) {
                sb.append(grid[i][j]);
                sb.append('-');
            }
            res += count.getOrDefault(sb.toString(), 0);
        }

        return res;
    }
}