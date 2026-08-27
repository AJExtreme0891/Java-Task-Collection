package Automation;
import java.util.*;

public class MagicPolynomialSolver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Degree of the polynomial:");
        int deg = sc.nextInt();
        sc.nextLine();

        int numCoeffs = deg + 1;
        List<double[]> equations = new ArrayList<>();
        List<Double> results = new ArrayList<>();

        System.out.println("Enter conditions one by one. Type 'exit' to finish.");
        while (true) {
            System.out.println("\nCondition type (f, zero, extremum, inflection, saddle, tangent, exit):");
            String type = sc.nextLine().trim().toLowerCase();

            if (type.equals("exit")) break;

            System.out.println("Enter x0:");
            double x0 = sc.nextDouble();
            sc.nextLine();

            double y0 = 0;
            if (type.equals("f") || type.equals("tangent")) {
                System.out.println("Enter y0 (for tangent enter f(x0)):");
                y0 = sc.nextDouble();
                sc.nextLine();
            }

            // For tangent to g(x), also ask for g'(x0)
            double yp = 0;
            if (type.equals("tangent")) {
                System.out.println("Enter g'(x0) (slope of tangent at x0):");
                yp = sc.nextDouble();
                sc.nextLine();
            }

            // Create equation(s)
            if (type.equals("saddle")) {
                // Sattelpunkt → f'(x0)=0 and f''(x0)=0
                double[] eq1 = derivativeEquation(x0, deg, 1);
                double[] eq2 = derivativeEquation(x0, deg, 2);
                equations.add(eq1);
                results.add(0.0);
                equations.add(eq2);
                results.add(0.0);
            } else if (type.equals("f") || type.equals("zero")) {
                double[] eq = derivativeEquation(x0, deg, 0);
                equations.add(eq);
                results.add(type.equals("zero") ? 0.0 : y0);
            } else if (type.equals("extremum")) {
                double[] eq = derivativeEquation(x0, deg, 1);
                equations.add(eq);
                results.add(0.0);
            } else if (type.equals("inflection")) {
                double[] eq = derivativeEquation(x0, deg, 2);
                equations.add(eq);
                results.add(0.0);
            } else if (type.equals("tangent")) {
                // Tangent → f(x0)=g(x0) and f'(x0)=g'(x0)
                double[] eq1 = derivativeEquation(x0, deg, 0); // f(x0)=g(x0)
                double[] eq2 = derivativeEquation(x0, deg, 1); // f'(x0)=g'(x0)
                equations.add(eq1);
                results.add(y0);
                equations.add(eq2);
                results.add(yp);
            } else {
                System.out.println("Unknown type, skipping...");
            }
        }

        if (equations.size() < numCoeffs) {
            System.out.println("Warning: Not enough equations to solve for all coefficients. May not have unique solution.");
        }

        // Prepare matrix
        double[][] A = new double[numCoeffs][numCoeffs];
        double[] B = new double[numCoeffs];
        for (int i = 0; i < Math.min(numCoeffs, equations.size()); i++) {
            A[i] = equations.get(i);
            B[i] = results.get(i);
        }

        double[] solution = gaussianElimination(A, B);

        System.out.println("\nPolynomial coefficients (a0 + a1*x + ...):");
        for (int i = 0; i < solution.length; i++) {
            System.out.printf("a%d = %.5f\n", i, solution[i]);
        }
    }

    // Returns an equation for f^(order)(x0)
    private static double[] derivativeEquation(double x0, int deg, int order) {
        double[] eq = new double[deg + 1];
        for (int i = 0; i <= deg; i++) {
            if (i < order) eq[i] = 0;
            else {
                double coeff = 1;
                for (int k = 0; k < order; k++) coeff *= (i - k);
                eq[i] = coeff * Math.pow(x0, i - order);
            }
        }
        return eq;
    }

    // Gaussian elimination
    private static double[] gaussianElimination(double[][] A, double[] B) {
        int n = B.length;
        for (int i = 0; i < n; i++) {
            // Pivot
            int max = i;
            for (int k = i + 1; k < n; k++) if (Math.abs(A[k][i]) > Math.abs(A[max][i])) max = k;
            double[] temp = A[i]; A[i] = A[max]; A[max] = temp;
            double t = B[i]; B[i] = B[max]; B[max] = t;

            for (int k = i + 1; k < n; k++) {
                double factor = A[k][i] / A[i][i];
                B[k] -= factor * B[i];
                for (int j = i; j < n; j++) A[k][j] -= factor * A[i][j];
            }
        }

        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = B[i];
            for (int j = i + 1; j < n; j++) sum -= A[i][j] * x[j];
            x[i] = sum / A[i][i];
        }
        return x;
    }
}