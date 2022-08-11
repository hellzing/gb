package homework4;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FunctionTest {
    @Test
    @DisplayName("Метод проверки функции расчета площади треугольника по трем сторонам")
    void testTrinagleArea () {
        Assertions.assertEquals(6.0, Function.triangleArea(3, 4, 5), 0.1);
    }
    @Test
    @DisplayName("Метод проверки на отрицательное значение")

    void testInput () {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            Assertions.assertEquals(6.0, Function.triangleArea(3, -4, 5), 0.1);
        });
        String expectedMessage = "Недопустимое значение";
        String actualMessage = exception.getMessage();
    }
}
