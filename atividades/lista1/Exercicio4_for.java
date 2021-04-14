
public class Exercicio4_for {
  public static void main(String[] args) {
    int a, a0 = 2;
    a = a0;
    int r = 3;
    int n = 5;
    int sum = 0;

    for (int i = 0; i < n; i++) {
      System.out.print(a + ", ");
      sum += a;
      a += r;
    }

    System.out.println("\nsum: " + sum);
  }
}
