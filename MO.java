class a{
 void Show(){
        System.out.println("this is calss a !");
    }
     void show(){
        System.out.println("this is calss a !");
    }
}
class b extends a {

    void Show(){
        System.out.println("this is calss b !");
    }
}
public class MO{
   public static void main(String[] args) {
       b x = new b ();
       x.show();
    //    method overriding not going to the inherited or parent class function !
       x.Show();
   }
}