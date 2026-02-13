package ArraysMedium;

import java.util.ArrayList;
import java.util.List;

public class FindLeaders {

    public static List<Integer> findleaders(int[] arr){

        List<Integer> result=new ArrayList<>();
        boolean leader=true;
        int lastleader=0;
        if(arr.length>0){

            lastleader=arr[arr.length-1];

        }else{

            return result ;
        }

        for(int i=arr.length-2;i>0;i--){

            if(arr[i]<=arr[i+1]){
                leader=false;
            }else{

                if(arr[i]>arr[i+1] && arr[i]>lastleader){
                    leader=true;
                    lastleader=arr[i];
                }

            }

            if(leader){
                result.add(arr[i]);
            }

        }
        result.add(arr[arr.length-1]);
        return  result;
    }


    public static void main(String[] args) {

        int[] arr={10,22,12,3,0,6};

        System.out.println(findleaders(arr));
    }
}
