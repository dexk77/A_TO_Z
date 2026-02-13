package BinarySearch;

public class LastOccurence {

    public static int getlastOccur(int[] arr,int target){


        int low=0;
        int high=arr.length-1;
        int lastoccured=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                lastoccured=Math.max(lastoccured,mid);
low=mid+1;
                continue;

            }
            if(arr[mid]>target){

                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return lastoccured;
    }


    public static void getlastOccurCount(int[] arr,int target){


        int low=0;
        int high=arr.length-1;
        int lastoccured=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                lastoccured=Math.max(lastoccured,mid);
                low=mid+1;
                continue;

            }
            if(arr[mid]>target){

                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        int count=0;
        while(arr[lastoccured]==target){

            count++;
            if(lastoccured==0){
                break;
            }
            lastoccured--;

        }

        System.out.println(count);
    }

    public static void main(String[] args) {

        int[] arr={3, 4, 13, 13, 20, 40};

        System.out.println(getlastOccur(arr,13));

        int[] arr2= {2, 2 , 3 , 3 , 3 , 3 , 4};
        getlastOccurCount(arr2,4);
    }
}
