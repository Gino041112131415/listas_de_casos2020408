import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double Kb, Mb;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en Mb: ");
         Mb = scanner.nextDouble();
         Kb = Mb * 1024;
        System.out.println(Mb + " Mb son " + Kb + " Kb.");
    }
}
