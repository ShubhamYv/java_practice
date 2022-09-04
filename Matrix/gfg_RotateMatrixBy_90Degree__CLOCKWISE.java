public class gfg_RotateMatrixBy_90Degree__CLOCKWISE {
    public static void rotateMat(int[][] mat) {
        int N = mat.length;
        for (int j = 0; j < N; j++) {
            for (int i = N - 1; i >= 0; i--)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat={{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        rotateMat(mat);
    }
}