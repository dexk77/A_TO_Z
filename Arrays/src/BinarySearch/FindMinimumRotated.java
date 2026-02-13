package BinarySearch;

public class FindMinimumRotated {




    public static int findmin(int[] arr) {

        int low = 0;
        int high = arr.length - 1;
        int lowest = Integer.MAX_VALUE;
        while (low <= high) {
            System.out.println("times");
            int mid = (low + high) / 2;
            if (mid < lowest) {
                System.out.println(1);
                lowest = Math.min(lowest, arr[mid]);
            }


            if (arr[low] <= arr[mid]) {
                lowest = Math.min(lowest, arr[low]);
                low = mid + 1;
                System.out.println(2);
            } else {


                lowest = Math.min(lowest, arr[mid]);
                high = mid - 1;
                System.out.println(3);

            }

        }
        return lowest;
    }


    public static int lowestinrotatedArray(int[] arr){

        int low=0;
        int high=arr.length-1;
int lowest=Integer.MAX_VALUE;
        while (low <= high){

            int mid=low+(high-low)/2;

            if(arr[low]<=arr[mid]){

                lowest=Math.min(lowest,arr[low]);
                low=mid+1;
            }else{

                lowest=Math.min(lowest,arr[mid]);
                high=mid-1;


            }
        }
        return lowest;
    }
        public static void main(String[] args) {
int[] arr={4,5,1,2,3};
            int[] arr2 = {1,2,3,4,5}; // min = 1
            int[] arr3 = {-1,0,2,3,-4}; // min = -4


            System.out.println(findmin(arr));
            System.out.println(lowestinrotatedArray(arr2));
            System.out.println(lowestinrotatedArray(arr3));

    }
}
