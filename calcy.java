public class calcy extends  Calculator {
     public calcy(){
       super(2);
      System.out.println("this is calcy");
    }
      public calcy(int x ){
        super(5);
      System.out.println("this is calcy2.0");
    }
      int price1 ;
      int price2 ;
      int sum(){
        return price1 + price2 ;
      }
      int subtract(){
        return price1 + price2 ;
      }
}