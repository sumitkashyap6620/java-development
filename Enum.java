enum status {
    good(100) , bad(12) , nice(12) , verygood(32) ;
    public int  prise ;
    status(int a) {
        prise = a ;
    }

}

public class Enum{
    public static void main(String args[]){
      status sumit = status.verygood;
     switch(sumit){
       case good :{
           System.out.println("GOOD : " + sumit.prise);
           break ;
       }
       case bad :{
           System.out.println("BAD : " + sumit.prise);
           break ;
       }
       case nice :{
           System.out.println("NICE : " + sumit.prise);
           break ;
       }
       case verygood :{
           System.out.println("VERYGOOD : " + sumit.prise);
           break ;
       }
     }
    }
}