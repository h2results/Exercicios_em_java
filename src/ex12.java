public class ex12 {

    /*
     * Faça um programa que leia um vetor de 6 caracteres e diga quantas vogais
     * foram lidas
     */
    public static void main(String[] args) {

        String[] vetor = { "e", "i", "o", "a", "b", "c" };

        int vogais = 0;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int ii = 0; ii < vetor.length; ii++) {

            if (vetor[i].equalsIgnoreCase("a")) {
                a += +1;
                vogais += 1;
            } else if (vetor[i].equalsIgnoreCase("e")) {
                e += +1;
                vogais += 1;
            } else if (vetor[i].equalsIgnoreCase("i")) {
                i += +1;
                vogais += 1;
            } else if (vetor[i].equalsIgnoreCase("o")) {
                o += +1;
                vogais += 1;
            } else if (vetor[i].equalsIgnoreCase("u")) {
                u += +1;
                vogais += 1;
            }

        }

        if (a != 0)

        {
            System.out.println("Quantidade de consoantes = " + vogais);
            if (a != 0) {
                System.out.println("Quantidade de vogais A = " + a);
            } else if (e != 0) {
                System.out.println("Quantidade de vogais E = " + e);
            } else if (i != 0) {
                System.out.println("Quantidade de vogais I = " + i);
            } else if (o != 0) {
                System.out.println("Quantidade de vogais O = " + o);
            } else if (u != 0) {
                System.out.println("Quantidade de vogais U = " + u);
            }
        } else {
            System.out.println("Não houve consoantes");
        }
    }
}
