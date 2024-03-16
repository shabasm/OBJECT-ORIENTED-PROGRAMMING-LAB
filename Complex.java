public class Complex {
    double realPart;
    double imaginaryPart;

    Complex(double real, double imaginary) {
        realPart = real;
        imaginaryPart = imaginary;
    }

    Complex() {
    }

    Complex sum(Complex complex1, Complex complex2) {
        Complex result = new Complex();
        result.realPart = complex1.realPart + complex2.realPart;
        result.imaginaryPart = complex1.imaginaryPart + complex2.imaginaryPart;
        return result;
    }

    public static void main(String args[]) {
        Complex complex1 = new Complex(2.3, 5.2);
        Complex complex2 = new Complex(3.2, 3.5);
        Complex sumResult = new Complex();
        sumResult = sumResult.sum(complex1, complex2);
        System.out.println("Sum is: " + sumResult.realPart + " + " + sumResult.imaginaryPart + "i");
    }
}
