package BinarySearch;

public class SingleEle {

    public static int single(int[] arr) {


        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {


            int mid = low + (high - low) / 2;

            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
            if ((mid - low) % 2 != 0) {

                high=mid-1;
            }else{


            }
        }
        return 0;
    }
}
