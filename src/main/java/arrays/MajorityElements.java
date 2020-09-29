package arrays;

public class MajorityElements {
    public static void main(String[] args) {
        mooreVotingAlgo();
    }
    private static void mooreVotingAlgo(){
        int arr[]={8,8,6,6,6,6,4,6};
        int res=0,count=1;

        for(int i=1;i<arr.length;i++){
            if(arr[res]==arr[i]){
                count++;
            }
            else{
                count--;
            }

            if(count==0){
                res=i;
                count=1;
            }
        }

        System.out.println(" majority element " + res + " " + arr[res]);
    }
}
