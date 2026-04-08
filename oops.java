 class Calculator{
    
     int a ;
     int b ;
     int sum(){
        return a+b ;
     }
}
public class oops{
    public static void main (String args[]){
      Calculator c =  new Calculator() ;
       c.a = 5 ;
       c.b = 6 ;
       System.out.println(c.sum());

    }
}