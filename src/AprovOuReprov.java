import java.util.Scanner;

public class AprovOuReprov {

    public static void main(String[] args){

        Scanner tec = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: \n> ");
        String nome = tec.nextLine();

        System.out.printf("informe a 1° nota do(a) %s \n> ", nome);
        int n1 = tec.nextInt();

        System.out.print("Informe a 2° nota \n> ");
        int n2 = tec.nextInt();

        System.out.print("\n\n");

        float m = (n1 + n2) / 2;

        if(m >= 6){
            System.out.printf("Parabéns!! \nVocê foi APROVADO.\nSua media foi %.2f", m);
        } else {
            System.out.printf("Infelizmente você REPROVADO\nSua media foi %.2f", m);
        }

    }
}
