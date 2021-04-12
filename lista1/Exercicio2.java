
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exercicio2 {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    String name = JOptionPane.showInputDialog(frame, "Digite seu nome");

    String birthYearStr = JOptionPane.showInputDialog(frame, "Em que ano Você nasceu?");
    int birthYear = Integer.parseInt(birthYearStr);
    int age =  Calendar.getInstance().get(Calendar.YEAR) - birthYear;

    String message = String.format("Olá %s! Você tem %d anos de idade.", name, age);

    JOptionPane.showMessageDialog(frame, message);
  }
}
