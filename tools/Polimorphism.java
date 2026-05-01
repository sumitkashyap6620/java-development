
  class A{
      
    void show(){
        System.err.println("I an A");
    }
 }
 class B extends A{
 void show(){
        System.err.println("I an B");
    }
 }
 class C extends A {
 void show(){
        System.err.println("I an C");
    }
 }
//  Multilevel inheritance
 class D extends C{
 void show(){
        System.err.println("I an D");
    }
 }
public class Polimorphism{
//    if a child class holds the property of parent class then We can initilize the parent class object and then point it to the subclasse 
    public static void main(String[] args) {
      
         A obj = new A();
         obj.show();
          obj = new B();
         obj.show();
          obj = new C();
         obj.show();
        //  obj = new D();
        //  obj.show();
        //  not working for Class D because D not inherit the properties of A 
        // or we can saw that D is not the child class of A ; 

        //   B obj2 = new B();
        // obj2 = new A();
        // not possible if we create obj of sub class and initial new obj to that obj with superclass ;
    }
}