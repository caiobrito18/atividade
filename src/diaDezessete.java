import java.util.Scanner;

public class diaDezessete {
  public static void main(String[] args) {

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
