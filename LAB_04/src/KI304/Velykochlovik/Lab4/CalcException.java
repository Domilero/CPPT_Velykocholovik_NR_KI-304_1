package KI304.Velykochlovik.Lab4;

/**
 * Class <code>CalcException</code> уточнює стандартний ArithmeticException
 * для більш точного опису помилок обчислення.
 * @author Назар
 * @version 1.0
 */
public class CalcException extends ArithmeticException {
    public CalcException() {}

    public CalcException(String cause) {
        super(cause);
    }
}
