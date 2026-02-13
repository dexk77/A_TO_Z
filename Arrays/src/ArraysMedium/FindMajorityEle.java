package ArraysMedium;

public class FindMajorityEle {


    /// element that is greater than n/2
    public static int majority(int[] arr){

        int count=0;
        int element=0;
        for(int i=1;i<arr.length;i++){

            if(count==0){
                element=arr[i];
                count=1;
            }
            else if (arr[i]==element){
                count++;}
            else{count--;}

        }
        int cnt1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                cnt1++;
            }
        }

        // Return the element if it's a majority
        if (cnt1 > (arr.length / 2)) {
            return element;
        }

        // No majority found
        return -1;
    }




    public static void main(String[] args) {

        int[] arr={1, 1, 1, 2, 1, 2};

        System.out.println(majority(arr));
    }
}
