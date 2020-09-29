package arrays;

public class StockBuyAndSell {
    public static void main(String[] args) {
        maxProfit();
        buyAndSell();
    }

//    We know the prices of stocks for the coming days. We need to maximize the profit.
//    We purchase the stock when price is low and sell when prices is high
    private static void maxProfit(){
//        int price[]={1,5,3,8,12};
        int price[]={71, 94, 70, 74, 55, 51, 33, 37, 65, 36, 50, 89, 17, 55, 65};
        int profit=0;

        for(int i=1;i<price.length;i++){
            if(price[i]>price[i-1]){
                profit+=price[i]-price[i-1];
            }
        }

        System.out.println(" Profit :: " + profit);

    }

    private static void buyAndSell(){
        int arr[]={100,180,260,310,40,535,695};
//        int arr[]={71, 94, 70, 74, 55, 51, 33, 37, 65, 36, 50, 89, 17, 55, 65};
//        int arr[]={11,42,49,96,23,20, 49, 26, 26, 18, 73, 2 ,53 ,59, 34, 99, 25, 2};
        int n=arr.length; int count=0;
        int buy=-1,sell=-1;
        int i=0;
        while(i<n-1){
            if(n==1){
                System.out.println(" not valida array");
                return;
            }

//            For Local Minima , we need to check arr[i+1]<=arr[i]
            while ((i<n-1) && (arr[i+1]<=arr[i])){
                i++;
            }
            buy=i++;

            if(i==n){
                System.out.println(" no pair found ");
                return;
            }

//            For Local maxima, we need to check arr[i]>=arr[i-1]
            while ((i<n)&&(arr[i]>=arr[i-1])){
                i++;
            }
            sell=i-1;
            if(buy!=-1 && sell!=-1){
//                System.out.println(" buy " + buy + " sell " + sell);
                System.out.print("(" + buy + " " + sell+")");
                System.out.print(" ");
            }
            count++;
        }

    }
}

