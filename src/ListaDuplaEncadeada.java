import java.util.Scanner;

public class ListaDuplaEncadeada {

    /*
     * Construir um programa em Java que implemente uma lista DUPLAMENTE encadeada.
     * O programa deverá possuir as seguintes opções no menu:
     * - inserir no inicio
     * - inserir no fim
     * - inserir no meio
     * - apresentar a quantidade de elementos da lista (criar funcao)
     * - inserir 10 elementos sorteados //sorteio inclusive se é inicio, meio ou fim)
     * - apresentar lista
     * - remover elemento
     * - sair
     */



    public static void main(String[] args) {
        int op;

        Scanner tec = new Scanner(System.in);

        do {
            System.out.println("1. Inserir no inicio");
            System.out.println("2. Inserir no fim");
            System.out.println("3. Inserir no meio");
            System.out.println("4. Apresentar a quantidade de elementos da lista");
            System.out.println("5. Inserir 10 elementos aleatorios");
            System.out.println("6. Mostrar lista");
            System.out.println("7. Remover elemento");
            System.out.println("8. Sair");
            System.out.print("Opção: ");
            op = tec.nextInt();

            switch (op){
                case 1:
                    //inserirInicio
                    break;
                case 2:
                    //inserirFim
                    break;
                case 3:
                    //inserirMeio
                    break;
                case 4:
                    //Apresenta
                    break;
                case 5:
                    //InserirAleatorio
                    break;
                case 6:
                    //mostra
                    break;
                case 7:
                    //remove
                    break;
            }

        } while (op != 8);

    }

}
