import java.util.Scanner;

public class counting {
    public static void main(String[] args) {

        inputSum(args);

    }

    public static void count(String[] args) {
        // conta até 100

        int numero = 1;
        while (numero <= 100) {
            System.out.println(numero);
            numero++;
        }
    }

    public static void countdec(String[] args) {
        // Conta de 100 à 1
        int odd = 100;
        while (odd >= 1) {
            System.out.println(odd);
            odd--;
        }
    }

    public static void countEven(String[] args) {
        // Conta os números pares até 100
        int even = 0;
        while (even < 100) {
            even = even + 2;
            System.out.println(even);
        }
    }

    public static void sqnum(String[] args) {
        int num = 0;
        while (num <= 20) {
            num++;
            System.out.println(Math.pow(num, 2));
        }
    }

    public static void countSum(String[] args) {
        int num = 0, sum = 0;

        while (num < 100) {
            num++;
            sum = num % 2 == 0 ? num + sum : sum;
            System.out.println("numero: " + num + " ,soma corrente: " + sum);
        }
    }

    public static void inputSum(String[] args) {
        int num = 0, sum = 0;

        Scanner input = new Scanner(System.in);
        while (num >= 0) {
            System.out.println("insira o valor desejado");
            num = input.nextInt();
            sum = sum+num;
            System.out.println(sum);
        }
        input.close();
    }

}
