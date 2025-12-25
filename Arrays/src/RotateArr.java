public class RotateArr
{

    public static int[] rotateArr(int[] arr, int times){


        times=times% arr.length;
        for(int j=0;j<times;j++) {
            int temp=arr[0];
            for (int i = 1; i < arr.length; i++) {

                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
        }
return arr;
    }

    public static void reverseArr(int[] arr,int start,int end){

        while(start<end){

            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static int[] rotateArrayBy(int[] arr,int times){

        //rotate
        reverseArr(arr,0,arr.length-1);

        reverseArr(arr,0,times-1);

        reverseArr(arr,times,arr.length-1);

        return arr;
    }



    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};

     int[] result=rotateArrayBy(arr,2);

     for(int i:result){

         System.out.println(i);
     }

    }
}
