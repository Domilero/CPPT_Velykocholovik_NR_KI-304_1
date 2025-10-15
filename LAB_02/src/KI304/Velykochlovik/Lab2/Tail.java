package KI304.Velykochlovik.Lab2;

/**
 * Клас <code>Tail</code> реалізує хвіст собаки
 * @author Назар
 * @version 1.0
 */
public class Tail {
    private boolean wagging;

    public Tail() {
        this.wagging = false;
    }

    public void wag() {
        wagging = true;
    }

    public void stop() {
        wagging = false;
    }

    public boolean isWagging() {
        return wagging;
    }
}
