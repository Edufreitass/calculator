package trainee.codeplays.calculatorprogram.calculator;

public class Calculator {

    // Método para somar números
    public double sum(double... numbers) {
        double sum = 0;

        if (numbers.length > 0) {
            for (double number : numbers) {
                sum += number;
            }
        }

        return sum;
    }

    // Método para extrar a raiz quadrada de x número
    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Não existe raiz quadrada real para números negativos");
        }

        return Math.sqrt(number);
    }

    // Método para verificar se o número é ímpar
    public boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        }

        return false;
    }

}
