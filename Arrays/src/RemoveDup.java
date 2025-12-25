import java.util.HashSet;
import java.util.Set;

public class RemoveDup {


    //brute force
    public static int remDup2(int[] arr){

        Set<Integer> result=new HashSet<>();

        for(int i:arr){

            result.add(i);
        }
        return result.size();
    }


    //optimal Approach
    public static int[] remDup(int[] arr){
if(arr.length<=2){

    return arr;
}
        int i=0;
        int j=1;

        while(j<arr.length){
            if(arr[i]!=arr[j]){

                i++;
                arr[i]=arr[j];
            }
            j++;

        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr={1,1,2,2,2,3,3};

        int[] result=remDup(arr);

        for(int i:result){
            System.out.println(i);
        }


        System.out.println("the unique arr elements are ");
        System.out.println(remDup2(arr));
    }

}
