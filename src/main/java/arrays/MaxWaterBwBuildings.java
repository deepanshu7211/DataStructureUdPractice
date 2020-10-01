package arrays;

public class MaxWaterBwBuildings {

    public static void main(String[] args) {
        maximumWaterFilled();
    }

    /*
    * Given an integer array which represents the heights of N buildings,
    * the task is to delete N-2 buildings such that the water that can be trapped between the remaining two building is maximum.
    * Please note that the total water trapped between two buildings is gap between them (number of buildings removed) multiplied by height of the smaller building.
    * */

//    Maximum water that can be stored between two buildings
    private static void maximumWaterFilled(){
        int height[] = {2,1,3,4,6,5};
//        int height[] = {2,5,3,4,6,5};
        int n=height.length;

        int l = 0, r = n-1, max = 0;
        while (l < r) {
            int total = Math.min(height[l], height[r]) * (r-l-1);
            max = Math.max(max, total);
            if (height[l] <= height[r]) l++;
            else r--;
        }
        System.out.println(" max " + max);
    }
}
