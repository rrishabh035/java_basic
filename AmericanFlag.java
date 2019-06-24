public class AmericanFlag{
  public static void main(String[] args) {
    int i =0,j=0;
    while ( i < 10) {
      j = 0;
      while ( j < 40) {
        if (j<14 && i<4) {
            System.out.print("*");
        }
        else{
          System.out.print("=");
        }
        j++;
      }
      System.out.println();
      i++;
    }

  }
}
