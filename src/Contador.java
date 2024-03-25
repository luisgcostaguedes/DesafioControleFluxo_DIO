import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o primeiro número: ");
        int numero1 = terminal.nextInt();
        System.out.println("Por favor digite o segundo número: ");
        int numero2 = terminal.nextInt();
        try {
            
            contar(numero1, numero2);
        
        } catch (ParametrosInvalidosException e) {
            
            System.out.println("Erro: " + e.getMessage());
        }


    }




    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        
        if (numero1 >= numero2) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro.");
        }
        
        int contagem = numero2 - numero1;
        
        for (int i = numero1; i <= numero2; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

