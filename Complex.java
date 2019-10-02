
public class Complex {

    public Complex() {
        this.imag = 0;
        this.real = 0;
    }

    public Complex(double real, double imag) {
        this.imag = imag;
        this.real = real;
    }

    public String ToString() {
        return "(" + real + "+" + imag + "i)";
    }

    public boolean equals(Complex c1) {
        if (c1.getReal() == this.real && c1.getImag() == this.imag) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean equals(Complex c1, Complex c2) {
        if (c1.getReal() == c2.getReal() && c1.getImag() == c2.getImag()) {
            return true;
        } else {
            return false;
        }
    }

    public static Complex multiply(Complex c1, Complex c2) {
        Complex result = new Complex((c1.getReal() * c2.getReal()) - (c1.getImag() * c2.getImag()), (c1.getReal() * c2.getImag()) + (c1.getImag() * c2.getReal()));
        return result;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public double getReal() {
        return real;
    }
    private double imag;
    private double real;

}
