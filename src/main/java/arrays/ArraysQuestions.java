package arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysQuestions {
    public static void main(String[] args) {
//        missingNumberInSortedArray();
//        multipleMissingNumberInSortedArray();
//        findMissingElementInUnsortedArray();
//           findDuplicateInSortedArray();
//           findDuplicateInSortedArrayUsingHashTable();
//           findDuplicateInUnSortedArrayUsingHashTable();
//             findPairSumInUnsortedArray();
             findPairSumInSortedArray();

    }

    private static void findPairSumInSortedArray() {
        int arr[]={1,3,4,5,6,8,9,10,12,14};
        int k =10;
        int i=0,j=arr.length-1;
        while (i<j){
            if(arr[i]+arr[j]==k){
                System.out.println(" pair is " + arr[i] + " " + arr[j]);
                i++;j--;
            }
            else if(arr[i]+arr[j]<k){
                i++;
            }
            else {
                j--;
            }
        }
    }

    private static void findPairSumInUnsortedArray() {
        int arr[] = {6,3,8,10,16,7,5,2,9,14};
        int k=10;
        int max = Arrays.stream(arr).max().getAsInt();
        int hash[] = new int[max+1];
        for(int i=0;i<hash.length;i++){
            hash[i]=0;
        }

        for(int i=0;i<arr.length;i++){
            if(k-arr[i]>0 && hash[k-arr[i]]!=0){
                System.out.println(" Pair is " + arr[i] + " " + (k-arr[i]));
            }
            hash[arr[i]]++;
        }
    }

    private static void findDuplicateInUnSortedArrayUsingHashTable() {
        int arr[]= {8,3,6,4,6,5,6,8,2,7};
        int max = Arrays.stream(arr).max().getAsInt();
        int hash[]= new int[max+1];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }

        for(int j=0;j<hash.length;j++){
            if(hash[j]>1){
                System.out.println(" Duplicate element " + j + " count " + hash[j]);
            }
        }
    }

    private static void findDuplicateInSortedArrayUsingHashTable() {
        int arr[]={3,6,8,8,10,12,15,15,15,20};
//        Size > max element
        int hash[]= new int[21];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }

        for(int j=0;j<hash.length;j++){
            if(hash[j]>1){
                System.out.println(" duplicate element " + j + " and count " + hash[j]);
            }
        }
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
