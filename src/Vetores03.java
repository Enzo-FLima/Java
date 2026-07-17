import java.util.Arrays;
import java.util.Random;

public class Vetores03 {

    public static void main(String[] args){
        int x, v[] = new int[10];

        Random rand = new Random();

        for(x = 0; x < 10; x++){
            v[x] = rand.nextInt(100) + 1;

            System.out.println("Posição " + x + " = " + v[x]);
        }

        Arrays.sort(v);

        System.out.println("\n-------- Vetor organizado --------");
        for(x = 0; x < 10; x++){
            System.out.println("Posição " + x + " = " + v[x]);
        }

    }

}
