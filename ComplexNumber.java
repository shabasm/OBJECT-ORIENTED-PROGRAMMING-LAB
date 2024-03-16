public class ComplexNumber {
    double real;
    double img;
   
   
    ComplexNumber(double r, double i) {
        real = r;
        img = i;
    }

   
    ComplexNumber() {}

   
    ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber temp = new ComplexNumber();
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }

    public static void main(String args[]) {
        ComplexNumber c1 = new ComplexNumber(2.3, 5.2);
        ComplexNumber c2 = new ComplexNumber(3.2, 3.5);
        ComplexNumber temp1 = new ComplexNumber();
        temp1 = temp1.sum(c1, c2);
        System.out.println("Sum is: " + temp1.real + " + " + temp1.img + "i");
    }
}