import javax.swing.JOptionPane;

public class ex5 {
    /*
     * Supondo que a população de um país A seja da ordem de 80000 habitantes com
     * uma taxa anual de crescimento de 3% e que a população de B seja 200000
     * habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule
     * e escreva o número de anos necessários para que a população do país A
     * ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
     * 
     * Altere o programa anterior permitindo ao usuário informar as populações e as
     * taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
     */
    public static void main(String[] args) {

        String populacao1 = JOptionPane.showInputDialog("Insira a poputalão 1");
        int populacao_1_convertida = Integer.valueOf(populacao1);

        String taxa1 = JOptionPane.showInputDialog("Insira a taxa de cresimento da população 1");
        double taxa_1_Convertida = Double.valueOf(taxa1);

        String populacao2 = JOptionPane.showInputDialog("Insira a poputalão 2");
        int populacao_2_convertida = Integer.valueOf(populacao2);

        String taxa2 = JOptionPane.showInputDialog("Insira a taxa de cresimento da população 2");
        double taxa_2_Convertida = Double.valueOf(taxa2);

        int ano = 0;

        while (populacao_1_convertida < populacao_2_convertida || populacao_2_convertida < populacao_1_convertida) {
            populacao_1_convertida += populacao_1_convertida * (taxa_1_Convertida / 100);
            populacao_2_convertida += populacao_2_convertida * (taxa_2_Convertida / 100);
            ano += 1;

        }

        System.out.println(ano);

    }
}
