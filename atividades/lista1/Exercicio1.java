import java.util.Calendar;
import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    String name = sc.nextLine();
    int birthYear = sc.nextInt();
    int age =  Calendar.getInstance().get(Calendar.YEAR) - birthYear;

    System.out.printf("Olá %s! Você tem %d anos de idade.\n", name, age);

    sc.close();
  }
}
