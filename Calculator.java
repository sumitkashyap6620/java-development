
 public class Calculator{
    public Calculator(){
      super();
      System.out.println("this is calculator");
    }
       public Calculator(int x){
      System.out.println("this is calculator2.0");
    }
    public  int count ;
     private int amount = 5;
     public int total(){
        return count*amount ;
     }
    public int getamount(){
      return amount ;
     }
  public  void setamount(int x){
       amount = x ;
    }
    
}
