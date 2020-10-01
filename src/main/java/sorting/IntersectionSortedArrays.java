package sorting;

public class IntersectionSortedArrays {
    public static void main(String[] args) {
        intersectionOfSortedArrays();
    }

    private static void intersectionOfSortedArrays() {
        int a[]={3,5,10,10,10,15,15,20};
        int b[]={5,10,10,15,30};

        int i=0,j=0,m=a.length,n=b.length;
        while (i<m && j<n){
//            To avoid duplicate Printing
            if(i>0 && a[i]==a[i-1]){
                i++; continue;
            }
            if(a[i]<b[j]) i++;
            else if(a[i]>b[j]) j++;
            else{
                System.out.println(a[i]);
                i++;j++;
            }
        }

    }
}
