public class ex6 {

    /**
     * Faça um programa que imprima na tela os números de 1 a 20, um abaixo do
     * outro. Depois modifique o programa para que ele mostre os números um ao lado
     * do outro.
     */
    public static void main(String[] args) {
        int numInicial = 0;
        int numFinal = 20;

        while (numInicial < numFinal) {
            numInicial += 1;
            System.out.println( numInicial);

        }

        System.out.println("--------------------");
        while (numInicial < numFinal) {
            numInicial += 1;
            System.out.printf(numInicial + " ");
        }
    }
}
