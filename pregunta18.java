import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // Declaramos las variables.
        int numero;
        int divisor;

        // Solicitamos los números al usuario.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        numero = scanner.nextInt();
        System.out.print("Ingrese un divisor: ");
        divisor = scanner.nextInt();
        
        for (int i = 1; i < numero; i += divisor) {
            System.out.println(i);
        }
    }
}
