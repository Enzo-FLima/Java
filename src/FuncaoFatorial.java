import java.util.Scanner;

public class FuncaoFatorial {

    public static void main(String[] args) {
        Fatorial f = new Fatorial();

        Scanner tec = new Scanner(System.in);

        System.out.println("---- Calculadora de fatorial ----");
        System.out.print("Informe o valor: \n> ");
        int n = tec.nextInt();

        f.setValor(n);
        System.out.print(f.getFormula() + " ");
        System.out.println(f.getFatorial());

    }

}
