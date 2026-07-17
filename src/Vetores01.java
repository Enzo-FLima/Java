import java.util.Arrays;

public class Vetores01 {

    public static void main(String[] args){

        int n[] = {8, 2, 5, 4, 9, 1};

        Arrays.sort(n);

        System.out.println("A quantidade de itens nesse vetor é " + n.length);

        for(int x = 0; x < 6; x++){
            System.out.println("Na posição " + x + " temos o valor " + n[x]);
        }

    }

}
