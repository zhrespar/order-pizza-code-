//ZAHRA ESPARGHAMI 230404904
import java.util.List;
enum PizzaSize {
    SMALL, MEDIUM, LARGE
}
enum Topping {
    PEPPERONI(2), MUSHROOMS(1.5), ONIONS(1), SAUSAGE(2.5), MOZZARELLA(3);
    private final double price;
    Topping(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
class Pizza {
    private PizzaSize size;
    private List<Topping> toppings;
    private double basePrice;

    public Pizza(PizzaSize size, List<Topping> toppings, double basePrice) {
        this.size = size;
        this.toppings = toppings;
        this.basePrice = 10;
    }
    public PizzaSize getSize() {
        return size;
    }
    public List<Topping> getToppings() {
        return toppings;
    }
    public double calculateTotalPrice() {
        double totalPrice = basePrice;
        switch (size) {
            case SMALL -> totalPrice += 3;
            case MEDIUM -> totalPrice += 5;
            case LARGE -> totalPrice += 7;
        }
        for (Topping topping : toppings) {
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }
    public String getDescription() {
        return "Pizza size: " + size + " toppings: " + toppings;
        }
    }
