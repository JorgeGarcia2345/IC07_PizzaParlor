import java.text.NumberFormat;
import java.util.Arrays;

/*
- MAXPIZZAS: int
- Pizza[MAXPIZZAS]
- numPies: int
- pies: Pizza[]

Methods:

+ addPizzaToOrder(in char size, in boolean pepperoni, in boolean sausage, in boolean mushrooms)+
+ calcCost(): double


 */
public class PizzaOrder
{
    public static final int MAX_PIZZAS = 100;
    private int numPies;
    private Pizza[] pies = new Pizza[MAX_PIZZAS];


    public boolean addPizzaToOrder(char size, boolean pepperoni,boolean sausage, boolean mushrooms, boolean vegan)
    {
        if(numPies < MAX_PIZZAS) {
            pies[numPies++] = new Pizza(size, pepperoni, sausage, mushrooms, vegan);
            return true;
        }
        return false;
    }

    public double calcCost()
    {
        double cost = 0.00;
        for(int i = 0; i < numPies; i++) {
            char size = pies[i].getSize();
            switch (size) {
                case 's':
                case 'S':
                    cost += 8.00;
                    break;
                case 'm':
                case 'M':
                    cost += 10.00;
                    break;
                case 'l':
                case 'L':
                    cost += 12.00;
                    break;
            }
            cost += pies[i].getNumToppings();
        }
        return cost;

    }


    @Override
    public String toString()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        String output = "Pizza order: # of pies = " + numPies + "\n";
        //Loop through each pizza in the array
        for (int i = 0; i < numPies ; i++)
            output += "pie # " + (i +1) + ": " + pies[i] + "\n";
        output += "Total cost: " + currency.format(calcCost()) + "\n";
        return output;

    }
}


