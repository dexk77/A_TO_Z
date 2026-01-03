package BinarySearch;

public class SearchRotatedArray {

    public static  int bruteForceSol(int[] arr,int target){

        for(int i=0;i< arr.length;i++){

            if(arr[i]==target){

                return i;
            }
        }
        return -1;
    }
    public static int Optimalapproach(int[] arr,int target){
       int low=0;
       int high=arr.length-1;
       int ans=-1;
        while(low<high){
            int mid=(high+low)/2;
            if(arr[mid]==target) return mid;
            if(arr[high]<arr[mid]) {
                low = mid + 1;
            }

        }
        low=0;high=arr.length-1;
        while(low<high){
            int mid=(high+low)/2;
            if(arr[mid]==target) return mid;
            if(arr[high]>arr[mid]) {
                high=mid-1;
            }

        }
        return ans;
    }

    public static int deepSol(int[] arr,int target){

        int low=0;
        int high=arr.length-1;

        while(low<=high){

            int mid=(high+low)/2;

            if(target==arr[mid])return mid;
            if(target<low && mid<target){
                low=mid+1;
            } else if (target>low && mid<target) {
                high=mid-1;
            }else if(target>low && mid>target){
                high=mid-1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {

int[] arr={5,6,7,8,1,2,3};

//        System.out.println(Optimalapproach(arr,0));
        System.out.println(deepSol(arr,2));
    }
}
