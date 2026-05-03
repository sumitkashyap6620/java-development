// All interfaces have by default abstract(incimplete) methods
interface A{
    // premitive data types in Interfase are static and final 
    int age = 12 ;
    void show();
 }  
interface C extends A{
    int age = 525 ;
    void done();
 }  

// we can not create object of an interface so ve have to implement it in the class 
class B implements  C{

   
   public  void show() {
       System.out.println("show completed");
    }
    public void done(){
        System.out.println("done completed");
    }

}

public class Interfaces{
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
          System.out.println("age is "+A.age);
          C obj1 = new B ();
          obj1.done();
          System.out.println("age is "+C.age);
    }
}