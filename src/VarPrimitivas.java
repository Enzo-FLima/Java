import java.util.Scanner;

public class VarPrimitivas {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int valor = 3;
        float nota = 7.4537f;
        char letra = 'E';
        String nome = teclado.nextLine();

        System.out.printf("\nA nota do aluno %s é %.4f\n", nome, nota);
    }

}
