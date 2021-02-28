package com.issac.algorithms.offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: ywy
 * @date: 2021-02-20
 * @desc: 机器人运动范围
 */
public class Q13 {
    public static int solution(int m, int n, int k) {
        if (k == 0) {
            return 1;
        }
        Queue<int[]> queue = new LinkedList<int[]>();
        int[] dx = {0, 1};
        int[] dy = {1, 0};
        queue.offer(new int[]{0, 0});
        boolean[][] visited = new boolean[m][n];
        int ans = 1;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            for (int i = 0; i < 2; ++i) {
                int tx = dx[i] + x;
                int ty = dy[i] + y;
                if (tx < 0 || tx >= m || ty < 0 || ty >= n || visited[tx][ty] ||
                        get(tx) + get(ty) > k) {
                    continue;
                }
                queue.offer(new int[]{tx, ty});
                visited[tx][ty] = true;
                ans++;
            }
        }
        return ans;
    }

    private static int get(int x) {
        int ret = 0;
        while (x != 0) {
            ret += x % 10;
            x /= 10;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 3, 1));
        System.out.println(solution(3, 1, 0));

    }
}
