package SlidingWindows;

import java.util.HashMap;
import java.util.Map;

public class MaxDistinctEleInSubArrK {



    public static int distinctMax(int[] arr,int k){

        int i=0;
        int j=0;
        int result=Integer.MIN_VALUE;
        Map<Integer,Integer> map=new HashMap<>();
        while(j<arr.length){

            if(map.containsKey(arr[j])){

                map.put(arr[j],map.get(arr[j])+1);
            }else{

                map.put(arr[j],1);
            }

            if(j-i+1==k){
                int length=map.size();
                result=Math.max(result,length);

                if(map.containsKey(arr[i])){

                    map.put(arr[i],map.get(arr[i])-1);

                }else{
                    map.remove(arr[i]);
                }
                i++;
                j++;

            }else{
                j++;
            }




        }



        return result;

    }
    public static void main(String[] args) {

        int[] arr={1, 2, 1, 3, 4, 2, 3};

        System.out.println(distinctMax(arr,4));

    }
}
