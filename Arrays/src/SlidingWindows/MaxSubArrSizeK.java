package SlidingWindows;

public class MaxSubArrSizeK {


    public static int maxSum(int[] arr,int k){

        int i=0;
        int j=0;

        int result=0;
        int sum=0;
        while(j<arr.length){



            sum+=arr[j];
            if(j-i+1==k){

                result=Math.max(result,sum);

                sum-=arr[i];
                i++;
                j++;


            }else if(j-i+1<k){

                j++;
            }

        }

return result;
    }

    public static int practice(int[] arr, int k){

        int i=0;
        int j=0;
        int result=0;
        int runningsum=0;
        while(j<arr.length){

            runningsum+=arr[j];
            if(j-i+1==k){

                result=Math.max(result,runningsum);
                runningsum-=arr[i];
                i++;
                j++;



            }else{

                j++;
            }
        }
        return  result;
    }

    public static void main(String[] args) {

        int[] arr={3,2,5,-2,4,1};
        int[] practice={2, 1, 5, 1, 3, 2};
        System.out.println(maxSum(practice,3));

        System.out.println(practice(practice,3));

    }


}
