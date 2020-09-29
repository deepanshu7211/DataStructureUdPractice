package arrays;

public class LargestElementsInArrays {

    private static int arr[]={1,3,4,5,14,6,8,9,10,12};

    public static void main(String[] args) {
        largestElement();
        secondLargestElement();
        removeDuplicates();
        moveZerosToEnd();

    }

    private static void moveZerosToEnd(){
        int arr1[]={8,5,0,10,0,20};
        int res=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=0){
                int temp=arr1[i];
                arr1[i]=arr1[res];
                arr1[res]=temp;
                res++;
            }
        }

        System.out.println(" Moved zeros to end of array ");
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] +" ");
        }
    }

    private static void removeDuplicates(){
        int arr[]={10,20,20,30,30,30,30,40};
        int duplicateIndex=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[duplicateIndex-1]){
                arr[duplicateIndex]=arr[i];
                duplicateIndex++;
            }
        }

        System.out.println(" duplicates move to one side ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void secondLargestElement(){
        int max1=0,max2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2){
                max2=arr[i];
            }
        }

        System.out.println(" max1 " + max1 + "  max2  " + max2);
    }

    private static void largestElement(){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println(" max element is " + max);
    }
}
