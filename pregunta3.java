import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

          double euros;
          double pesetas;
           Scanner s = new Scanner(System.in);
          System.out.printf("ingrese la cantidad de euros ");
          euros = s.nextDouble();
          
          pesetas= euros *166.3860;
           System.out.println(euros + " euros son " + pesetas + " pesetas.");
    }
}
