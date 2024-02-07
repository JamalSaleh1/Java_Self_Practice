package day11_practice_tasks;

import java.util.Locale;

public class Pizza {

    public String size;
    public int numberOfCheeseToppings;
    public int numberOfPepperoniToppings;

    public Pizza(String size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        this.size = size;
        this.numberOfCheeseToppings = numberOfCheeseToppings;
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public double calcCost(){
        double baseCost;
        switch (size.toLowerCase()){
            case "small":
                baseCost = 10;
            break;
            case "medium":
                baseCost = 12;
            break;
            case "large":
                baseCost = 14;
            break;
            default:
                baseCost = 0;
            break;
        }
        double toppingCost = 2 * (numberOfCheeseToppings + numberOfPepperoniToppings);
        return baseCost + toppingCost;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                "Total cost = " + calcCost() +
                '}';
    }
}
