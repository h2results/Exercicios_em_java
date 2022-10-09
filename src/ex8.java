import javax.swing.JOptionPane;

public class ex8 {
    /*
     * Faça um programa que leia 5 números e informe a soma e a média dos números.
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        double soma = 0;
        double media = 0;
        int count = 0;

        while (a < b) {
            String numero = JOptionPane.showInputDialog("Informe um número");
            double numero_convertido = Double.parseDouble(numero);
            soma += numero_convertido;
            count++;
            a++;
        }
        media = soma / count;

        System.out.println("Soma = " + soma);
        System.out.println("Media = " + media);

    }
}
