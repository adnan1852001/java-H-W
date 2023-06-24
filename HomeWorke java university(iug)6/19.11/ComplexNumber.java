import java.text.DecimalFormat;

public class ComplexNumber {

    private double realNumber;
    private double complexNumber;

    public ComplexNumber(double a, double b) {
        this.realNumber = a;
        this.complexNumber = b;
    }

    public ComplexNumber(double a) {
        this(a, 0);
    }

    public ComplexNumber() {
        this(0, 0);
    }

    public ComplexNumber add(ComplexNumber complex) {
        return new ComplexNumber((realNumber + complex.realNumber), (complexNumber + complex.complexNumber));
    }

    public ComplexNumber multiple(ComplexNumber complex) {
        return new ComplexNumber((realNumber * complex.realNumber - complexNumber * complex.complexNumber),
                (complexNumber * complex.realNumber + realNumber * complex.complexNumber));
    }

    @Override
    public String toString() {
        if (complexNumber == 0)
            return realNumber + "";

        DecimalFormat decimal = new DecimalFormat("#.###");
        return "(" + decimal.format(realNumber) + " + " + decimal.format(complexNumber) + "i)";
    }

}