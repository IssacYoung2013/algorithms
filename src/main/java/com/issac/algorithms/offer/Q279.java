package com.issac.algorithms.offer;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: ywy
 * @date: 2021-02-24
 * @desc: perfect squares
 */
public class Q279 {
    public static int solution(int n) {
        assert n > 0;
        Queue<int[]> q = new LinkedList<int[]>();
        q.offer(new int[]{n, 0});
        boolean[] visited = new boolean[n + 1];
        visited[n] = true;
        while (!q.isEmpty()) {
            int[] item = q.poll();
            int num = item[0];
            int step = item[1];
            for (int i = 1; ; i++) {
                int a = num - i * i;
                if (a < 0) {
                    break;
                } else if (a == 0) {
                    return step + 1;
                }
                if (!visited[a]) {
                    q.offer(new int[]{a, step + 1});
                    visited[a] = true;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
        System.out.println(solution(13));

    }
}
