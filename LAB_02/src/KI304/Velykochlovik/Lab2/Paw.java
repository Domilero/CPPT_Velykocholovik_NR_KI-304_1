package KI304.Velykochlovik.Lab2;

/**
 * Клас <code>Paw</code> реалізує лапу собаки
 */
public class Paw {
    private boolean lifted;

    public Paw() {
        this.lifted = false;
    }

    public void lift() {
        lifted = true;
    }

    public void putDown() {
        lifted = false;
    }

    public boolean isLifted() {
        return lifted;
    }
}
