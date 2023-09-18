import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        int contadorI = 0;
        int sumaImpares = 0;
        int numeroMayorPar = 0;
        int contadorP = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese un número (0 para finalizar): ");
        numero = s.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                if (numero > numeroMayorPar) {
                    numeroMayorPar = numero;
                }
                contadorP++;
            } else {
                sumaImpares += numero;
                contadorI++;
            }

            System.out.print("Ingrese un número (0 para finalizar): ");
            numero = s.nextInt();
        }

        System.out.println("Se han ingresado  " + (contadorI + contadorP) + " números.");
        if (contadorI > 0) {
            System.out.println("La media de los impares es: " + (sumaImpares / contadorI));
        } else {
            System.out.println("No se han ingresado números impares.");
        }
        if (contadorP > 0) {
            System.out.println("El mayor de los pares es: " + numeroMayorPar);
        } else {
            System.out.println("No se han ingresado números pares.");
        }
