package BinarySearch;

public class BinarySearch {

        public static boolean BiSearch(int[] arr,int target){


        int length=arr.length;
        int low=0;
        int high=length-1;


        while(low<=high){
            int mid=(low+high)/2;
            System.out.println("1");
            if(arr[mid]<target){


                low=mid+1;

            }else if(arr[mid]>target){

                high=mid-1;
            }else{
return true;
            }

            }
        return false;
        }

        public static boolean BiSearchRecursive(int[] arr,int target,int high,int low){

if(low>high){
    return false;

}

            int mid=(low+high)/2;

            if(arr[mid]<target){


               return BiSearchRecursive(arr,target,high,mid+1);

            }else if(arr[mid]>target){

                return BiSearchRecursive(arr,target,mid-1,low);
            }else{
return true;
            }

        }

    public static void main(String[] args) {
            int[] arr={1,2,3,4,5};

        System.out.println(BiSearchRecursive(arr,6, arr.length-1,0));


    }
}
