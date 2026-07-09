import java.util.Scanner;

public class VarPrimitivas {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: \n> ");
        String nome = teclado.nextLine();

        System.out.printf("Informe a nota do %s: \n> ", nome);
        float nota = teclado.nextFloat();

        System.out.printf("\nA nota do aluno %s é %.2f\n", nome, nota);
    }

}
