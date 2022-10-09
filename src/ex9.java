public class ex9 {
    /*
     * Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
     */
    public static void main(String[] args) {

        int a = 0;
        int b = 50;

        while (a < b) {
            if (a % 2 == 1) {
                System.out.println(a);
            }
            a++;
        }

    }
}
