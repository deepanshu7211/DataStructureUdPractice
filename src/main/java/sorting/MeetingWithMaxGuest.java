package sorting;

import java.util.Arrays;

public class MeetingWithMaxGuest {
    public static void main(String[] args) {
        meetingWithMaxGuest();
    }

    /*
    * Time is given for arroval guest and departure guest.
    * Need to find how many guest we can meet , if we reach party at particular time.
    * */
    private static void meetingWithMaxGuest() {
        int arr[]={900,600,700};
        int dep[]={1000,800,730};

//        i=1 becoz arr[0]<dep[0] always
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0,res=1,curr=1;

        while(i<arr.length && j<dep.length){
            if(arr[i]<=dep[j]){
                curr++; i++;
            }
            else {
                curr--; j++;
            }
            res= Math.max(res,curr);
        }

        System.out.println(" Maximum guest can be meet is " + res);
    }
}
