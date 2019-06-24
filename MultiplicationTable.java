import java.util.*;
public class MultiplicationTable{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for(int i = 0 ; i <= 10 ; i++){
      System.out.println(String.format("%d x %d = %d",a,i,a*i));
    }
  }
}
