package binary_search;

//Subarray with given sum- Window siding technique
public class SubArrayWithSum {
    public static void main(String[] args) {
         int  n= 10, s = 15;
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int low=0,high=0,sum=a[0];

        while((low<n) && (high<n)){
            if(sum==s)
            {
                System.out.println( " " + (low) + "  " + (high));
                return;
            }
            else if(sum<s){
                high++;
                sum+=a[high];
            }
            else {
                low++;
                sum-=a[low];
            }
        }
        System.out.println(" -1 ");
    }
}
