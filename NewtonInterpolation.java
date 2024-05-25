import java.util.Scanner;

public class NewtonInterpolation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data tegangan (x) dan waktu patah (y)
        double[] x = {5, 10, 15, 20, 25, 30, 35, 40};
        double[] y = {40, 30, 25, 40, 18, 20, 22, 15};

        System.out.print("Masukkan nilai x untuk interpolasi (5 <= x <= 40): ");
        double xi = scanner.nextDouble();
        scanner.close();

        double yi = interpolateNewton(x, y, xi);
        System.out.println("Hasil interpolasi Newton di x = " + xi + " adalah y = " + yi);
    }

    public static double interpolateNewton(double[] x, double[] y, double xi) {
        int n = x.length;
        double[] dividedDifferences = new double[n];
        System.arraycopy(y, 0, dividedDifferences, 0, n);

        for (int i = 1; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                dividedDifferences[j] = (dividedDifferences[j] - dividedDifferences[j - 1]) / (x[j] - x[j - i]);
            }
        }

        double yi = dividedDifferences[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            yi = yi * (xi - x[i]) + dividedDifferences[i];
        }

        return yi;
    }
}
