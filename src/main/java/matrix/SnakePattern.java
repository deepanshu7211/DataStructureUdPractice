package matrix;

public class SnakePattern  {

    public static void main(String[] args) {
        snakePattern();
    }

    /*
    * Snake Pattern means we need to print from left to right for i%2=0
    * and right to left for i%2!=0
    * */
    private static void snakePattern(){
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j] +" ");
                }
            }
            else{
                for(int j=arr[i].length-1;j>=0;j--){
                    System.out.print(arr[i][j] +" ");
                }
            }
            System.out.println();
        }

    }
}
