import java.util.Scanner;

public class Desafio_Busca_Sequencial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };

        int X = leitor.nextInt();

        int i = 0;

        for (i = 0; i < elementos.length; i++) {
            if (elementos[i] == X) {
                System.out.println("Achei " + elementos[i] + " na posição " + i);
                break;
            }
        }

        if (i >= elementos.length) {
            System.out.println("Numero " + X + " nao encontrado!");
        }
    }
}
