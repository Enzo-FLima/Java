import java.util.Scanner;

public class Vetores02 {

    public static void main(String[] args){

        Scanner tec = new Scanner(System.in);

        System.out.print("Informe o ano \n> ");
        int ano = tec.nextInt();

        String mes [] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int mes1 [] =    {31,   29,    31,    30,    31,    30,    31,    31,    30,    31,    30,    31};
        int mes2 [] =    {31,   28,    31,    30,    31,    30,    31,    31,    30,    31,    30,    31};

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println(ano + " é um ano bissexto.");
            for(int x = 0; x < 12; x++){
                System.out.println("O mês de " + mes[x] + " tem " + mes1[x] + " dias");
            }
        } else {
            System.out.println(ano + " não é um ano bissexto.");
            for(int x = 0; x < 12; x++){
                System.out.println("O mês de " + mes[x] + " tem " + mes2[x] + " dias");
            }
        }

    }

}
