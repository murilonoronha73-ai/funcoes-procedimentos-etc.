import java.util.Scanner;

public class Exercicio2 {

    static int inverterNumero(int numero) {
        int invertido = 0;
        while (numero !=0) {
            invertido = invertido * 10 + numero % 10;
            numero = numero / 10;
        }
        return invertido;
    }
    static void exibirInvertidos(int[] numeros) {
        for (int i = 0; i < numeros.length; i ++) {
            System.out.println(numeros[i] + " Ao contrário: " +  inverterNumero(numeros[i]));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.print("Digite o número " + (i + 1) + "(inteiro positivo): ");
                numeros[i] = sc.nextInt();
            } while (numeros[i] < 0);
        }
        exibirInvertidos(numeros);
        sc.close();
    }
}
