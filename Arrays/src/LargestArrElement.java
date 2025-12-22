
// Find the Largest element in an array
public class LargestArrElement {



    // brute force
    //optimal force approach
    public static int largestEle(int[] arr){


        int length=arr.length;
        int max=Integer.MIN_VALUE;

       for(int i=0;i<arr.length;i++){


           if(arr[i]>max){

               max=arr[i];
           }
       }
       return max;
    }

    public static void main(String[] args) {


    }
}
