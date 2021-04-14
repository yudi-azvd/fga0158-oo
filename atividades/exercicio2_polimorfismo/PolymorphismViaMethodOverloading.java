public class PolymorphismViaMethodOverloading {
  static int add(int num1, int num2) {
    System.out.println("integer sum");
    return num1+num2;
  }
  
  static double add(double num1, double num2) {
    System.out.println("floating point sum");
    return num1+num2;
  }
  
  static String add(String str1, String str2) {
    System.out.println("string concat");
    return str1+str2;
  }
  
  public static void main(String[] args) {
    System.out.println(add(1, 2));
    System.out.println(add(1.0, 3.6));
    System.out.println(add("hello", " world"));
  }
}
