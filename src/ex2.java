import javax.swing.JOptionPane;

public class ex2 {

    /*
     * Faça um programa que leia um nome de usuário e a sua senha e não
     * aceite a senha igual ao nome do usuário, mostrando uma mensagem
     * de erro e voltando a pedir as informações.
     */

    public static void main(String[] args) {

        String usuario = JOptionPane.showInputDialog(null, "Digite um usuário");
        String senha = JOptionPane.showInputDialog(null, "Digite uma senha");

        while (usuario.equals(senha)) {

            JOptionPane.showMessageDialog(null, "Usuário e senhas iguais não são permitidos digite novamente");

            usuario = JOptionPane.showInputDialog(null, "Digite um usuário");
            senha = JOptionPane.showInputDialog(null, "Digite uma senha");

        }

        JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");

    }
}
