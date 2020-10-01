package matrix;

public class MaxElementInSortedMatrix {

    public static void main(String[] args) {
        findElementInSortedMatrix();
    }

    /*
    * Start from the top right and check element with X.
    * if X>arr[i][j] - then do i++
    * else j--
    * */
    private static void findElementInSortedMatrix(){
        int arr[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 35, 45},
                {32, 33, 39, 50}};
        int x = 29;
        int i=0,j=arr.length-1;
        while (i<arr.length && j>=0){
            if(arr[i][j]==x){
                System.out.println(" Find the element " + i +" " +j);
                break;
            }
            else if(x>arr[i][j]){
                i++;
            }
            else{
                j--;
            }
        }

    }
}
