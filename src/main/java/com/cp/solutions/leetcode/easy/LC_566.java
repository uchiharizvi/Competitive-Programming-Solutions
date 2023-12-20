package Easy;

public class LC_566 {
    public static void main(String[] args) {

        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        matrixReshape(arr, 2, 4);
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int[][] res = new int[r][c];
        int m = 0;
        int n = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                res[m][n] = mat[i][j];
                if (m < r - 1) {
                    m++;
                    if (n < c - 1) {
                        n++;
                    }
                }
            }
        }
        return res;
    }
}
