public class gfg_BoundaryTraversalOfMatrix {
    public static void boundaryEle(int[][] mat) {
        int n= mat.length;
        int m= mat[0].length;
        int stRow= 0, endRow=n-1;
        int stCol=0, endCol= n-1;
        for (int j = stCol ;j<= endCol; j++) {
            System.out.print(mat[stRow][j]+" ");
        }
        for (int i = stRow+1; i <= endRow; i++) {
            System.out.print(mat[i][endCol]+" ");
        }
        for (int j = endCol-1; j>=stCol; j--) {
            System.out.print(mat[endRow][j]+" ");
        }
        for (int i = endRow-1; i >= stRow+1 ; i--) {
            System.out.print(mat[i][stCol]+" ");
        }
    }

    public static void main(String[] args) {
//        int[][] mat={{1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}};
        int mat[][]= {{5, 11}, {30, 19}, {19, 5}};//wrong output coming
        boundaryEle(mat);
    }
}
