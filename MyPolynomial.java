
public class MyPolynomial {

    public MyPolynomial(double[] coeffss) {
        coeffs = coeffss;
    }

    public int getDegree() {
        return (coeffs.length - 1);
    }

    public String ToString() {
        String result = "";

        for (int i = 0; i < coeffs.length - 1; i++) {
            result = result + coeffs[i] + "x^" + i + "+";
        }

        result = result + coeffs[coeffs.length - 1] + "x^" + (coeffs.length - 1);

        return result;

    }

    public double evaluate(double x) {
        double sum = 0;

        for (int i = 0; i < coeffs.length; i++) {
            sum = sum + coeffs[i] * Math.pow(x, i);
        }
        return sum;
    }

    public static MyPolynomial add(MyPolynomial p1, MyPolynomial p2) {

        double[] higher, lower;

        if (p1.coeffs.length >= p2.coeffs.length) {
            higher = p1.coeffs;
            lower = p2.coeffs;
        } else {
            lower = p1.coeffs;
            higher = p2.coeffs;
        }

        double[] added_coeffs = new double[higher.length];

        for (int i = 0; i < lower.length; i++) {
            added_coeffs[i] = lower[i] + higher[i];
        }

        for (int i = lower.length; i < higher.length; i++) {
            added_coeffs[i] = higher[i];
        }
        
        MyPolynomial result = new MyPolynomial(added_coeffs);
        return result;
        
    }
    public double[] coeffs;
}


