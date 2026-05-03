abstract class A{
    int val ;
 abstract void show();
}
public class AnnormousInnwerClass{
    public static void main(String args[]){
      A obj = new A(){
        void show(){
            System.out.println("hey this is annormous inner class ");
        }
      };
      obj.val= 12 ;
      obj.show();

    }                             
}