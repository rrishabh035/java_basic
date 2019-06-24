public class Expression2{
  public static void main(String[] args) {
    double res ;
    res = (double)4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
    System.out.println(String.format("%.16f",res));
  }
}
