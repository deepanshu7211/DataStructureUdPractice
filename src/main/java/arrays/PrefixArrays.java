package arrays;

public class PrefixArrays {

    public static void main(String[] args) {
        prefixSum();
        equlibirumPoint();
        maximumElementInRange();
    }

    private static void maximumElementInRange() {
        int L[]={1,2,3};
        int R[]={3,5,7};
        int arr[]=new int[1000];

        for(int i=0;i<L.length;i++){
            arr[L[i]]++;    // To mark starting of the index
            arr[R[i]+1]--;  // To mark the end of the index
        }

        //PRefix sum array
        int max=arr[0],res=0;
        for(int i=1;i<1000;i++){
            arr[i]=arr[i]+arr[i-1];
            if(max < arr[i]){
                max=arr[i];
                res=i;
            }
        }

        System.out.println(" number of times of elemetns " +res);

    }


    private static void equlibirumPoint(){
        int arr[]={3,4,8,-9,20,6};
        int sum=0,left_sum=0;
//        To get the total sum
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        for(int i=0;i<arr.length;i++){
//            Sample Array {4,-2,2}, sum=4, left_sum=0
            if(left_sum==sum-arr[i]){
                System.out.println(" equilirium point " + i);
                break;
            }

            left_sum+=arr[i];
            sum-=arr[i];
        }
    }

    private static void prefixSum(){
        int arr[]={2,8,3,9,6,5,4};
        int prefix[]= new int[arr.length];
        prefix[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        System.out.println(" Sum from 1 to 3 elemtents " + (prefix[3]-prefix[1]));
    }
}
