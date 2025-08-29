import java.util.Scanner;

public class Linear_search {
    public static void main(String argus[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number you want to search");
         int key =sc.nextInt();
         boolean check=false;
        int[] arr ={2,3,5,1,50,22,91,80,12,0,10};
        for(int i=0;i<arr.length;i++){
             if(arr[i]==key){
                 System.out.println("indexing number is ="+i);
                 check=true;
             }
        }
        if(!check) {
            System.out.println("not Founded") ;
        }
    }
}
