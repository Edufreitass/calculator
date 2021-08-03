package trainee.codeplays.calculatorprogram.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void shouldReturnZeroWhenNoValueWereGiven() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double sum = calculator.sum();

        // Assert
        Assertions.assertEquals(0, sum);
    }

    @Test
    public void shouldReturnTheSumOfGivenValues() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double sum = calculator.sum(3, 6);

        // Assert
        Assertions.assertEquals(9, sum);
    }

    @Test
    public void shouldThrowAnExceptionWhenTheGivenNumberWereLassThenZero() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1));

        // Assert
        Assertions.assertEquals("Não existe raiz quadrada real para números negativos", exception.getMessage());
    }

    @Test
    public void shouldReturnTheSquareRootOfGivenNumber() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double result = calculator.squareRoot(4);

        // Assert
        Assertions.assertEquals(2, result);
    }

    @Test
    public void shouldReturnTrueWhenTheGivenNumberIsOdd() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        boolean isOdd = calculator.isOdd(3);

        // Assert
        Assertions.assertTrue(isOdd);
    }

    @Test
    public void shouldReturnFalseWhenTheGivenNumberIsEven() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        boolean isOdd = calculator.isOdd(2);

        // Assert
        Assertions.assertFalse(isOdd);
    }

}
