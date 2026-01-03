package BinarySearch;

public class SearchRotatedArr{



    public static int searchRotated(int[] arr,int target){

        int low=0;
        int high=arr.length-1;

        while(low<=high){

           int mid=(low+high)/2;

           if(arr[mid]==target) return mid;
           if(arr[low]<=arr[mid]){

               if(arr[low]<=target && target<arr[mid]){
                   high=mid-1;

               }else{
                   low=mid+1;
               }

           }else{

               if(arr[mid]<target && target <= arr[high]){

                   low=mid+1;
               }else{
                   high=mid-1;
               }
           }

        }
        return -1;
    }

    public static void main(String[] args) {

int[] arr={6,7,8,9,1,2,3};

        System.out.println(searchRotated(arr,6));
    }
}
