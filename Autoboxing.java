public class Autoboxing{
    public static void main (String args[]){
        int num1 = 7 ;
        System.out.println(num1);
        Integer num2 = ++num1 ; // Autoboxing
        System.out.println(num2);
        int num3 = ++num2 ;    // AutoUnboxing
          System.out.println(num3);
    }
}