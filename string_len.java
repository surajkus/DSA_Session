import java.util.Scanner;

public class string_len {
    public static void main(String argus[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name");
        String str =sc.nextLine();
        String[] str1 =str.split(" ");
        String name=" ";
        for(int i=0;i<str1.length;i++){
             name +=str1[i];
        }
        System.out.println(name.length()-1) ;
    }
}
