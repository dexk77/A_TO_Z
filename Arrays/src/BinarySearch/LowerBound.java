package BinarySearch;




//next element greater or equal to the target element
public class LowerBound {


    public static int  lowerBoundIndex(int[] arr ,int target,int low,int high) {

        if (low > high) {
            System.out.println("first if ");
            return low;

        }

        int mid = (low + high) / 2;
        if (arr[mid] >= target) {

            return lowerBoundIndex(arr,target,low,mid-1);


        } else {
            return lowerBoundIndex(arr,target,mid+1,high);

        }

    }



    public static int lowerBoundRev(int[] arr,int target){

        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){

                high=mid-1;
            }else{
                low=mid+1;
            }
        }



return low;
    }


    public static void main(String[] args) {

        int[] arr={3,5,8,15,19};

        System.out.println(arr[lowerBoundIndex(arr,9,0,arr.length-1)]);

        System.out.println(arr[lowerBoundRev(arr,9)]);


    }
}
