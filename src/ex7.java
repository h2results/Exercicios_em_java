import javax.swing.JOptionPane;

public class ex7 {
    /*
     * Faça um programa que leia 5 números e informe o maior número
     */
    public static void main(String[] args) {

        int a = 0;
        int b = 5;
        int maior = -9999;

        while (a < b) {
            String num = JOptionPane.showInputDialog("Insira um número");
            int num_convertido = Integer.parseInt(num);
            if (num_convertido > maior) {
                maior = num_convertido;
            }
            a++;
        }
        System.out.println(maior);

    }
}
