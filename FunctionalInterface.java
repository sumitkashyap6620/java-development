@java.lang.FunctionalInterface
interface A {
 void show(int a );
}
public class FunctionalInterface{
public static void main(String[] args) {
    // A obj = new A(){
    //  public void show(){
    //     System.out.println("heyy in show");
    //  }
    // };

    // use lamda expression 
    // A obj = () -> System.out.println("hey in show");
    // obj.show();

    // taking input in sunction

//     A obj = new A(){
//        public void show (int a){
//         System.out.println("In show "+a);
//         }
// };

//  using lemda expression 

  A obj = (int a) -> System.out.println("In show "+a);
         obj.show(5);
} }