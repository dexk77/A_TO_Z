package ArraysMedium;

public class RearrangeNums {

    public static int[] rearr(int[] arr){

        int[] result=new int[arr.length];
int resultpoint=0;
        int i=0;
        int j=0;
        boolean iskipped=false;

        while(resultpoint< arr.length){

            if(iskipped==false){


                if(arr[i]>=0) {
                    result[resultpoint] = arr[i];
                    i++;
                    resultpoint++;
                    iskipped = true;
                }else{
                    i++;
                }
            }else{

                if(arr[j]<0){
                    result[resultpoint]=arr[j];
                    j++;
                    resultpoint++;
                    iskipped=false;

                }else{

                    j++;
                }
            }
        }

return  result;

    }


    public static void main(String[] args) {

        int[] arr={-1,-2,4,4,4,5,-6,-4};

        int[] result=rearr(arr);

        for(int i:result){

            System.out.println(i);
        }
    }
}


 //check for dutch national