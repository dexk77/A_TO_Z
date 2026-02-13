package ArraysMedium;

public class MaxSubKadane {

    public static int maxSubSum(int[] arr){

        int sum=0;

        for(int i=0;i<arr.length;i++){

int sumofSub=0;
            for(int j=i;j<arr.length;j++){

        sumofSub+=arr[j];
            sum=Math.max(sum,sumofSub);
            }

        }

return sum;
    }


    private static int sumofarr(int[] arr,int start,int end){
        int sum=0;
        for(int i=start;i<end;i++){

            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr={2, 3, 5, -2, 7, -4};

        System.out.println(maxSubSum(arr));

    }
}
