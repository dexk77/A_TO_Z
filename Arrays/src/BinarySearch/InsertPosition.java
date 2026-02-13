package BinarySearch;

public class InsertPosition {


    public static int insertinposition(int[] arr,int target){

        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==target){

                return mid;

            } else if(arr[mid]>target){
                high=mid-1;


            }else{

                low=mid+1;
            }


        }

        return low;



    }


    public static int insertpositionRev(int[] arr,int target){

        int i=0;
        int j=arr.length-1;

        while(i<=j){

            int mid=(i+j)/2;

            if(arr[mid]==target) return mid;

            if(arr[mid]<target){

                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return i;
    }

    public static void main(String[] args) {

        int[] arr={1,2,4,7};


        System.out.println(insertinposition(arr,100));
        System.out.println(insertpositionRev(arr,2));

    }

}
