
import com.sun.source.tree.PackageTree;

public class strings{
    public static void main(String args[]){
        String s =  "sumit ka";
        StringBuffer sb = new StringBuffer("sumuit kashhyap");
        sb.delete(2, 5);
        sb.append(" rajput");
        sb.insert(2, "mi");
        sb.deleteCharAt(9);
        System.out.println("sb = "+sb);
        StringBuilder SB = new StringBuilder();
        SB.append("SUMIT KASHYAP");
         System.out.print("SB = "+sb);
    }
}