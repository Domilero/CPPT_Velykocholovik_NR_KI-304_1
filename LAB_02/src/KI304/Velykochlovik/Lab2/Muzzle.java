package KI304.Velykochlovik.Lab2;

/**
 * Клас <code>Muzzle</code> реалізує морду собаки
 */
public class Muzzle {
    private boolean openMouth;

    public Muzzle() {
        this.openMouth = false;
    }

    public void open() {
        openMouth = true;
    }

    public void close() {
        openMouth = false;
    }

    public boolean isOpen() {
        return openMouth;
    }
}
