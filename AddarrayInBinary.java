import java.util.Arrays;

public class AddarrayInBinary {
    public static void main(String args[]) {
        int[] arr = {3, 5, 6};
        int res = 0;
        String binaryvalue;
        for (int num : arr) {
            res += num;
        }
        System.out.println("add of number in arrays = " + res);
        binaryvalue = Integer.toBinaryString(res);
        System.out.println("Binary of "+res+" is = "+binaryvalue);
        int[] are = new int[binaryvalue.length()+1];
      for(int i=0;i<=binaryvalue.length()-1;i++){
          are[0]=0;
          are[i+1]=binaryvalue.charAt(i)- '0';
      }
        System.out.println(Arrays.toString(are));
    }
}
