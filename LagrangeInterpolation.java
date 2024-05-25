import java.util.Scanner;

public class LagrangeInterpolation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data tegangan (x) dan waktu patah (y)
        double[] x = {5, 10, 15, 20, 25, 30, 35, 40};
        double[] y = {40, 30, 25, 40, 18, 20, 22, 15};

        System.out.print("Masukkan nilai x untuk interpolasi (5 <= x <= 40): ");
        double xi = scanner.nextDouble();
        scanner.close();

        double yi = interpolateLagrange(x, y, xi);
        System.out.println("Hasil interpolasi Lagrange di x = " + xi + " adalah y = " + yi);
    }

    public static double interpolateLagrange(double[] x, double[] y, double xi) {
        int n = x.length;
        double yi = 0.0;

        for (int i = 0; i < n; i++) {
            double term = y[i];
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    term *= (xi - x[j]) / (x[i] - x[j]);
                }
            }
            yi += term;
        }
        return yi;
    }
}
