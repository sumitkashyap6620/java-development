 class Calculator{
    
      int count ;
     private int amount = 5;
     int total(){
        return count*amount ;
     }
     int getamount(){
      return amount ;
     }
   void setamount(int x){
       amount = x ;
    }

}
public class oops{
    public static void main (String args[]){
      Calculator c =  new Calculator() ;
      c.count = 2 ;
      c.setamount(10);
      System.out.println(c.total());

    }
}