package hashing;

import java.util.HashSet;

public class HashingExamples {
    public static void main(String[] args) {
        countDuplicates();
        intersectionOfTwoArrays();
    }

    private static void intersectionOfTwoArrays() {
        int a[]={10,15,20,15,30,30,5};
        int b[]={30,5,30,80};
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0;i < a.length;i++){
            hashSet.add(a[i]);
        }

        for(int j=0;j< b.length;j++){
            if(hashSet.contains(b[j])){
                System.out.print (b[j] +" ");
                hashSet.remove(b[j]);
            }
        }
    }

    private static void countDuplicates() {
        int arr[]={15,12,13,12,13,13,17};
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i=0;i<arr.length;i++) {
            hashSet.add(arr[i]);
        }

        System.out.println(" DUplicates elemets are " +hashSet.size() );
    }
}
