import java.util.Random;
import java.util.Scanner;

public class MediaNota {

    public static void main(String[] args){

        Scanner tec = new Scanner(System.in);

        //Media de duas notas

        /*int n1, n2;

        System.out.print("Informe a 1° nota: \n> ");
        n1 = tec.nextInt();

        System.out.print("Informe a 2° nota \n> ");
        n2 = tec.nextInt();

        float m = (n1 + n2) / 2;

        System.out.printf("\nA média é: %.2f", m);*/

        //-----------------------------------------------------------------------------------------

        //Regerando valores randomicos

        Random ale = new Random();
        int n = ale.nextInt(10);
        ++n; //O ++ antes da variavel é utilizado para somar antes dessa variavel ser executada.
        System.out.println(n);

    }

}
