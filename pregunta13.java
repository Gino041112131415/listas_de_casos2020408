import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numero;
        int digitos = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        numero = s.nextInt();

        while (numero > 0 && digitos < 6) {
            numero /= 10;
            digitos++;
        }

        if (digitos > 5) {
            System.out.println("El número no puede tener más de 5 dígitos.");
        } 
        else {
            System.out.println("El número tiene " + digitos + " dígitos.");
        }
         
    }
}

