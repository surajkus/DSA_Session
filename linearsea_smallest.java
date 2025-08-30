import java.util.Arrays;
import java.util.Scanner;

public class linearsea_smallest {
     // use linear search to find the smallest element in the arrays.
    public static void main(String args[]){
        int[] num ={0,28,12,10,4,6,20,18,91,1,4,60};
         int res1 =num[0];
        for(int i =0;i<num.length;i++){
            if(num[i]<res1){
                res1 =num[i];
            }
        }
        System.out.println(res1);

    }
}
