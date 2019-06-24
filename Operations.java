import java.util.*;
public class Operations{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = a +b ;
    System.out.println(String.format("%d + %d = %d",a,b,c));
    c = a - b ;
    System.out.println(String.format("%d - %d = %d",a,b,c));
    c = a * b ;
    System.out.println(String.format("%d * %d = %d",a,b,c));
    c = a/b ;
    System.out.println(String.format("%d / %d = %d",a,b,c));
    c = a % b ;
    System.out.println(String.format("%d mod %d = %d",a,b,c));
  }
}
