import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite um nome");

        String idade = JOptionPane.showInputDialog("Digite uma idade");
        int idade1 = Integer.parseInt(idade);

        String salario = JOptionPane.showInputDialog("Digite um salário");
        double salario1 = Double.valueOf(salario);

        String sexo = JOptionPane.showInputDialog("Digite o sexo");

        while (nome.length() < 3 || idade1 < 0 || idade1 > 150 || salario1 < 0 || sexo != "f" && sexo != "m") {

            if (nome.length() < 3) {
                JOptionPane.showMessageDialog(null, "Digite um nome maior que 3 caracteres");
                nome = JOptionPane.showInputDialog("Digite um nome válido");
            } else if (idade1 < 0 || idade1 > 150) {
                idade = JOptionPane.showInputDialog("Digite uma idade válida");
                idade1 = Integer.parseInt(idade);
            } else if (salario1 < 0) {
                salario = JOptionPane.showInputDialog("Digite um salário");
                salario1 = Double.valueOf(salario);
            } else if (sexo != "f" || sexo != "m") {
                sexo = JOptionPane.showInputDialog("Digite o sexo válido");
                System.out.println(sexo);
            }

        }

        JOptionPane.showMessageDialog(null, "Você digitou todos os dados corretamente");
    }
}
