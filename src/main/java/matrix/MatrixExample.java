package matrix;

public class MatrixExample {
    public static void main(String[] args) {
//        lowerTriangle();
        upperTriangle();
    }

    public static void upperTriangle(){
        int arr[][] = {
                {1, 2, 3},
                {8, 6, 4},
                {4, 5, 6}
        };

        int row = arr.length;
        int col = arr[0].length;
        if(row!=col){
            System.out.println(" Arrays should be square matrix");
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i<=j){
                    System.out.print(arr[i][j] + " ");
                }
                else {
                    System.out.print( "  ");
                }
            }
            System.out.println();
        }

    }

    public static void lowerTriangle(){
        int arr[][] = {
                {1, 2, 3},
                {8, 6, 4},
                {4, 5, 6}
        };

        int row = arr.length;
        int col = arr[0].length;
        if(row!=col){
            System.out.println(" Arrays should be square matrix");
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i>=j){
                    System.out.print(arr[i][j] + " ");
                }
                else {
                    System.out.print( " ");
                }
            }
            System.out.println();
        }

    }
}
