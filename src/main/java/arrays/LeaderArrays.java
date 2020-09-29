package arrays;

public class LeaderArrays {
//Leader in array means all the element on it right should be smaller
    public static void main(String[] args) {
        int arr[]={7,10,4,3,6,5,2};
        int leader= arr[arr.length-1];
//        RIght most element will always be the leader
        System.out.println(leader);

//        Comparing from the right hand side
        for(int i=arr.length-2;i>=0;i--){
            if(leader < arr[i]){
                leader=arr[i];
                System.out.println( leader);
            }
        }
    }
}
