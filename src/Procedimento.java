public class Procedimento {

    //---------- PROCEDIMENTO ----------
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("1)A soma é " + s);
    }

    //------------ FUNÇÂO ------------
    static int soma2(int a, int b){
        int s = a + b;
        return s;
    }

    public static void main(String[] args){

        soma(6, 5); // Procedimento

        int sm = soma2(5,2); // Função

        System.out.println("2)O valor da 2° soma é " + sm);

    }

}
