/*
- pepperoni: boolean
- sausage: boolean
- mushroom: boolean
- vegan: boolean
- size: char

Methods:
+ Pizza (in boolean pepperoni, in boolean sausage, in boolean mushroom, in boolean vegan, in char size)
+ getSize(): char
+ getNumToppings (): int

 */
public class Pizza
{
    private boolean pepperoni, sausage, mushroom, vegan;
    private char size;

    public Pizza(char size, boolean pepperoni, boolean sausage, boolean mushroom, boolean vegan) {
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushroom = mushroom;
        this.vegan = vegan;
        this.size = size;
    }

    @Override
    public String toString()
    {
        String ouput = "Pizza [" + "Size= " + this.size;
        if(this.pepperoni) ouput += ", Pepperoni";
        if(this.sausage) ouput += ", Sausage";
        if(this.mushroom) ouput += ", Mushroom";
        if(this.vegan) ouput += ", Vegan";
        return ouput;
    }

    public int getNumToppings()
    {
        int numToppings = 0;
        if(pepperoni) numToppings++;
        if(sausage) numToppings++;
        if(mushroom) numToppings++;
        if(vegan) numToppings++;
        return numToppings;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public boolean isSausage() {
        return sausage;
    }

    public void setSausage(boolean sausage) {
        this.sausage = sausage;
    }

    public boolean isMushroom() {
        return mushroom;
    }

    public void setMushroom(boolean mushroom) {
        this.mushroom = mushroom;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }




}
