interface Computer{
  public void devaap();
}
class Dextop implements Computer{
   public void devaap(){
        System.out.println("coading by using dextop");
    }
}
class Laptop implements Computer {
   public  void devaap(){
        System.out.println("coading by using laptop");
    }
}
class Developer{
    void devaap(Computer lap){
      lap.devaap();
    }
   
}
public class check{
    public static void main(String[] args) {
        Computer c = new Laptop();
        Computer c1 = new Dextop();
        Laptop lap = new Laptop();
        Dextop dex = new Dextop();
        Developer sumit = new Developer();
        sumit.devaap(c);
        sumit.devaap(c1);
        sumit.devaap(lap);
        sumit.devaap(dex);
    }
}