package introtojava;

//creates a basic calculator program
public class Calculator {

    //constructor Calculator
    public Calculator() {
    }

    public double add(double a, double b) {
        return a+b;
    }

    public double subtract(double a, double b) {
        return a-b;
    }

    public double multiply(double a, double b) {
        return a*b;
    }

    public double divide(double a, double b) {
        return a/b;
    }

    public double modulo(double a, double b) {
        return a%b;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.subtract(45,11));
        System.out.println(myCalculator.multiply(3,7));
        System.out.println(myCalculator.divide(10,3));
        System.out.println(myCalculator.modulo(10,3));

    }

}