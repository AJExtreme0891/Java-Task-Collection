import java.util.*;

public class PolynomialSolver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Degree of the polynomial:");
        int deg = sc.nextInt();
        sc.nextLine(); // consume newline

        int numCoeffs = deg + 1;
        List<double[]> equations = new ArrayList<>();
        List<Double> results = new ArrayList<>();

        while (true) {
            System.out.println("\nEnter condition type (f, f', f'', exit):");
            String type = sc.nextLine();

            if (type.equalsIgnoreCase("exit")) break;

            System.out.println("Enter x0:");
            double x0 = sc.nextDouble();
            sc.nextLine();

            double y0 = 0;
            if (!type.equals("'") && !type.equals("''")) {
                System.out.println("Enter y0:");
                y0 = sc.nextDouble();
                sc.nextLine();
            }

            double[] eq = new double[numCoeffs];

            for (int i = 0; i <= deg; i++) {
                switch (type) {
                    case "f":
                        eq[i] = Math.pow(x0, i);
                        break;
                    case "f'":
                        eq[i] = (i == 0) ? 0 : i * Math.pow(x0, i - 1);
                        break;
                    case "f''":
                        eq[i] = (i <= 1) ? 0 : i * (i - 1) * Math.pow(x0, i - 2);
                        break;
                    default:
                        System.out.println("Unknown type, skipping...");
                        eq = null;
                        break;
                }
            }
            if (eq != null) {
                equations.add(eq);
                results.add(y0);
            }
        }

        if (equations.size() < numCoeffs) {
            System.out.println("Not enough equations to solve for all coefficients.");
            return;
        }

        double[][] A = new double[numCoeffs][numCoeffs];
        double[] B = new double[numCoeffs];
        for (int i = 0; i < numCoeffs; i++) {
            A[i] = equations.get(i);
            B[i] = results.get(i);
        }

        double[] solution = gaussianElimination(A, B);

        System.out.println("\nPolynomial coefficients (a0 + a1*x + ...):");
        for (int i = 0; i < solution.length; i++) {
            System.out.printf("a%d = %.5f\n", i, solution[i]);
        }
    }

    // Simple Gaussian elimination
    public static double[] gaussianElimination(double[][] A, double[] B) {
        int n = B.length;
        for (int i = 0; i < n; i++) {
            // Pivot
            int max = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(A[k][i]) > Math.abs(A[max][i])) max = k;
            }
            double[] temp = A[i];
            A[i] = A[max];
            A[max] = temp;

            double t = B[i];
            B[i] = B[max];
            B[max] = t;

            // Eliminate
            for (int k = i + 1; k < n; k++) {
                double factor = A[k][i] / A[i][i];
                B[k] -= factor * B[i];
                for (int j = i; j < n; j++) {
                    A[k][j] -= factor * A[i][j];
                }
            }
        }

        // Back-substitution
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = B[i];
            for (int j = i + 1; j < n; j++) {
                sum -= A[i][j] * x[j];
            }
            x[i] = sum / A[i][i];
        }
        return x;
    }
}