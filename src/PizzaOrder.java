//ZAHRA ESPARGHAMI 230404904
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PizzaOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Pizza boyutunu seçiniz (SMALL, MEDIUM, LARGE): ");
            PizzaSize size = PizzaSize.valueOf(scanner.nextLine().toUpperCase());

            System.out.println("Malzemeleri seçiniz (PEPPERONI, MUSHROOMS, ONIONS, SAUSAGE, MOZZARELLA");
            String[] toppingsInput = scanner.nextLine().toUpperCase().split(",");
            List<Topping> toppings = new ArrayList<>();
            for (String topping : toppingsInput) {
                toppings.add(Topping.valueOf(topping.trim()));
            }
            double basePrice = 10.0;
            Pizza pizza = new Pizza(size, toppings, basePrice);
            System.out.println(pizza.getDescription());
        }
    }

