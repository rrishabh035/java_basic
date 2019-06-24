import java.util.Scanner;
import java.util.*;
public class Product{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    Formatter f = new Formatter();
    System.out.println(f.format("%d X %d = %d",a,b,a*b));
  }
}
