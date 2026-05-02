// multilevel inheritance in java

//   Calculator (parent of calcy) <- calcy(child of Calculator && parent of advcal) <- advcal(child of calcy)
public class advcal extends Calculator{
       public advcal(){
        //  by default function is super which called at the  time of object creation
            super(2);
      System.out.println("this is advance calculator");
    }
       public advcal(int n){
        this();
      System.out.println("this is calculator");
    }
    public static void main (String args[]){
        advcal x  =  new advcal();
       x.count = 15 ;
         System.out.println(x.getamount());
         System.out.println(x.total());
         Calculator c1 = new Calculator();
         c1.count = 5 ;
       
        System.out.println(c1.total());
      
    }
}