import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

static String inverter(String texto){
    String invertido = "";
    for (int i = texto.length() - 1; i >= 0; i--){
        invertido += texto.charAt(i);
    }
    return invertido;
}
static boolean ehPalindromo(String texto) {
    String limpo = texto.replace(" ", " ").toLowerCase();
    return limpo.equals(inverter(limpo));
}
static void exibirResultado(String frase){
    if (ehPalindromo(frase)) {
        System.out.println(frase + " -> é palíndromo");
    }else{
        System.out.println(frase + " -> não é palíndromo");
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] frases = new String[3];

    for (int i = 0; i < frases.length; i++){
        System.out.print("Digite a frase " + (i + 1) + ": ");
        frases[i] = sc.nextLine();
        exibirResultado(frases[i]);
    }
}
}
