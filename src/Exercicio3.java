import java.util.Scanner;

public class Exercicio3 {
    static boolean ehPrimo(int numero) {
        if ( numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void exibirPrimos(int[] numeros) {
        System.out.print("Primos");
        boolean achou = false;
        for (int i = 0; i < numeros.length; i++) {
            if (ehPrimo(numeros[i])) {
                System.out.print(" " + numeros[i]);
                achou = true;
            }
        }
        if (!achou) {
            System.out.print(" Nenhum");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
        }
        exibirPrimos(numeros);
        sc.close();
    }
}
