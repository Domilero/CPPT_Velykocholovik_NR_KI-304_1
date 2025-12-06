package KI304.Velykochlovik.Lab6;

/**
 * Клас, що описує харчовий продукт.
 */
public class Product implements HouseholdItem {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
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
        System.out.println("🍎 Продукт: " + name + ", Ціна: " + price + " грн");
    }
}
