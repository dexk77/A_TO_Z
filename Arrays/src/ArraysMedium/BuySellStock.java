package ArraysMedium;

public class BuySellStock {


    public static int maxProfit(int[] arr){

        if(arr.length<=1){
            return -1;
        }

        int buy=0;
        int sell=1;
        int maxprofit=0;
        while(buy<=arr.length-1 && sell<=arr.length-1){

            if(arr[buy]<arr[sell]){
                int profit=arr[sell]-arr[buy];
                maxprofit=Math.max(maxprofit,profit);
                sell++;

            }else if(arr[buy]>arr[sell]){

                buy++;
            }else{
                sell++;
            }


        }

return maxprofit;
    }

    public static void main(String[] args) {

        int[] arr={7,1,2,8,1,9};

        System.out.println(maxProfit(arr));

    }
}
