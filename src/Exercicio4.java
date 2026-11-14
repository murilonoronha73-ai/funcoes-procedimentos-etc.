import java.util.Scanner;
import java.util.Locale;

public class Exercicio4 {

    static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }
    static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
    static void exibirRelatorio(double[] pesos, double[] alturas) {
        for (int i = 0; i < pesos.length; i++) {
            double imc = calcularImc(pesos[i],alturas[i]);
            System.out.println(String.format(new Locale("Pt" ,"BR"),
                    "Pessoa %d: IMC %.2f -%s", (i + 1), imc, classificarImc(imc)));
        }
    }
    static double lerDouble(Scanner sc ) {
        return Double.parseDouble(sc.next() .replace(",", "."));
    }

    public static  void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double[] pesos = new double[4];
        double[] alturas = new double[4];

        for (int i = 0; i < pesos.length; i++) {
            System.out.print("Pessoa " + (i + 1) + " - Peso(kg): ");
            pesos[i] = lerDouble(sc);
            System.out.print("Pessoa " + (i + 1) + " - Altura(m): ");
            alturas[i] = lerDouble(sc);
        }
        exibirRelatorio(pesos, alturas);
        sc.close();
    }
}
