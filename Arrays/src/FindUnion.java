import java.util.*;

public class FindUnion {


    public static List Setunion(int[] arr1,int[] arr2){
        Set<Integer> set=new TreeSet<>();

        for(int i:arr1){
            set.add(i);
        }
        for(int i:arr2){

            set.add(i);
        }

        List<Integer> result=new ArrayList<>();
        for(Integer i :set){

            result.add(i);
        }

        return result;

    }
    public static List hasmapunion(int[] arr1,int[] arr2){

        Map<Integer,Integer> map=new HashMap<>();

        for(int i:arr1){

            if(map.containsKey(i)){

                map.put(i, map.get(i)+1);

            }
            else
            {
                map.put(i,1);

            }


        }

        for(int i:arr2){

            if(map.containsKey(i)){

                map.put(i, map.get(i)+1);

            }
            else
            {
                map.put(i,1);

            }


        }

        List<Integer> result=new ArrayList<>();

        for(Map.Entry<Integer,Integer> mp:map.entrySet()){

           result.add(mp.getKey());
        }
        return result;
    }

    public static List<Integer> twopointunion(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i])
                    result.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr2[j])
                    result.add(arr2[j]);
                j++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i])
                    result.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            if (result.get(result.size() - 1) != arr1[i])
                result.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            if (result.get(result.size() - 1) != arr2[j])
                result.add(arr2[j]);
            j++;
        }

        return result;
    }



    public static void main(String[] args) {
       int arr1[] = {1,2,3,4,56};
        int arr2[] = {2,3,4,4,5,6};

        System.out.println(hasmapunion(arr1,arr2));
        System.out.println(Setunion(arr1,arr2));

        System.out.println(twopointunion(arr1,arr2));
//List<Integer> result=twopointunion(arr1,arr2);
//    Collections.sort(result);
//        System.out.println(result);



    }
}
