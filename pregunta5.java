import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          int  euroTrabajo=12;
          int  horasRealizadas;
          Scanner s = new Scanner(System.in);
          System.out.printf("ingrese la cantidad de horas que trabajo durante la semana:" );
          horasRealizadas= s.nextInt();
          
         int salarioSemanal= horasRealizadas * euroTrabajo;
          System.out.println("su saldo correspondiente es:"+ salarioSemanal);
    }
}
