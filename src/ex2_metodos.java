public class ex2_metodos {
    public static void main(String[] args) {
        calculaArea(20);
        calculaArea(20, 30);
        calculaArea(20, 30, 5);
    }

    public static void calculaArea(double lado) {
        double calcula = lado * lado;
        System.out.println(calcula);
    }

    public static void calculaArea(double base, double altura) {
        double calcula = base * altura;
        System.out.println(calcula);
    }

    public static void calculaArea(double base, double altura, double base2) {
        double calcula = ((base * base2) * altura) / 2;
        System.out.println(calcula);
    }

    // ---------------------------------------------------------------------------

    public double calculaArea1(double lado) {
        double calcula = lado * lado;
        return calcula;
    }

    public static double calculaArea1(double base, double altura) {
        double calcula = base * altura;
        return calcula;
    }

    public static double calculaArea1(double base, double altura, double base2) {
        double calcula = ((base * base2) * altura) / 2;
        return calcula;
    }

}
