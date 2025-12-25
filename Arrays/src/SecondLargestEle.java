

public class SecondLargestEle {

    public static int SecondLargest(int[] arr) {

        int length = arr.length;

        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                secondmax = max;
                max = arr[i];

            } else if (arr[i] > secondmax && arr[i] != max) {
                secondmax = arr[i];
            } else {
                return secondmax;
            }

        }
        return -1;

    }

    public static void main(String[] args) {


    }
}
