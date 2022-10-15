public class ex1_metodos {
    public static void main(String[] args) {

        ex1_metodos metodo = new ex1_metodos();
        metodo.setNum1(20d);
        metodo.setNum2(30d);
        System.out.println(metodo.somar());

        metodo.setHoraDia(20);
        metodo.horarioDoDia();

        metodo.setVlrEmprestimo(1000);
        metodo.setParcela(2);
        System.out.println(metodo.calculaValorEmprestimo());

    }

    private Double num1;
    private Double num2;
    private static int horaDia;
    private int parcela;
    private double taxa;
    private double vlrEmprestimo;

    /**
     * @return Double return the num1
     */
    public Double getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    /**
     * @return Double return the num2
     */
    public Double getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double somar() {
        Double somar = getNum1() + getNum2();
        return somar;
    }

    public Double subtrair() {
        Double subtrair = getNum1() + getNum2();
        return subtrair;
    }

    public Double multiplicar() {
        Double multiplicar = getNum1() + getNum2();
        return multiplicar;
    }

    public Double dividir() {
        Double dividir = getNum1() + getNum2();
        return dividir;
    }

    /**
     * @return int return the horaDia
     */
    public static int getHoraDia() {
        return horaDia;
    }

    /**
     * @param horaDia the horaDia to set
     */
    public void setHoraDia(int horaDia) {
        this.horaDia = horaDia;
    }

    public static void horarioDoDia() {
        int horario = getHoraDia();

        if (horario > 18 || horario < 06) {
            MensagemBoaNoite();
        } else if (horario > 06 || horario < 12) {
            MensagemBomDia();
        } else {
            MensagemBoaTarde();
        }

    }

    public static void MensagemBomDia() {
        System.out.println("Bom dia");
    }

    public static void MensagemBoaNoite() {
        System.out.println("Boa noite");
    }

    public static void MensagemBoaTarde() {
        System.out.println("Boa tarde");
    }

    /**
     * @return int return the parcela
     */
    public int getParcela() {
        return parcela;
    }

    /**
     * @param parcela the parcela to set
     */
    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    /**
     * @return double return the taxa
     */
    public double getTaxa() {
        return taxa;
    }

    /**
     * @return double return the vlrEmprestimo
     */
    public double getVlrEmprestimo() {
        return vlrEmprestimo;
    }

    /**
     * @param vlrEmprestimo the vlrEmprestimo to set
     */
    public void setVlrEmprestimo(double vlrEmprestimo) {
        this.vlrEmprestimo = vlrEmprestimo;
    }

    public double calculaValorEmprestimo() {

        Double vlrEmprestimo = getVlrEmprestimo();
        int parcelas = getParcela();
        Double vlrFinalEmprestimo;

        if (parcelas == 1) {
            vlrFinalEmprestimo = (vlrEmprestimo * 0.010) + vlrEmprestimo;
            return vlrFinalEmprestimo;
        } else if (parcelas == 2) {
            vlrFinalEmprestimo = (vlrEmprestimo * 0.020) + vlrEmprestimo;
            return vlrFinalEmprestimo;
        } else {
            return (vlrEmprestimo);
        }
    }

}
