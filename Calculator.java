 public class Calculator{
    public Calculator(){
      super();
      System.out.println("this is calculator");
    }
       public Calculator(int x){
      System.out.println("this is calculator2.0");
    }
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
