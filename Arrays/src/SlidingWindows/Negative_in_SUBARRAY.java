package SlidingWindows;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Negative_in_SUBARRAY {

    public static void firstNegative(int[] arr,int k){

        Queue<Integer> q=new LinkedList<>();
        int i=0;
        int j=0;

        while(j<arr.length){
            if(arr[j]<0){

                q.add(arr[j]);

            }

            if(j-i+1==k){

                if(!q.isEmpty()){

                    if(arr[i]==q.peek()){

                        System.out.println(q.peek());
                        q.poll();

                    }else{

                        System.out.println(q.peek());
                    }



                }
                else{
                    System.out.println(0);
                }

                i++;





            }
            j++;
        }
    }















    public static void main(String[] args) {
        int arr[]={-3,-2,4,5,3,-2,1};

        int[] arr3={5, -3, 2, 3, -4};

        int[] arr2={12,-1,2,3,-4,-5};

        firstNegative(arr3,2);

        System.out.println("___________________________");
        int i=0;
        int k=3;
        Queue<Integer> ttt = new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int j=0;
        for(j=0;j<k;j++){
            if(arr[j]<0) ttt.add(arr[j]);
        }

        if(!ttt.isEmpty()){
            ans.add(ttt.peek());
        }

        else {
            ans.add(0);
        }

        if(!ttt.isEmpty() && arr[i]==ttt.peek()) ttt.poll();

        System.out.println(ttt);

        i++;

        while(j<arr.length){
            if(arr[j]<0) ttt.add(arr[j]);
            if(arr[i-1]==ttt.peek()) ttt.poll();
            System.out.println(ttt);
            if(!ttt.isEmpty()) ans.add(ttt.peek());
            else{
                ans.add(0);
            }
            i++;
            j++;
        }

        System.out.println(ans);

    }

}
