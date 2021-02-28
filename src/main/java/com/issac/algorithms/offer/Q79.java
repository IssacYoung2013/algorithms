package com.issac.algorithms.offer;

/**
 * @author: ywy
 * @date: 2021-02-26
 * @desc:
 */
public class Q79 {

    static int[][] d = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    static int m, n;

    static boolean[][] visited;

    private static boolean searchWord(char[][] board, String word, int index, int startX, int startY) {
        if (index == word.length() - 1) {
            return board[startX][startY] == word.charAt(index);
        }
        if (board[startX][startY] == word.charAt(index)) {
            visited[startX][startY] = true;
            // 四个方向
            for (int i = 0; i < 4; i++) {
                int newX = d[i][0];
                int newY = d[i][1];
                if (inArea(newX, newY) && !visited[newX][newY] &&
                        searchWord(board, word, index + 1, newX, newY)) {
                    return true;
                }
            }
            visited[startX][startY] = false;
        }
        return false;
    }

    private static boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    public static boolean solution(char[][] board, String word) {
        m = board.length;
        assert m > 0;
        n = board[0].length;
        visited = new boolean[m][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (searchWord(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] c = {
                {     'A','B','C','E'},
                {     'A','B','C','E'},
                {     'A','B','C','E'},

        };
        System.out.println(solution(c,"ABC"));
        System.out.println(solution(c,"ABD"));

    }
}
