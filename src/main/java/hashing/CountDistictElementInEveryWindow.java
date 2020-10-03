package hashing;

import java.util.HashMap;

public class CountDistictElementInEveryWindow {
    public static void main(String[] args) {
        countDistinctElementInEveryWindow();
    }

    private static void countDistinctElementInEveryWindow() {
        int arr[]={10,20,10,10,30,40};
        int k=4; // total windows will be n-k+1

        HashMap<Integer,Integer> map = new HashMap<>();
//        Filling the map for 1st window
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map.size());

//        Now starting for other windows
        for(int i=k;i<arr.length;i++){
            if(map.containsKey(arr[i-k])){
                map.put(arr[i-k],map.get(arr[i-k])-1);
                if(0 == (int)map.get(arr[i - k]))
                    map.remove(arr[i-k]);
            }
            if(!map.containsKey(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
//            Printing the size for every window
            System.out.println(map.size());
        }
    }
}
