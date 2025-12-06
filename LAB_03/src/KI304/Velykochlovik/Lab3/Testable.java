package KI304.Velykochlovik.Lab3;

/**
 * Інтерфейс для об'єктів, які можуть брати участь у тестуванні.
 */
public interface Testable {
    /**
     * Виконати тест з іменем testName.
     * @param testName назва тесту
     */
    void performTest(String testName);

    /**
     * Повернути текстовий звіт з результатами тестів.
     * @return результати тестів
     */
    String getTestResults();
}
