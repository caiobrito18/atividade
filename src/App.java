import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    int opt;
    Scanner input = new Scanner(System.in);
    System.out.println("insira a atividade desejada \n1: 16/05 \n2: 17/05");
    opt = input.nextInt();

    switch (opt) {
      case 1:
        DiaDezesseis.main(args);
        break;

      case 2:
        DiaDezessete.main(args);
        break;

      default:
        System.out.println("opção inválida");
        break;
    }
    input.close();
  }
}