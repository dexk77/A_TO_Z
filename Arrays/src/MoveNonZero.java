public class MoveNonZero {




    public static int[] movezero(int[] arr) {

        int j ;

        for(j=0;j< arr.length-1;j++) {
            int i;
            if (arr[j] == 0) {

                for(i=j+1;i<arr.length;i++){

                    if (arr[i] != 0) {

                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        j++;
                    }
                }
            }

        }

return arr;
    }
    public static void main(String[] args) {


        int[] arr={1,0,2,3,0,4,0,1};

        int[] result=movezero(arr);

        for(int i:result){
            System.out.println(i);
        }
    }
}
