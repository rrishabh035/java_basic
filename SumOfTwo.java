import java.util.Scanner;
public class SumOfTwo{
  public static void main(String[] args) {
    System.out.println("Enter The Two Number");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The First Number");
    int a = sc.nextInt();
    System.out.println("Enter The Second Number");
    int b = sc.nextInt();
    Integer boxed1 = Integer.valueOf(a);
    Integer boxed2 = Integer.valueOf(b);
    Object obj = boxed1;
    int sum = boxed1 + boxed2 ;
    System.out.println(sum);
    System.out.println((int)obj);

  }
}
