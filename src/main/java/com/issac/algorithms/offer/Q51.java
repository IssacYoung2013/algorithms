package com.issac.algorithms.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ywy
 * @date: 2021-02-27
 * @desc:
 */
public class Q51 {

    static List<List<String>> res = new ArrayList<List<String>>();

    static boolean[] col;
    static boolean[] dia1;
    static boolean[] dia2;

    /**
     * 尝试在n皇后，摆放在index的皇后位置
     *
     * @param n
     * @param index
     * @param row
     */
    static void putQueue(int n, int index, List<Integer> row) {
        if (index == n) {
            res.add(generateBoard(n, row));
            return;
        }
        for (int i = 0; i < n; i++) {
            // 尝试在index行的皇后放在i列
            if (!col[i] && !dia1[index + i] && !dia2[index - i + n - 1]) {
                row.add(Integer.valueOf(i));
                col[i] = true;
                dia1[index + i] = true;
                dia2[index - i + n - 1] = true;
                putQueue(n, index + 1, row);
                col[i] = false;
                dia1[index + i] = false;
                dia2[index - i + n - 1] = false;
                row.remove(Integer.valueOf(i));
            }
        }
    }

    private static List<String> generateBoard(int n, List<Integer> row) {
        assert row.size() ==n;
        List<String> board = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            char[] chars = new char[n];
            for (int j = 0; j < n; j++) {
                if(row.get(i) == j) {
                    chars[j] = 'Q';
                }else {
                    chars[j] = '.';
                }
            }
            board.add(String.valueOf(chars));
        }
        return board;
    }

    static List<List<String>> solution(int n) {
        res.clear();
        List<Integer> row = new ArrayList<Integer>();
        col = new boolean[n];
        dia1 = new boolean[2 * n - 1];
        dia2 = new boolean[2 * n - 1];
        putQueue(n, 0, row);
        return res;
    }

    public static void main(String[] args) {
        List<List<String>> solution = solution(8);
        for (List<String> strings : solution) {
            for (String string : strings) {
            System.out.println(string);
            }
            System.out.println();
        }
    }
}
