class A{
    int x ;
    void show(){
        System.out.println("Show method A ");
    }
     /* static */  class B{
    void show(){
        System.out.println("show method B");
    }
  }

}
public class InnerClass{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        // B obj1 = new B();  error B not found because B inside A 
         A.B obj1 = obj.new B(); // By using obj refrence of A
      //  A.B obj1 = new A.B();  -> if B class is static we can directly create obj usning A.B class 
        obj1.show();


    }
}