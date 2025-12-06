package KI304.Velykochlovik.Lab6;

/**
 * Клас, що описує предмет для прибирання.
 */
public class CleaningTool implements HouseholdItem {
    private String toolName;
    private double price;

    public CleaningTool(String name, double price) {
        this.toolName = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(HouseholdItem other) {
        return Double.compare(this.price, other.getPrice());
    }

    @Override
    public void print() {
        System.out.println("🧴 Інструмент: " + toolName + ", Ціна: " + price + " грн");
    }
}
