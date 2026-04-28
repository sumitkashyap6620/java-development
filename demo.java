public class demo{
    public static void main (String args[]){
        Calculator c = new Calculator();
        c.count = 15 ;
        // System.out.println(c.getamount());
        // System.out.println(c.total());
         calcy c1 = new calcy();
         c1.count = 5 ;
         c1.price1 = 15 ;
         c1.price2 = 25 ;
        System.out.println(c1.total());
        System.out.println(c1.sum());
    }
}