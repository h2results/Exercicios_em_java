import java.util.Random;

public class Array {
    public static void main(String[] args) {

        Random random = new Random();

        int[] arrayDeInteiro = new int[20];

        for (int i = 0; i < arrayDeInteiro.length; i++) {

            int numero = random.nextInt(100);
            arrayDeInteiro[i] = numero;

        }

        for (int numero : arrayDeInteiro) {
            System.out.print(" " + numero + " ");
        }

    }
}
