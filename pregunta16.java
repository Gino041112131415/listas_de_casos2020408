import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int numerosPositivos = 0;
        int numerosNegativos = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
      
        for (int numero : numeros) {
            if (numero >= 0) {
                numerosPositivos++;
            } else {
                numerosNegativos++;
            }
        }
        System.out.println("Hay " + numerosPositivos + " números positivos.");
        System.out.println("Hay " + numerosNegativos + " números negativos.");
    }
}
