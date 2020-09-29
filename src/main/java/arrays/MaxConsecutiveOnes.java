package arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1,1,0,1,1};
        int res=0,curr=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                curr=0;
            }
            else {
                curr++;
                res=Math.max(res,curr);
            }
        }

        System.out.println(" max consecutive ones " + res);
    }
}
