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

    public static void main(String[] args) {

        int[] arr={1,2,4,8,9,90,101};


        System.out.println(insertinposition(arr,100));

    }

}
