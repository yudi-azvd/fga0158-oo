
import java.util.Scanner;

public class Exercicio4_OO {
  static PA[] progressoes;
  static int posicaoLivre = 0;
  static Scanner sc;

  public static void main(String[] args) {
    int opcao = 0;
    
    progressoes = new PA[10];
    sc = new Scanner(System.in);
    
    do {
      System.out.println("Escolhe uma opção aí: ");

      opcao = sc.nextInt();

      switch (opcao) {
        case 1:
          cadastrarPA();
          break;
        case 2:
          mostrarPAs();
          break;
        default:
          break;
      }
    } while (opcao != 0);
    
    System.out.println("Tchau!");
    sc.close();
  }

  public static void cadastrarPA() {
    int r = sc.nextInt();
    int n = sc.nextInt();
    int a0 = sc.nextInt();

    PA pa = new PA(r, n, a0);

    progressoes[posicaoLivre++] = pa;
  }

  public static void mostrarPAs() {
    for (int i = 0; i < posicaoLivre; i++) {
      System.out.println(progressoes[i]);
    }
  }
}
