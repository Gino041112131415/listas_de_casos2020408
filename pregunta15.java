import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int combinacion = 1234;
        int intentos = 4;
        int numeroIntroducido;
        
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= intentos; i++) {
            System.out.print("Introduce la combinación: ");
            numeroIntroducido = s.nextInt();

            if (numeroIntroducido == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                return;
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
            }
        }
        System.out.println("Has agotado los intentos. La caja fuerte se ha cerrado.");
    }
}
