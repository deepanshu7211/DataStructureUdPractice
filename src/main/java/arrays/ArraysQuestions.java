package arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysQuestions {
    public static void main(String[] args) {
//        missingNumberInSortedArray();
//        multipleMissingNumberInSortedArray();
//        findMissingElementInUnsortedArray();
           findDuplicateInSortedArray();

    }

    private static void findDuplicateInSortedArray() {
        int arr[]={3,6,8,8,10,12,15,15,15,20};
//        Last duplicate becoz 15 is repeating three times. To avoid printinng it twice using this.
        int lastDuplicate=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1] && arr[i]!=lastDuplicate){
                System.out.println("Found duplicate elements " + arr[i]);
                lastDuplicate= arr[i];
            }
        }
    }

    public static void findMissingElementInUnsortedArray(){
        int arr[] ={3,7,4,9,12,6,1,11,2,10};
        int max = Arrays.stream(arr).max().getAsInt();
        int low=arr[0];
        int hash[]=new int[max+1];
        for(int i=0;i<=max;i++){
            hash[i]=-1;
        }

        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }

        for(int k=1;k<=max;k++){
            if(hash[k]==-1){
                System.out.println(" Missing element is " + k);
            }
        }
    }

    public static void multipleMissingNumberInSortedArray(){
        int arr[]={6,7,8,9,11,14,15,16};
        int diff=arr[0]-0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]-i)!=diff){
                while (diff<(arr[i]-i)){
                    System.out.println(" Missing element is " + (i+diff));
                    diff++;
                }
            }
        }
    }

    public static void  missingNumberInSortedArray(){
        int arr[]={6,7,8,9,10,11,13,14,15,16};
//        Diff will be constant b/w the elements and the index
        int diff = arr[0]-0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-i!=diff){
//                TO find the element we need to add index and the diff
                System.out.println("Missing element found " + (i+diff));
                break;
            }
        }
    }

}
