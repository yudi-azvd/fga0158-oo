public class ClasseDerivada extends ClasseBase {
  public void metodo1() {
    System.out.println("Um oi da classe derivada");
  }

  public static void main(String[] args) {
    ClasseBase base = new ClasseBase();
    base.metodo1();
    
    ClasseDerivada derivado = new ClasseDerivada();
    derivado.metodo1();
  }
}
