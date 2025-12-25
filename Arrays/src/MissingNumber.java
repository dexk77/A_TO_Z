public class MissingNumber
{



    public static int missingnum1(int[] arr){

        for(int i=1;i<=arr.length;i++){

            if(arr[i-1]!=i){

                return i;
            }
        }
        return -1;
    }

    public static int missingnumber2(int[] arr){

        int last=arr[arr.length-1];

        int total=last*(last+1)/2;

        for(int i=0;i< arr.length;i++){

            total-=arr[i];
        }
return total;
        }
    public static void main(String[] args) {

        int[] arr={1,2,4,5};
        System.out.println(missingnum1(arr));
        System.out.println(missingnumber2(arr));




    }
}
