public class tarefaloops {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            soma = (int) (i % 2 == 0 ? soma = soma + i : soma);
            System.out.println(soma);
        }
    }
}