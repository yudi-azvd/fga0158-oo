
public class Exercicio4_while {
  public static void main(String[] args) {
    int i = 0, a, a0 = 2;
    a = a0;
    int r = 3;
    int n = 5;
    int sum = 0;
    
    while (i < n) {
      System.out.print(a + ", ");
      sum += a;
      a += r;
      i++;
    }

    System.out.println("\nsum: " + sum);
  }
}
