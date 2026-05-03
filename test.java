import java.util.* ;
public class test{
   public static void main(String[] args) { 
    int temp = 0 ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Creating 1st matric\nRows :  ");
    int r = sc.nextInt(); 
    System.out.print("columns : ");
    int c = sc.nextInt(); 
    int arr[][] = new int[r][c];
      for (int i = 0 ; i < r ; i++)
          for (int j = 0 ; j < c ; j++)
           arr[i][j]=sc.nextInt();
         for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
               
                if (arr[i][j] == '1') 
                
        System.out.println("now");
        for (int i = 0 ; i < r ; i++){
          for (int j = 0 ; j < c ; j++){
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    } 
    }
}
