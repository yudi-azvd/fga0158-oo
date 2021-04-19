# Atividade sobre Polimorfismo
Procurar na internet ou em livros os seguintes tipos de polimorfismo: 

1. Polimorfismo por sobrescrita de métodos
1. Polimorfismo por sobrecarga de métodos 
1. Polimorfismo por coerção 
1. Polimorfismo paramétrico
1. Polimorfismo por subtipagem
        
Para cada um desses tipos de polimorfismo apresente sua descrição, como ele é 
realizado e um exemplo.

Polimorfismo é a provisão de uma única interface para entidades de diferentes
tipos ou o uso de um único símbolo para representar mútiplos diferentes tipos.

## Polimorfismo por sobrescrita de métodos
Uma classe que herda de outra classe implementa um método presente na super 
classe com a mesma assinatura, podendo conferir um novo comportamento ao método.

O método sobrescrito pode ter sua acessibilidade aumentada, mas não restringida.
Se o método é privado na super classe, a sub classe  pode torná-la pública, 
mas não o contrário. [Exemplo funcional](ClasseDerivada.java).


```java
class ClasseBase {
  public void metodo1() {
    System.out.println("Oi da classe base");
  }
}

class ClasseDerivada extends ClassBase {
  // sobrescrita do ClasseBase.method1
  public void metodo1() {
    System.out.println("Oi da classe derivada");
  }
}
```

## Polimorfismo por sobrecarga de métodos (Ad hoc?)
Mútiplas implementações do mesmo método com o mesmo nome e diferentes 
assinaturas. 
[Exemplo funcional](PolymorphismViaMethodOverloading.java).

```java
class PolymorphismViaMethodOverloading {
  int    add(int num1, int num2) {...}
  
  double add(double num1, double num2) {...}
  
  String add(String str1, String str2) {...}
}
```

## Polimorfismo por coerção 
...

## Polimorfismo paramétrico
Permite que uma função ou tipo de dado sera escrito genericamente, de maneira 
que eles possam lidar com os valores uniformemente sem depender dos tipos dos
dados.

Em C++ e D, o mecanismo de implementação é `template`. Em Java e C# é `generics`.

```java
class List<T> {
  class Node<T> {
    T element;
    Node<T> next;
  }

  Node<T> head;
  int length() { ... }
}
```

## Polimorfismo por subtipagem
Se uma função aceita como argumento um dado do tipo `T`, ela também pode aceitar
qualquer outro dado de subtipo de `T`. Se `S`, `R` e `U` são subtipos de `T`, 
então dados dos tipos `S`, `R` e `U` podem ser passados pra função.

Polimorfismo por subtipagem geralmente é resolvido dinamicamente.

```java
abstract class Animal {
  abstract String talk();
}

class Cat extends Animal {
  String talk() {
    return "Meow!";
  }
}

class Dog extends Animal {
  String talk() {
    return "Woof!";
  }
}

static void letsHeat(final Animal a) {
  println(a.talk();)
}

static void main(String[] args) {
  letsHear(new Cat());
  letsHear(new Dog());
}
```
        

### Referências

[Polimorfismo (ciências da computação)](https://en.wikipedia.org/wiki/Polymorphism_(computer_science))

[Herança e Polimorfismo em Java](https://www.guru99.com/java-inheritance-polymorphism.html)