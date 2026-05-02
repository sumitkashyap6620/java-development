//  Final -> variable ,method,class !
 final class A{
    
}
// class  B extends  A{
    // Class A is Final it can not be inherit in another class
// }
class B {
  final  void show(){

    }
}

class C extends B {
    //     void show(){
//  not possible because in B already defined show method which is final 
    // }
}
public class UseFinal{
   final int x  = 5 ;
//    x = 3 ;   x is final can not bhe change 
}