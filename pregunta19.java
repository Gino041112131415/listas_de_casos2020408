import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int altura;
        int longitud_Palo_Horizontal;

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese la altura: ");
        altura = s.nextInt();
        
        if (altura < 1) {
            System.out.println("La altura debe ser un entero positivo.");
            return;
        }
        longitud_Palo_Horizontal = altura - 1;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == altura - 1 || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
