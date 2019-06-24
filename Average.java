import java.util.*;
public class Average{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float a,c,b,avg;
    a = sc.nextFloat();
    b = sc.nextFloat();
    c = sc.nextFloat();
    avg = (float) (a+b+c)/3;
    System.out.println(avg);
  }
}
