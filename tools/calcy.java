package tools;
public class calcy extends Calculator {
     public calcy(){
       super(2);
      System.out.println("this is calcy");
    }
      public calcy(int x ){
        super(5);
      System.out.println("this is calcy2.0");
    }
     public  int price1 ;
     public int price2 ;
     public int sum(){
        return price1 + price2 ;
      }
     public int subtract(){
        return price1 + price2 ;
      }
}