import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        long numero;
        long suma = 0;
        int contador = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        numero = scanner.nextLong();

        while (numero > 0) {
            long digito = numero % 10;  
            if (digito % 2 == 0) {
                System.out.print(  +digito + " ");
                suma += digito;
                contador++;
            }
            numero /= 10; 
        }

        if (contador == 0) {
            System.out.println("No hay dígitos pares.");
        } else {

            System.out.println("\nLa suma de los dígitos pares es: " + suma);
        }
    }
}
