package hashing;

import java.util.HashSet;

public class FirstRepeatedElement {
    public static void main(String[] args) {
        int arr[]={1,5,3,4,3,5,6};
        int n=arr.length;

        HashSet<Integer> hs = new HashSet<Integer>();
        int min=Integer.MIN_VALUE;
        //Trick to traverse from the right

        for(int i=n-1;i>=0;i--){
            if(hs.contains(arr[i])){
                min=i;
            }
            else{
                hs.add(arr[i]);
            }
        }
        min= (min == Integer.MIN_VALUE)? -1:(min + 1);
        System.out.println(" " + min);
    }
}
