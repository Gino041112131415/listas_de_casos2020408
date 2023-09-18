import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            int  salario_semanal , horas_trabajadas;
            final int horas_ordinarias= 12;
            final int horas_extras = 16;
            final int horas_normales=40;
           Scanner s = new Scanner(System.in);
          System.out.printf("ingrese la cantidad de hora que realizo en su trabajo :" );
          horas_trabajadas= s.nextInt();
          
             if  (horas_trabajadas>0 && horas_trabajadas<=40){
                 salario_semanal= horas_ordinarias * horas_trabajadas; 
            }
             else{
                  salario_semanal= horas_ordinarias * horas_normales + ( horas_extras*
                  (horas_trabajadas-40));
            }

     System.out.println("su salario semanal es:" + salario_semanal  + " euros " );
            }
    }
