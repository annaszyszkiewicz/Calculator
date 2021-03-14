public class Calculator {
    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        try {
            return (double) a / b;
        } catch (ArithmeticException e) {
            return Double.NaN;
        }
    }

    public int power(int a, int b){
        return (int) Math.pow(a,b);
    }
}
