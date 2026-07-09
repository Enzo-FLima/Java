import java.util.Scanner;

public class ConvertendoTipos {

    public static void main(String[] args){

        int idade;
        String valor;

        Scanner teclado = new Scanner(System.in);

        /*
        System.out.print("Informe a idade: \n> ");
        idade = teclado.nextInt();

        valor = Integer.toString(idade);

        System.out.printf("\nA idade informada foi %s\n", valor);
        */

        //------------------------------------------------------------

        valor = "30";
        idade = Integer.parseInt(valor);

        System.out.printf("\nA idade é %d\n", idade);

        //------------------------------------------------------------

        valor = "30.53";
        float idade2 = Float.parseFloat(valor);

        System.out.printf("\nA idade é %.2f\n", idade2);
    }

}
