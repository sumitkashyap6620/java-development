@java.lang.FunctionalInterface
interface A {
 void show();
}
public class FunctionalInterface{
public static void main(String[] args) {
    // A obj = new A(){
    //  public void show(){
    //     System.out.println("heyy in show");
    //  }
    // };

    // use lamda expression 
    A obj = () -> System.out.println("hey in show");
    obj.show();
}
}