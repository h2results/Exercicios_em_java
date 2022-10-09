import javax.swing.JOptionPane;

public class ex1 {
    /*
     * Faça um programa que peça uma nota, entre zero e dez.
     * Mostre uma mensagem caso o valor seja inválido e
     * continue pedindo até que o usuário informe um valor válido.
     */
    public static void main(String[] args) throws Exception {

        String num = JOptionPane.showInputDialog("Digite um número");
        int num1 = Integer.valueOf(num);

        while (num1 < 0 || num1 > 10) {

            JOptionPane.showMessageDialog(null, num1 + " Não é um número válido ");

            num = JOptionPane.showInputDialog("Digite um número válido");
            num1 = Integer.valueOf(num);

        }

        JOptionPane.showMessageDialog(null, num1 + " É um número válido parabens ");

    }

}
