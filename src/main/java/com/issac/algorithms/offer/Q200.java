package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-27
 * @desc:
 */
public class Q200 {
    static int[][] d = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    static int m, n;
    static boolean[][] visited;

    static boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    public static int solution(char[][] grids) {
        if (grids.length == 0) {
            return 0;
        }
        int res = 0;
        m = grids.length;
        n = grids[0].length;
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grids[i][j] == '1' && !visited[i][j]) {
                    res++;
                    dfs(grids, i, j);
                }
            }
        }
        return res;
    }

    private static void dfs(char[][] grids, int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = d[i][0] + x;
            int newY = d[i][1] + y;
            // 隐藏的递归终止条件
            if (inArea(newX, newY) && !visited[newX][newY] && grids[newX][newY] == '1') {
                dfs(grids, newX, newY);
            }
        }
    }
}
