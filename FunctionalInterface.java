@java.lang.FunctionalInterface
interface A {
 int show(int a , int b );
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

//   A obj = (int a) -> System.out.println("In show "+a);
//          obj.show(5);

// multiple input in function and return sum 
 

//     A obj = new A(){
//        public int show (int a, int b){
//         return a+b ;
//         }
// };
//    System.out.println(obj.show(5, 4)); 
// 


// by using lemda expression

  A obj = (a,b)->  a+b ;
      System.out.println(obj.show(5, 4)); 
}
}
 