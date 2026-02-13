package ArraysMedium;

public class SortZeroOneTwo {

    public static void sortarr(int[] arr){

        int i=0;
        int j=arr.length-1;
        int k=0;

        while(k<=j){

            if(arr[k]==0){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;

                i++;


            }
            if(arr[k]==2){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;

                j--;

            }

            if(arr[k]==1){
                k++;
            }

        }

    }


    public static void main(String[] args) {
        int[] arr={2,0,0,1,2};


        sortarr(arr);
        for(int u:arr){
            System.out.println(u);
        }

    }
}
