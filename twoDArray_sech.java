import java.util.Arrays;
import java.util.Scanner;

public class twoDArray_sech {
    public static void main(String args[]){
//        in 2d arrays to find the key value you want show

        Scanner sc =new Scanner(System.in);
        System.out.println("enter your key to search");
        int key =sc.nextInt();
        boolean Check =false;

        int arr[][] ={{1,3,4,19,20,21,11,19},
                      {9,13,34,19,21,22,61,17},
                       };
        for(int i =0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               if(arr[i][j]==key){
                   System.out.println("index number row = " +i+" and Column  = "+j+" number");
                   Check = true;
               }
           }
       }
       if(!Check) {
           System.out.println("Element are not here");
       }
       }
}
