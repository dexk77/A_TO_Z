package BinarySearch;

public class HowManyTimesArrayRotated {

    public static int rotatedteimes(int[] arr){

        int high=arr.length-1;
        int low=0;
        int lowest=Integer.MAX_VALUE;
        int lowestIndex=Integer.MAX_VALUE;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[low]<=arr[mid]){

                int lowestCompare=arr[low];

                  if(lowestCompare<lowest){

                      lowest=lowestCompare;
                      lowestIndex=low;
                  }

                low=mid+1;
            }else{
                int lowestCompare=arr[mid];

                if(lowestCompare<lowest){

                    lowest=lowestCompare;
                    lowestIndex=low;
                }

                high=mid-1;

            }
        }
     ;
        return arr.length-lowestIndex;
    }

    public static void main(String[] args) {

        int[] arr={3,4,5,1,2};

        System.out.println(rotatedteimes(arr));
    }
}
