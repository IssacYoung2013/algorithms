package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-20
 * @desc: 矩阵的最短路径
 */
public class Q12 {
    public static boolean solution(char[][] arr, String target) {
        char[] charArray = target.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (dfs(arr, charArray, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] arr, char[] word, int i, int j, int k) {
        if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length || arr[i][j] != word[k]) {
            return false;
        }
        if (k == word.length - 1) {
            return true;
        }
        arr[i][j] = '\0';
        boolean res = dfs(arr, word, i + 1, j, k + 1) || dfs(arr, word, i - 1, j, k + 1)
                || dfs(arr, word, i, j - 1, k + 1) || dfs(arr, word, i, j + 1, k + 1);
        arr[i][j] = word[k];
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solution(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        }, "ABCCED"));
    }
}
