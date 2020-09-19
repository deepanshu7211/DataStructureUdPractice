package arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int result =-1;
        int key = 15;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                result=i;
                break;
            }
        }
        System.out.println(" result " + result);
    }
}
