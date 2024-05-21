import java.util.Scanner;

public class DiaDezessete {
  public static void main(String[] args) {
    two();
  }

  public static void one() {
    int count = 0, num = 0;
    num = 10;

    // while (count <= 10) {
    // System.out.println(count);
    // count++;
    // }
    // do {
    // System.out.println(count);
    // count++;
    // } while (count <= 10);
    for (int i = 0; i <= 10; i++) {
      System.out.println(i);
    }
  }

  public static void two() {
    int count = 0;
    do {
      System.out.print(count % 2 == 0 ? count : " ");
      count++;
    } while (count < 20);
    count = 0;
    while (count < 20) {
      System.out.print(count % 2 == 0 ? count : " ");
      count++;
    }
    for (count = 0; count < 20; count++) {
      System.out.print(count % 2 == 0 ? count : " ");
    }
  }

  public static void threee() {
    int num, count = 0;

  }

  public static void nove() {
    long count = 2, num = 0;
    boolean prime = true;
    Scanner input = new Scanner(System.in);
    System.out.println("insira o primeiro número:");
    num = input.nextLong();
    // while (prime == true && count < num - 1) {
    // prime = num % count == 0 ? false : true;
    // count++;
    // }
    // do {
    // prime = num % count == 0 ? false : true;
    // count++;
    // } while (prime == true && count < num - 1);
    for (int i = 2; i < num; i++) {
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
