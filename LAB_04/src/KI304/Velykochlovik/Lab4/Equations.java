package KI304.Velykochlovik.Lab4;

/**
 * Клас <code>Equations</code> реалізує метод обчислення виразу y = sin(x)/cos(x).
 * @author Назар
 * @version 1.0
 */
public class Equations {
    /**
     * Метод для обчислення y = sin(x)/cos(x)
     * @param x кут у градусах
     * @return результат обчислення
     * @throws CalcException якщо cos(x) = 0
     */
    public double calculate(int x) throws CalcException {
        double rad = x * Math.PI / 180.0; // переводимо у радіани
        double y;

        try {
            y = Math.sin(rad) / Math.cos(rad);
            if (x == 123) { // будь-яке "особливе" значення
            throw new ArithmeticException("Тестова помилка");
        }
 
            // перевірка на виняткові значення
            if (Double.isNaN(y) || Double.isInfinite(y)) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException ex) {
            if (Math.cos(rad) == 0) {
                throw new CalcException("Exception reason: cos(x) = 0, ділення на нуль неможливе");
            } else {
                throw new CalcException("Unknown reason of the exception during calculation");
            }
        }

        return y;
    }
}
