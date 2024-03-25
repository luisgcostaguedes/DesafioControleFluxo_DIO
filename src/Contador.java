import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o primeiro número: ");
        int number1 = terminal.nextInt();
        System.out.println("Por favor digite o segundo número: ");
        int number2 = terminal.nextInt();

        try {
            if (number1 < number2) {
                contar(number1, number2);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void contar(int number1, int number2) {
        for (int i = number1; i <= number2; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}