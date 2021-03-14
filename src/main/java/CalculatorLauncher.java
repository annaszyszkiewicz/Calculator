public class CalculatorLauncher {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("5*3=" + c.multiplication(5,3));
        System.out.println("5/3=" + c.division(5,3));
    }
}
