public class Pattern_Butterfly {
    public static void main(String args[]){
        int n=4;
        //FOR UPPER PART
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            int space= 2*(n-i);
            for (int j=1; j<=space; j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //FOR LOWER PART
        for(int i=n; i>=1; i--) {
           for(int j=1; j<=i; j++) {
               System.out.print("*"+" ");
           }
           int space= 2*(n-i);
           for(int j=1; j<=space; j++){
               System.out.print("  ");
           }
           for(int j=1; j<=i; j++){
               System.out.print("*"+" ");
           }
            System.out.println();
        }

    }
}
