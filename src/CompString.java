public class CompString {

    public static void main(String[] args){

        String nome1 = "Enzo";
        String nome2 = new String("Enzo");
        String res;

        res = (nome1.equals(nome2))?"Igual":"Diferente";
        System.out.println(res);

    }

}
