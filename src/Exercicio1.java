import java.util.Scanner;
    public class Exercicio1 {
        static int contarDigitos(int numero) {
            if (numero == 0) {
                return 1;
            }
            int quantidade = 0;
            while (numero != 0) {
                numero = numero / 10;
                quantidade++;
            }
            return quantidade;
        }

        static void exibirDigitos(int[] numeros) {
            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i] + " tem " + contarDigitos(numeros[i]) + " Digito(s)");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] numeros = new int[5];

            for (int i = 0; i < numeros.length; i++) {
                do {
                    System.out.print("Digite o número " + (i + 1) + "(Inteiro Positivo): ");
                    numeros[i] = sc.nextInt();
                } while (numeros[i] < 0);
            }
            exibirDigitos(numeros);
            sc.close();
        }
    }
