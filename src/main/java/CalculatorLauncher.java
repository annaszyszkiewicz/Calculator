public class CalculatorLauncher {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("5+3=" + c.addition(5,3));
        System.out.println("5-3=" + c.subtraction(5,3));
    }
}
