import java.util.Arrays;

public class FindUniqueNo {
public static void main(String argus[]){
//    Write a program to find unique 4 digits numbers using 1,2,3,4 and also count the number
//  iu  of unique numbers formed

int[] arr ={1,2,3,4};
int res =0;
int j=1;
 for(int i=0;i<=arr.length-1;i++){
     if(i==j) {
         i++;j++;
         res =arr[i];
         j++;
     }
 }
    System.out.println(res);
}
}

