public class ExceptionHandling{
    public static void main(String[] args) {
        int a = 2 ;
        int b = 12 ;
        String name = "sumit" ;
        int[] arr = new int[5]; 
      try { 
        b = b / a ;
        System.out.println(arr[15]);
         System.out.println(name.length());
       }
       catch(ArithmeticException e){
           System.out.println("can not devide by 0 Exception");
       }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("be in Array limit");
       }
       catch(Exception e){
           System.out.println("unknown Exception "+e);
       }
        System.out.println(b);
        System.out.println("bye");
    


    }
}