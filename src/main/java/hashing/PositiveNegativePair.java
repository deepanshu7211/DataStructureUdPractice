package hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PositiveNegativePair {
    public static void main(String[] args) {
        findPositiveNegativePair();
    }

    private static void findPositiveNegativePair() {
        int arr[] = {1,3,6,-2,-1,-3,2,7};
        ArrayList< Integer > results = new ArrayList<>();
        Set< Integer > set = new HashSet<>();
        for (int a : arr) {
            if (set.contains(-a)) {
                int x = Math.abs(a);
                results.add(-x);
                results.add(x);
            }
            set.add(a);
        }
        System.out.println(" results " + results);
    }
}
