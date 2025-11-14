public class missElementinArrays {
    public static void main(String args[]){
//        find  the missing element in arrays
        
        int[] arr ={1,2,5,6,7,8,10};
        int  a = 1;
         int res;
         for(int i=0;i<arr.length;i++){
             if(arr[i]!=a){
                 res=a;
        System.out.println(res);
                 return ;
             }
                  a++;
         }
    }
}
