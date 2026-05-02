abstract class car {
 abstract void drive();
 abstract void fly();
 void music(){
    System.out.println("playing music");
 }
}
abstract class Alto extends car{
   void drive(){
     System.out.println("driving");
    }
}
class Alto2 extends Alto{
   void fly(){
    System.out.println("Fliying");
   }
}

public class Abstractmethods{
    public static void main(String[] args) {
       // car c = new car(); ___ can not create object of abstract class 
       Alto2 c1 = new Alto2();
       c1.drive();
       c1.fly(); ;
       c1.music();
    }
}