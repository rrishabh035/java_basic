import java.util.*;
public class AreaPerRect{
  public static void main(String[] args) {
    float base,length,area,perim;
    Scanner sc = new Scanner(System.in);
    base = sc.nextFloat();
    length = sc.nextFloat();
    area = (float) base * length ;
    perim =  2*(base + length);
    System.out.println(String.format("%.2f",area));
    System.out.println(String.format("%.2f",perim));
  }
}
