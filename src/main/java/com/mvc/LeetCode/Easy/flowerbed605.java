package com.mvc.LeetCode.Easy;

public class flowerbed605 {

    public static boolean solution(int []flowerbed,int n){
        //we gonna check if we can have 3 consecutive zeros so that we
        //we can then add one flower if we only can have 3 zeros
        int zeros=0;
        int counter=0;
        if(flowerbed.length==1&&n==1&&flowerbed[0]==0)
            return true;
        while(counter<flowerbed.length){
            //note we have to check the end and the start of the arr
            //if we can have two zeros at the start or end we can put a flower
            //start of the array
            if(flowerbed[counter]==0) {
                zeros++;
                System.out.println(n);
                System.out.println("z:"+zeros);
            }
            else if(flowerbed[counter]==1) {
                zeros = 0;

            }
            if(counter==1&&zeros==2){
                n--;
                zeros=1;

            }
            //now if we are at the end
            if(counter==flowerbed.length-1&&zeros==2) {
                n--;
                System.out.println("tick");
            }


            //you have to start counting again when ever you have one
            if(zeros==3){
                n--;
                zeros=1;
            }
            if(n==0)
                return true;
            counter++;
        }
        return false;
    }
    public static void main (String []args){
        int []arr={0,0,1,0,1};
        int n=1;
        //{1,0,0,0,0,0,0,0,1}

        System.out.println(solution(arr,n));
    }
}

/*conclusion :
*/
