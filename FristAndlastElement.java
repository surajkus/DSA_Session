import java.util.Scanner;

public class FristAndlastElement {
    public static void main(String args[]){
//      (1)  Given a sorted array (possibly with duplicates), write a program to find the
//        first and last occurrence of a target element using binary search.

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter key value = ");
        int arr[] ={1,3,5,19,50,50,50,22,30,33,49};
         int key=sc.nextInt();
         int flag=0,res=0,lastElement=0,fristElement=0;
         int i=0,j=arr.length,mid=0;
         while(i<=j && flag==0){
             mid =(i+j)/2;

             if(arr[mid]==key){
                 flag=1;
                 fristElement =mid;
                res= arr[mid];

             }
             else if(arr[mid]>key){
                  j=mid-1;
             }
             else{
                 i=mid+1;
             }
         }
         if (flag==1){
             System.out.println("Element is = "+res);
             System.out.println("Frist target is = "+fristElement);
             while(arr[mid]==res){
                  lastElement =mid+1;
                  mid++;
             }
             System.out.println("last target is = "+lastElement);


         }
         else{
             System.out.println("Element is not found");
         }

    }

    }

