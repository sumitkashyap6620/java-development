//  By using abstract class 
//               |
//               |
abstract class Computer{

    abstract void dev();
}
class Laptop extends Computer{
    void dev(){
        System.out.println("Coding by Laptop !");
    }
}
class Dextop extends Computer{
    void dev(){
        System.out.println("Coding by Dextop !");
    }
}
class Developer{
    void dev(Computer lap){
        lap.dev();
    }
}
public class OopsFlexibility{
public static void main(String[] args) {
    Developer sumit = new Developer() ;
    Computer dell =  new Laptop();
    Computer hp =  new Dextop();
    sumit.dev(dell);
    sumit.dev(hp);
}
}