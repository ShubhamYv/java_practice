public class alpha_SearchInSortedMatrix {
    public static boolean staircaseSearch(int arr[][], int key) {
        int row= 0;
        int col= arr[0].length-1;
        while (row< arr.length && col>=0){
            if (arr[row][col]== key){
                System.out.println("found at ("+row+", "+col+")");
                return true;
            } else if (arr[row][col]> key) {
                col--;
            }else //--------key<
                row++;
        }
        System.out.println("Not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] arr= {{10,20,30,40}, {15,25,35,45},{27,29,37,39},{32,33,39,50}};
        int key= 33;
        staircaseSearch(arr, key);
    }
}
