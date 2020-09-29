package arrays;

import java.util.Arrays;

public class LeftRotationArrays {

    public static void main(String[] args) {

        leftRotateByOne();
        System.out.println();
        leftRotateByD();
    }


    private static void leftRotateByD(){
        int arr[]={1,2,3,4,5};
        int d=2;
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }

//        Move every element fwd to d position
        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }

        for(int i=0;i<d;i++){
            arr[arr.length-d+i]=temp[i];
        }

        Arrays.stream(arr).forEach(x->System.out.print(x+" "));
    }

    private static void leftRotateByOne(){
        int arr[]={1,2,3,4,5};
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }
}
