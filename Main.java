public class Main {
    public static void main(String[] args) {
        testLagrange();
        testNewton();
    }

    public static void testLagrange() {
        double[] x = {5, 10, 15, 20, 25, 30, 35, 40};
        double[] y = {40, 30, 25, 40, 18, 20, 22, 15};
        double[] testPoints = {7.5, 12.5, 22.5, 32.5};

        System.out.println("Testing Lagrange Interpolation:");
        for (double xi : testPoints) {
            double yi = LagrangeInterpolation.interpolateLagrange(x, y, xi);
            System.out.println("Interpolasi di x = " + xi + " menghasilkan y = " + yi);
        }
    }

    public static void testNewton() {
        double[] x = {5, 10, 15, 20, 25, 30, 35, 40};
        double[] y = {40, 30, 25, 40, 18, 20, 22, 15};
        double[] testPoints = {7.5, 12.5, 22.5, 32.5};

        System.out.println("Testing Newton Interpolation:");
        for (double xi : testPoints) {
            double yi = NewtonInterpolation.interpolateNewton(x, y, xi);
            System.out.println("Interpolasi di x = " + xi + " menghasilkan y = " + yi);
        }
    }
}
