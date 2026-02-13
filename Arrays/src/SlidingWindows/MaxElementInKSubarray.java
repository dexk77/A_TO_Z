package SlidingWindows;

import java.sql.PreparedStatement;

public class MaxElementInKSubarray {


    public static void maxEle(int[] arr,int k){

        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        while(j<arr.length){

            max=Math.max(max,arr[j]);
            if(j-i+1==k){

                System.out.println(max);
                i++;

            }




            j++;
        }
    }

    public static void main(String[] args) {


        int[] arr={1,3,-1,-3,5,3,6,7};
        maxEle(arr,3);
    }
}
