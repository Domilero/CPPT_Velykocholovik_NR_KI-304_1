package KI304.Velykochlovik.Lab5;

/**
 * Клас <code>Equations</code> реалізує метод обчислення виразу y = sin(x)/cos(x).
 * @author Назар
 * @version 1.0
 */
public class Equations {
    /**
     * Обчислює y = sin(x)/cos(x).
     * @param x кут у градусах
     * @return результат
     * @throws CalcException коли cos(x) == 0 (ділення на нуль)
     */
    public double calculate(double x) throws CalcException {
        double rad = Math.toRadians(x);
        double cos = Math.cos(rad);
        if (Math.abs(cos) < 1e-12) { // захист від ділення на нуль
            throw new CalcException("Exception reason: cos(x) = 0, ділення на нуль неможливе");
        }
        double y = Math.sin(rad) / cos;
        if (Double.isNaN(y) || Double.isInfinite(y)) {
            throw new CalcException("Result is NaN or Infinite");
        }
        return y;
    }
}
