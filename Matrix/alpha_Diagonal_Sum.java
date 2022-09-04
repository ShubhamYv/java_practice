import java.security.PublicKey;

public class alpha_Diagonal_Sum {


    /*BRUTE FORCE APPROACH--> O(N^2)  ------>Overlaping condition covered in (i==j) */
//    public static int diagSum(int arr[][]) {
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (i==j)
//                    sum+= arr[i][j];
//                else if (i+j== arr.length-1) {
//                    sum+= arr[i][j];
//                }
//            }
//        }
//        return sum;
//    }

    public static int diagSum(int arr[][]) {
        int sum=0;
        //Primary Diagonal Sum
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i][i];
            //Seconadry Diagonal Sum
            if (i!= arr.length-1-i)
                sum+= arr[i][arr.length-1-i];
        }
        return sum;
    }

    public static void main(String[] args) {
//        int arr[][]= {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}}; //overlaping condn will come in this arr
        System.out.println(diagSum(arr));
    }
}
