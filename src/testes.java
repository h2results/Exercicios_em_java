import java.util.Scanner;

public class testes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = 5;
        int B = 20;
        int soma = 0;
        // ACHAR OS MULTIPLOS DENTRO DE UM PERIODO
        for (int i = 1; i <= B; i++) {
            if (i % A == 0) {
                soma += i;
            }
        }

    }
}
