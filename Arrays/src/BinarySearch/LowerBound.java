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


    public static void main(String[] args) {

        int[] arr={1,4,6,8,9};

        System.out.println(lowerBoundIndex(arr,4,0,arr.length-1));
    }
}
