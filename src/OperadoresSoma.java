import java.util.Scanner;

public class OperadoresSoma {

    public static void main(String[] args){

        int v1, v2;
        float v3;


        Scanner tec = new Scanner(System.in);

        System.out.println("----- CALCULADORA -----");
        System.out.print("Informe o 1°número: \n> ");
        v1 = tec.nextInt();

        System.out.print("Informe o 2°número: \n> ");
        v2 = tec.nextInt();

        v3 = v1 + v2;
        System.out.printf("\n         Soma: %d + %d = %.1f\n", v1, v2, v3);

        v3 = v1 - v2;
        System.out.printf("    Subtração: %d - %d = %.1f\n", v1, v2, v3);


        v3 = v1 * v2;
        System.out.printf("Multiplicação: %d x %d = %.1f\n", v1, v2, v3);

        v3 = v1 / v2;
        System.out.printf("      Divisão: %d / %d = %.1f\n", v1, v2, v3);

        v3 = v1 % v2;
        System.out.printf("          Resto: %d % %d = %.1f", v1, v2, v3);

    }

}
