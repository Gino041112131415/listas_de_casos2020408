import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          int horas , minutos; 
           double segundos_faltantes,segundos_actuales;
          Scanner s = new Scanner(System.in);
          System.out.printf("ingrese cualquier  hora del dia  :" );
          horas= s.nextInt();
          System.out.printf("ingrese el minuto que le corresponde a la hora seleccionada entre  :" );
          minutos= s.nextInt();
        if(horas>0 && horas<=24){ 
          segundos_actuales=(3600*horas) + (60*minutos);
          
          segundos_faltantes= 24*3600 -segundos_actuales;
          System.out.println(" los segundo faltantes para la media noche es " +segundos_faltantes +" segundos"); 
        }
        else {
          System.out.println("no esta en el formato establecido o correcto");
        }
    }
}
