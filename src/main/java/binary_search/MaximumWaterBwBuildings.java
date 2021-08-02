package binary_search;

/*
* Given an integer array representing the heights of N buildings,
*  the task is to delete N-2 buildings such that the water that can be trapped between the remaining two building
*  is maximum.
Note: The total water trapped between two buildings is gap between them (number of buildings removed)
*  multiplied by height of the smaller building.
* */
public class MaximumWaterBwBuildings {
    public static void main(String[] args) {
        int height[]=new int[] {2,1,3,4,6,5};
        int maxWater = maxWater(height, height.length);
        System.out.println(" maxwater " + maxWater);
    }

    static int maxWater(int height[], int n)
    {
        //Your code here

        int l = 0, r = n-1, max = 0;
        while (l < r) {
            int total = Math.min(height[l], height[r]) * (r-l-1);
            max = Math.max(max, total);
            if (height[l] <= height[r]) l++;
            else r--;
        }
        return max;
    }

}
