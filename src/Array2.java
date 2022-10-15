import java.util.Random;

public class Array2 {
    public static void main(String[] args) {

        Random random = new Random();
        int[][] arraymulti = new int[4][4];

        for (int i = 0; i < arraymulti.length; i++) {
            for (int x = 0; x < arraymulti[i].length; x++) {
                arraymulti[i][x] = random.nextInt(9);
            }
        }

        for (int[] linha : arraymulti) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

    }
}
