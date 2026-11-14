import java.util.Scanner;

public class Exercicio9 {

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    static int somar(int[] termos) {
int soma = 0;
for (int t : termos) {
    soma += t;
}
return soma;
    }
    static void exibir(int[] termos) {
        for (int t : termos) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite um numero (de 1 a 30): ");
            n = sc.nextInt();
        } while (n < 1 || n > 30);

        int[] termos = new int[n];
        for (int i = 0; i < n; i++) {
            termos[i] = fibonacci(i);
        }
        exibir(termos);
        System.out.println("Soma: " + somar(termos));
    }
}
