package arrays;

public class MergingArrays {

    public static void main(String[] args) {
        int arr[] ={2,8,16,20,25};
        int arr2[] ={4,10,12,22,23};
        int res[] = new int[arr.length+arr2.length];

        int i=0,j=0,k=0;
        while (i<arr.length && j<arr2.length){
            if(arr[i]<arr2[j]){
                res[k]=arr[i];
                i++;
            }
            else {
                res[k]=arr2[j];
                j++;
            }
            k++;
        }

        while (i<arr.length){
            res[k++] = arr[i++];
        }
        while (j<arr2.length){
            res[k++] = arr2[j++];
        }

        System.out.println("Merged Array ");
        for(int l=0;l<res.length;l++){
            System.out.println(" arr " + res[l]);
        }
    }
}
