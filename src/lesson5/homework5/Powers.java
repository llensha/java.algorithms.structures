package lesson5.homework5;

public class Powers {

    public static void main(String[] args) {

        System.out.println(getPow(2,1));
        System.out.println(getPow(2,3));
        System.out.println(getPow(5,-2));
        System.out.println(getPow(-5,2));
        System.out.println(getPow(-5,3));
        System.out.println(getPow(3,-1));
        System.out.println(getPow(0,2));

    }

    private static double getPow(int n, int pow) {
        if (n == 0) {
            throw new IllegalArgumentException("Основание должно быть не нулевым!");
        } else if (pow == 1) {
            return n;
        } else if (pow < 0) {
            return 1.0 / multiply(1, n, -pow);
        } else {
            return multiply(1, n, pow);
        }
    }

    private static int multiply(int calc, int n, int pow) {
        if (pow <= 0) {
            return calc;
        }
        return multiply(calc * n, n, pow - 1);
    }
}
