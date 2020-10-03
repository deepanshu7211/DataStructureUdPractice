package hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MoreThanNByKOccurence {
    public static void main(String[] args) {
        findMoreThanNByKOccurence();
    }

    private static void findMoreThanNByKOccurence() {
        int arr[]={30,10,20,30,30,30,30,20};
        int k=4;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry entry : map.entrySet()){
            if((int)entry.getValue()>(arr.length/k)){
                System.out.println(" value is " + entry.getKey());
            }
        }
    }
}
