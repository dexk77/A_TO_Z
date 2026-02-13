package SlidingWindows;

import java.util.HashMap;

public class MaxSumDistEleArray {


    public static long getmax(int[] arr,int k){


        int i=0;
        int j=0;
        int result=Integer.MIN_VALUE;

        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        while(j<arr.length){

            sum+=arr[j];
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);

            if(j-i+1==k){

                if(map.size()==k){

                     result=Math.max(result,sum);
                }

                sum-=arr[i];

                map.put(arr[i],map.get(arr[i])-1);

                        if(map.get(arr[i])==0){

                            map.remove(arr[i]);
                        }
               i++;


            }

            j++;




        }
        return (long)result;
    }
}
