public class Pattern_PalindromicPattern {
    public static void main(String[] args){
        int n=5;
        for (int i=1; i<=n; i++){
            //SPACES
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //1ST HALF NUMBERS
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){ //for(int j=1; j<=i; j++)
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
