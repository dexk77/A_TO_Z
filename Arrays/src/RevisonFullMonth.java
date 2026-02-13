import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RevisonFullMonth {



    public static List<Integer> union(int[] arr1,int[] arr2){

        int i=0;
        int j=0;

        List<Integer> result=new ArrayList<>();

        while(i<arr1.length && j<arr2.length){


            if(arr1[i]<arr2[j]){

                if(result.isEmpty() || result.get(result.size()-1)!=arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
            }
            else if(arr2[j]<arr1[i]){
                if(result.isEmpty() || result.getLast()!=arr2[j]) {
                    result.add(arr2[j]);
                }
                j++;
            }else{
                if(result.isEmpty() || result.getLast()!=arr2[j]) {
                    result.add(arr2[j]);
                }
                i++;
                j++;
            }

        }

        while(i<arr1.length){

            result.add(arr1[i]);
            i++;
        }
        while(j<arr2.length){

            result.add(arr2[j]);
            j++;
        }

        return result;

    }


    public static int getOneNumber(int[] arr){

        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){

            if(map.containsKey(i)){

                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }

        for(Map.Entry<Integer,Integer> mp: map.entrySet()){

            if(mp.getValue()==1){
                return mp.getKey();
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, };
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

        int[] arr3= {4,1,2,1,2};


        System.out.println(union(arr1,arr2));


        System.out.println(getOneNumber(arr3));
    }
}
