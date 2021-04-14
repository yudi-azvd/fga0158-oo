
public class PA {
  int r, n, a0, soma = 0;
  int[] termos;

  PA(int r, int n, int a0) {
    this.r = r;
    this.n = n;
    this.a0 = a0;

    termos = new int[n];
    calcularPA();
  }

  void calcularPA() {
    for (int i = 1; i <= this.n; i++) {
      termos[i-1] = a0 + r*(i-1);      
    }
  }

  @Override
  public String toString() {
    String result = "r = " + this.r + "\n";
    result += "n = " + this.n + "\n";
    result += "a0 = " + this.a0 + "\n";

    for (int i = 0; i < termos.length; i++) {
      result += " " + termos[i] + ", ";
    }

    return result;    
  }
}
