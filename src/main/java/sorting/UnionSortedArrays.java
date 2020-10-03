package sorting;

import java.util.ArrayList;

public class UnionSortedArrays {
    public static void main(String[] args) {

        unionOfSortedArrays();
    }

    private static void unionOfSortedArrays() {
        int a[]={3,8,8};
        int b[]={2,8,8,10,15};

        int i=0,j=0,m=a.length,n=b.length;
        while (i<m && j<n){
//            To avoid duplicate Printing
            if(i>0 && a[i]==a[i-1]){
                i++; continue;
            }
            if(j>0 && b[j]==b[j-1]){
                j++; continue;
            }

            if(a[i]<b[j]) {
                System.out.println(a[i]);
                i++;
            }
            else if(a[i]>b[j]){
                System.out.println(b[j]);
                j++;
            }
            else{
                System.out.println(a[i]);
                i++;j++;
            }
        }
        while (i<m){
            if(a[i]!=a[i-1])
            {
                System.out.println(a[i]);
            }
            i++;
        }
        while (j<n){
            if(b[j]!=b[j-1]){
                System.out.println(b[j]);
            }
            j++;
        }

    }
}
