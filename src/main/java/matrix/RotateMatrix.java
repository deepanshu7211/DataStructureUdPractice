package matrix;

public class RotateMatrix {

    public static void main(String[] args) {
     rotateMatrixBy90Degree();
    }

    /*
    *  First Transpose the matrix and second steps is to reverse the every column values
    * */
    private static void rotateMatrixBy90Degree(){
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
//                swap a[i][j] with a[j][i]
                int temp= arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        System.out.println(" Transpose matrix ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println(" Rotation of 90 Degree ");
        for(int i=0;i<arr.length;i++){
            int low=0,high=arr.length-1;
            while(low<high){
                int temp= arr[low][i];
                arr[low][i]=arr[high][i];
                arr[high][i]=temp;
                low++;
                high--;
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
