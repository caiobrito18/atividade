import java.util.Scanner;

public class Activities {
    public static void main(String[] args) {

        matrixPlotDiag();

    }

    public static void count() {
        // conta do número desejado até 100

        int num = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("insira o valora para começar a contagem");
        num = input.nextInt();
        while (num <= 100) {
            if (num < 0)
                break;
            System.out.println(num);
            num++;
        }
        input.close();
    }

    public static void countdec() {
        // Conta de 100 à 1
        int odd = 100;
        while (odd >= 1) {
            System.out.println(odd);
            odd--;
        }
    }

    public static void countEven() {
        // Conta os números pares até 100
        int even = 0;
        while (even < 100) {
            even = even + 2;
            System.out.println(even);
        }
    }

    public static void sqnum() {
        int num = 0;
        while (num <= 20) {
            num++;
            System.out.println(Math.pow(num, 2));
        }
    }

    public static void countSum() {
        int num = 0, sum = 0;

        while (num < 100) {
            num++;
            sum = num % 2 == 0 ? num + sum : sum;
            System.out.println("num: " + num + " ,soma corrente: " + sum);
        }
    }

    public static void inputSum() {
        int num = 0, sum = 0;

        Scanner input = new Scanner(System.in);
        while (num >= 0) {
            System.out.println("insira o valor desejado");
            num = input.nextInt();
            sum = sum + num;
            System.out.println(sum);
        }
        input.close();
    }

    public static void fiveRoots() {
        double num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
        double root1 = 0, root2 = 0, root3 = 0, root4 = 0, root5 = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("insira o valor desejado");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();
        num4 = input.nextDouble();
        num5 = input.nextDouble();

        root1 = Math.sqrt(num1);
        root2 = Math.sqrt(num2);
        root3 = Math.sqrt(num3);
        root4 = Math.sqrt(num4);
        root5 = Math.sqrt(num5);

        System.out.println("Raiz 1:" + root1 + "\nRaiz 2: " + root2 + "\nRaiz 3: " + root3 + "\nRaiz 4: " + root4
                + "\nRaiz 5: " + root5);
        input.close();
    }

    public static void sumPairs() {
        int num = 25, sum = 0;

        while (num < 200) {
            num++;
            sum = num % 2 == 0 ? num + sum : sum;
            System.out.println("soma dos pares: " + sum);
        }
    }

    public static void countInterval() {
        // conta do 0 até número desejado

        int num = 0, interval = 0, inc = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("insira o limite da contagem:");
        interval = input.nextInt();
        System.out.println("insira o valor de incremento da contagem:");
        inc = input.nextInt();
        while (num <= interval) {
            if (num < 0)
                break;
            System.out.println(num);
            num += inc;
        }
        input.close();
    }

    public static void multiply() {

        int num1 = 0, num2 = 0, res = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("insira o primeiro valor:");
        num1 = input.nextInt();
        System.out.println("insira o segundo valor:");
        num2 = input.nextInt();
        for (int i = 0; i < num2; i++) {
            res += num1;
        }
        System.out.println(res);
        input.close();
    }

    public static void specificPower() {
        double num1 = 0, num2 = 0, res = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("insira o valor b:");
        num1 = input.nextDouble();
        System.out.println("insira o valor n:");
        num2 = input.nextDouble();
        input.close();
        if (num1 < 1)
            return;
        if (num2 < 2)
            return;
        if (num1 % 1 != 0 || num2 % 1 != 0) {
            System.out.println("valor inválido\nValor inserido deve ser um número inteiro");
            return;
        }

        res = Math.pow(num1, num2);
        System.out.println(res);
    }

    public static void matrixPlot() {
        double[][] matrix = new double[10][10];
        double random = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                random = Math.floor(Math.random() * (10) + 1);
                matrix[i][j] = random;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void matrixPlotDiag() {
        int[][] matrix = new int[10][10];
        double random = 0;
        int count2 = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                random = Math.floor(Math.random() * (9) + 1);
                matrix[i][j] = (int) random;
            }
        }
        System.out.println("Array: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + "     ");
            }
            System.out.print("\n");
        }

        System.out.println("Diagonal");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i <= j) {
                    System.out.print(matrix[i][j] + "     ");
                } else {
                    System.out.print("      ");
                }
            }
            System.out.print("\n");

        }
    }

    public static void fibonacci(){
        
    }
}
