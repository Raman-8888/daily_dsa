import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> searchWord(char[][] mat, String word) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        char first = word.charAt(0);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == first && check(word, i, j, mat)) {
                    res.add(new ArrayList<>(Arrays.asList(i, j)));
                }
            }
        }
        return res;
    }

    public boolean check(String s, int i, int j, char[][] mat) {
        int n = mat.length, m = mat[0].length, len = s.length();

        // right scan
        if (m - j >= len) {
            StringBuilder str = new StringBuilder();
            for (int k = 0; k < len; k++) str.append(mat[i][j + k]);
            if (s.equals(str.toString())) return true;
        }

        // left scan
        if (j + 1 >= len) {
            StringBuilder str = new StringBuilder();
            for (int k = 0; k < len; k++) str.append(mat[i][j - k]);
            if (s.equals(str.toString())) return true;
        }

        // bottom scan
        if (n - i >= len) {
            StringBuilder str = new StringBuilder();
            for (int k = 0; k < len; k++) str.append(mat[i + k][j]);
            if (s.equals(str.toString())) return true;
        }

        // top scan
        if (i + 1 >= len) {
            StringBuilder str = new StringBuilder();
            for (int k = 0; k < len; k++) str.append(mat[i - k][j]);
            if (s.equals(str.toString())) return true;
        }

        // diagonal down-right
        if (n - i >= len && m - j >= len) {
            StringBuilder str = new StringBuilder();
            for (int k = 0; k < len; k++) str.append(mat[i + k][j + k]);
            if (s.equals(str.toString())) return true;
        }

        // diagonal down-left
        if (n - i >= len && j + 1 >= len) {
            StringBuilder str = new StringBuilder();
            for (int k = 0; k < len; k++) str.append(mat[i + k][j - k]);
            if (s.equals(str.toString())) return true;
        }

        // diagonal up-right
        if (i + 1 >= len && m - j >= len) {
            StringBuilder str = new StringBuilder();
            for (int k = 0; k < len; k++) str.append(mat[i - k][j + k]);
            if (s.equals(str.toString())) return true;
        }

        // diagonal up-left
        if (i + 1 >= len && j + 1 >= len) {
            StringBuilder str = new StringBuilder();
            for (int k = 0; k < len; k++) str.append(mat[i - k][j - k]);
            if (s.equals(str.toString())) return true;
        }

        return false;
    }
}