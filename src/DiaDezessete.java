import java.util.Scanner;

public class DiaDezessete {
  public static void main(String[] args) {
    int opt;
    Scanner input = new Scanner(System.in);
    System.out.println("insira a atividade desejada (1 - 10)");
    opt = input.nextInt();

    switch (opt) {
      case 1:
        one();
        break;

      case 2:
        two();
        break;
      case 3:
        threee();
        break;
      case 4:
        four();
        break;
      case 5:
        five();
        break;
      case 6:
        six();
        break;
      case 7:
        seven();
        break;
      case 8:
        eight();
        break;
      case 9:
        nine();
        break;
      case 10:
        ten();
        break;

      default:
        System.out.println("opção inválida");
        break;
    }
    input.close();
  }

  public static void one() {
    int count = 1;

    while (count <= 10) {
      System.out.println(count);
      count++;
    }
    do {
      System.out.println(count);
      count++;
    } while (count <= 10);
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
  }

  public static void two() {
    int count = 1;
    do {
      System.out.print(count % 2 == 0 ? count : " ");
      count++;
    } while (count <= 20);
    count = 1;
    while (count <= 20) {
      System.out.print(count % 2 == 0 ? count : " ");
      count++;
    }
    for (count = 1; count <= 20; count++) {
      System.out.print(count % 2 == 0 ? count : " ");
    }
  }

  public static void threee() {
    int sum = 0, count = 0;
    do {
      sum += count;
      count++;
      System.out.println(sum);
    } while (count <= 100);
    while (count <= 100) {
      sum += count;
      count++;
      System.out.println(sum);

    }
    ;
    for (count = 0; count <= 100; count++) {
      sum += count;
      System.out.println(sum);
    }
  }

  public static void four() {
    int count = 0, num = 0, res = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("insira um número:");
    num = input.nextInt();
    input.close();
    while (count <= 10) {
      res = num * count;
      System.out.println(num + " * " + count + " = " + res);
      count++;
    }
    count = 0;
    do {
      res = num * count;
      System.out.println(num + " * " + count + " = " + res);
      count++;
    } while (count <= 10);
    for (count = 0; count <= 10; count++) {
      res = num * count;
      System.out.println(num + " * " + count + " = " + res);
    }
  }

  public static void five() {
    int count = 1, num = 0, res = 1;
    Scanner input = new Scanner(System.in);
    System.out.println("insira um número:");
    num = input.nextInt();
    res = num;
    while (count < num) {
      res = res * count;
      count++;
    }
    System.out.println("resultado do fatorial é :" + res);
    count = 1;
    res = 1;
    do {
      res = res * count;
      count++;
    } while (count <= num);
    System.out.println("resultado do fatorial é :" + res);
    res = 1;
    for (count = 1; count <= num; count++) {
      res = res * count;
    }
    System.out.println("resultado do fatorial é :" + res);
  }

  public static void six() {
    int count = 1, num = 0, res = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("insira um número:");
    num = input.nextInt();
    res = num;
    while (count < num) {
      res += count;
      count++;
    }
    System.out.println("resultado é: " + res);
    count = 1;
    res = 0;
    do {
      res += count;
      count++;
    } while (count <= num);
    System.out.println("resultado é: " + res);
    res = 0;
    for (count = 1; count <= num; count++) {
      res += count;
    }
    System.out.println("resultado é: " + res);
  }

  public static void seven() {
    int count = 10;

    while (count > 0) {
      System.out.println(count);
      count--;
    }
    count = 10;
    do {
      System.out.println(count);
      count--;
    } while (count >= 0);

    for (int i = 10; i >= 0; i--) {
      System.out.println(i);
    }
  }

  public static void eight() {
    int count = 1;
    do {
      System.out.print(count % 5 == 0 ? count : " ");
      count++;
    } while (count <= 100);
    System.out.println("\n");
    count = 1;
    while (count <= 100) {
      System.out.print(count % 5 == 0 ? count : " ");
      count++;
    }
    System.out.println("\n");
    for (count = 1; count <= 100; count++) {
      System.out.print(count % 5 == 0 ? count : " ");
    }
  }

  public static void nine() {
    long count = 2, num = 0;
    boolean prime = true;
    Scanner input = new Scanner(System.in);
    System.out.println("insira o primeiro número:");
    num = input.nextLong();
    // while (prime == true && count <= num - 1) {
    // prime = num % count == 0 ? false : true;
    // count++;
    // }
    // do {
    // prime = num % count == 0 ? false : true;
    // count++;
    // } while (prime == true && count <= num - 1);
    for (int i = 2; i <= num; i++) {
      prime = num % i == 0 ? false : true;
    }
    if (prime == true) {
      System.out.println("é primo");
    } else {
      System.out.println("não é primo");
    }
    input.close();
  }

  public static void ten() {
    int count = 1;
    do {
      System.out.print(count % 5 == 0 && count % 3 == 0 ? count : " ");
      count++;
    } while (count <= 100);
    System.out.println("\n");
    count = 1;
    while (count <= 100) {
      System.out.print(count % 5 == 0 && count % 3 == 0 ? count : " ");
      count++;
    }
    System.out.println("\n");
    for (count = 1; count <= 100; count++) {
      System.out.print(count % 5 == 0 && count % 3 == 0 ? count : " ");
    }
  }

}
