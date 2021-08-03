import trainee.codeplays.calculatorprogram.calculator.Calculator;

public class Program {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double num1 = 3;
        double num2 = 6;
        double sum = calculator.sum(num1, num2);
        System.out.println("The sum between " + num1 + " + " + num2 + " is equals as " + sum);

        int num3 = 4;
        double squareRoot = calculator.squareRoot(num3);
        System.out.println("The square root of " + num3 + " is " + squareRoot);

        int num4 = 3;
        boolean isNumberOdd = calculator.isOdd(num4);
        System.out.println(num4 + " is number odd? The answer is " + isNumberOdd);
    }

}
