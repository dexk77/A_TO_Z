public class ArrSorted {

    public static boolean Sorted(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            if(arr.length<2){

                System.out.println("sorted");
            }
            if(arr[i]>arr[i+1]){
                System.out.println(arr[i]+" : "+arr[i+1]);
               return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr={1,2,5,4,5};
        int[] arr2={1,2,3,4,5};

        System.out.println(Sorted(arr));
    }
}
