package KI304.Velykochlovik.Lab3;

import java.io.FileNotFoundException;

/**
 * Підклас Dog — "Піддослідний пес".
 * Реалізує інтерфейс Testable та зберігає історію тестів.
 */
public class ExperimentalDog extends Dog implements Testable {
    private StringBuilder testHistory;

    /**
     * Конструктор.
     * @param name ім'я собаки
     * @param age вік собаки
     * @throws FileNotFoundException якщо файл логу не створено
     */
    public ExperimentalDog(String name, int age) throws FileNotFoundException {
        super(name, age);
        testHistory = new StringBuilder();
        fout.println(getName() + " — створено як піддослідний пес.");
        fout.flush();
    }

    /**
     * Виконати тест. Логує результат (симульовано) і зберігає в історію.
     * @param testName назва тесту
     */
    @Override
    public void performTest(String testName) {
        // Симуляція результату тесту
        String result = testName + ": Успішно пройдено";
        // Можеш додати логіку для випадкових невдач, перевірок тощо
        testHistory.append(result).append(System.lineSeparator());
        fout.println(getName() + " — виконує тест: " + testName + " -> " + result);
        fout.flush();
    }

    /**
     * Повернути текстовий звіт з результатами тестів.
     * @return результати тестів як рядок
     */
    @Override
    public String getTestResults() {
        return testHistory.toString();
    }

    /**
     * Приклад розширеного методу — піддослідний пес може реагувати по-особливому на команду "sit"
     */
    @Override
    public void sit() {
        super.sit();
        fout.println(getName() + " (піддослідний) — додаткова перевірка пози після сідання.");
        fout.flush();
    }
}
