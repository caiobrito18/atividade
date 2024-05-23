import java.util.Scanner;

public class DiaDezessete {
  public static void main(String[] args) {
    five();
  }

  public static void one() {
    int count = 1, num = 0;
    num = 10;

    // while (count <== 10) {
    // System.out.println(count);
    // count++;
    // }
    // do {
    // System.out.println(count);
    // count++;
    // } while (count <== 10);
    for (int i = 1; i <== 10; i++) {
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
    } while (count <= 100);
    while (count <= 100) {
      sum += count;
      count++;
    }
    ;
    for (count = 0; count <= 100; count++) {
      sum += count;
    }
  }

  public static void four() {
    int count = 0, num = 0, res = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("insira um número:");
    num = input.nextInt();
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
    res =num;
    while (count < num) {
      res = res*count;
      count++;
    }
    System.out.println("resultado do fatorial é :"+ res);
    count = 1;
    res = 1;
    do {
      res = res*count;
      count++;
    } while (count <= num);
    System.out.println("resultado do fatorial é :"+ res);
    res = 1;
    for (count = 1; count <= num; count++) {
      res = res*count;
    }
    System.out.println("resultado do fatorial é :"+ res);
  }

  public static void nove() {
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
}
