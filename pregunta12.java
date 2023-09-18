import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numero;
        Scanner s = new Scanner(System.in);
        System.out.printf("ingrese un numero  :" );
          numero= s.nextInt();

        if ((numero % 2) == 0) {
      System.out.print("El número es par");
    } else {
      System.out.print("El número  es impar");
    }

    if ((numero % 5) == 0) {
      System.out.println(" y es divisible entre 5");
    } else {
      System.out.println(" y no es divisible entre 5");
    }
  }
}
