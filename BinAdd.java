//BINARY ADDITION
import java.util.*;
public class BinAdd{
  public String convertToBinary(int c){
    //BINARY CONVERSION
    StringBuilder sb = new StringBuilder();
    while(c!=0){
      int a  = c % 2 ;
      sb.append(a);
      c =c /2 ;
    }
    return sb.reverse().toString();
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter 2 Binary Numbers");
    String bin1 = sc.next();
    String bin2 = sc.next();
    int c = Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2);
    System.out.println(String.format("ADDED BINARY : %s",(new BinAdd()).convertToBinary(c)));
  }
}
