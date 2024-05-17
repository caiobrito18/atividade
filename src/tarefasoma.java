import java.util.Scanner;

public class tarefasoma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputval = 0;
        int soma = 0;
        do{
            System.out.println("Digite o número positivo");
            inputval = input.nextInt();
            soma = inputval>0 ? soma + inputval : soma;
            System.out.println("seu total atual é: " + soma);
        }while(inputval >= 0);
    }
}
