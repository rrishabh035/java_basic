import java.util.*;
import java.math.*;
public class AreaPerimeterCircle{
  public static void main(String[] args) {
    double r ;
    Scanner sc = new Scanner(System.in);
    r = sc.nextDouble();
    BigDecimal radius = BigDecimal.valueOf(r);
    MathContext rule = new MathContext(15,RoundingMode.HALF_DOWN);
    BigDecimal area = radius.pow(2).multiply(BigDecimal.valueOf(Math.PI),rule);
    BigDecimal perimeter = radius.multiply(BigDecimal.valueOf(2*Math.PI),rule);
    System.out.println(area + "\n" + perimeter);
  }
}
