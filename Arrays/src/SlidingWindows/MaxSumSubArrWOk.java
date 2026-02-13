package SlidingWindows;

public class MaxSumSubArrWOk {

    public static int maxx(int[] nums,int k){

        int i=0;
        int j=0;

        int result=0;
        int sum=0;

        while(j<nums.length){

            sum+=nums[j];

            if(sum<k){

                j++;
            }
            else if(sum==k){

                result=Math.max(result,sum);

            }else{

                while(sum>k){

                    sum-=nums[i];
                    i++;
                }
            }


        }


        return result;
    }


    public static void main(String[] args) {

        int[] arr={4,1,1,1,2,3,5};


        System.out.println(maxx(arr,5));
    }
}
