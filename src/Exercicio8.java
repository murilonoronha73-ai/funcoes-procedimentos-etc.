public class Exercicio8 {
    static boolean contem(int[] numeros, int valor) {
        for (int n : numeros) {
            if (n == valor) {
                return true;
            }
        }
        return false;
    }

    static int[] sortear(int quandidade, int maximo) {
        int[] numeros = new int[quandidade];
        int i = 0;
        while (i < quandidade) {
            int valor = (int) (Math.random() * maximo) + 1;
            if (!contem(numeros, valor)) {
                numeros[i] = valor;
                i++;
            }
        }
        return numeros;
    }

    static void exibir(int[] numeros) {
        System.out.print("Números Sorteados:");
        for (int n : numeros) {
            System.out.print(" " + n);
        }
    }

    public static void main(String[] args) {
        exibir(sortear(6, 60));
    }
}