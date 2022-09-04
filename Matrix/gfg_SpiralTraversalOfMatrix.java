public class gfg_SpiralTraversalOfMatrix {
    public static void spiralMatrix(int[][] mat){
        int stRow= 0;
        int endRow= mat.length-1;
        int stCol=0;
        int endCol= mat[0].length-1;
        while (stRow<= endRow && stCol<= endCol){
            for (int j=stCol; j <= endCol; j++) {
                System.out.print(mat[stCol][j]+" ");
            }
            for (int i = stRow+1; i <= endRow; i++) {
                System.out.print(mat[i][endCol]+" ");
            }
            for (int j = endCol-1; j >= stCol; j--) {
                if (stCol== endCol){
                    break;
                }
                System.out.print(mat[endRow][j]+" ");
            }
            for (int i = endRow-1; i >= stRow+1; i--) {
                System.out.print(mat[i][stCol]+" ");
            }
            stRow++;
            stCol++;
            endRow--;
            endCol--;
        }

    }
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        spiralMatrix(mat);

    }
}
