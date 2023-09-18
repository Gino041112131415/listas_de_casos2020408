import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String dia;
        int hora;
        int minutos;
        int minutosFinSemana;
        int horasRestantes;

        // Solicitamos el día de la semana al usuario.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un día de la semana (de lunes a viernes): ");
        dia = scanner.nextLine();

        // Solicitamos la hora al usuario.
        System.out.print("Introduce la hora (horas y minutos): ");
        hora = scanner.nextInt();
        minutos = scanner.nextInt();

        int horaEnMinutos = hora * 60 + minutos;

        // Calculamos el número de horas que faltan para el viernes a las 15:00 h.
        switch (dia) {
            case "lunes":
                horasRestantes = 4 * 24 * 60;
                break;
            case "martes":
                horasRestantes = 3 * 24 * 60;
                break;
            case "miércoles":
                horasRestantes = 2 * 24 * 60;
                break;
            case "jueves":
                horasRestantes = 1 * 24 * 60;
            case "viernes":
                horasRestantes = 0 * 24 * 60;    
                break;
            default:
                System.out.println("El día introducido no es válido.");
                return;
        }

        // Calculamos la hora del fin de semana.
        int horaFinSemana = 15 * 60 + horasRestantes;

        // Calculamos los minutos que faltan para el fin de semana.
        minutosFinSemana = horaFinSemana - horaEnMinutos;

        System.out.println("Faltan " + minutosFinSemana + " minutos para el fin de semana.");
    }
}
