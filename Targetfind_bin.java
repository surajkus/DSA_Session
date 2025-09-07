import java.util.Scanner;

public class Targetfind_bin {
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter number(key) to find");
    int key =sc.nextInt();
    int arr[] ={5,6,10,15,19,21,28,30,36,40,55};
    int i =0;
    int steps =0,flag =0,res=0;
    int j =arr.length-1;
        while(i<=j && flag == 0){
        steps++;
        int mid =(i+j)/2;
        if(arr[mid]==key){
            flag =1;
            res =mid;
        }
        else if(arr[mid]>key){
            j=mid-1;
        }
        else{
            i = mid+1;
        }
    }
       if(flag==1){
        System.out.println("Element is found at indexing = "+res);
        System.out.println("Number of target taken: = " +steps);
    }
       else{
        System.out.println("Element is not found");
        System.out.println("Number of target taken: " +steps);
    }
}
}
