import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    static int contarVogais(String texto) {
        String vogais = "aeiouáéíúâêîôãõ";
        String minusculo = texto.toLowerCase();
        int quantidade = 0;
        for (int i =0; i < minusculo.length(); i ++) {
            if (vogais.indexOf(minusculo.charAt(i)) != -1) {
                quantidade++;
            }
        }
        return quantidade;
    }
    static void exibirContagem(String[] frases) {
        for (int i = 0; i < frases.length; i++) {
            System.out.println(frases[i] + " -> " + contarVogais(frases[i] + " vogais"));
        }
    }
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {
            System.out.print("Digite a palavra/frase " + (i + 1) + ": ");
        }
        exibirContagem(frases);
        sc.close();
    }
}
