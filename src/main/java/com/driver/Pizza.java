package com.driver;

public class Pizza {
    private int basePrice;
    private boolean isVeg;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean paperbagAdded;
    private int basePriceReal;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        if(isVeg == true){
            this.basePrice = 300;
        }
        else{
            this.basePrice = 400;
        }
        this.basePriceReal = basePrice;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            basePrice += 80;
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            basePrice += isVeg ? 70 : 120;
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        if (!paperbagAdded) {
            basePrice += 20;
            paperbagAdded = true;
        }
    }

    public int getPrice() {
        return basePrice;
    }

    public String getBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("Base Price Of The Pizza: ").append(basePriceReal).append("\n");
        if (extraCheeseAdded)
            bill.append("Extra Cheese Added: 80\n");
        if (extraToppingsAdded)
            bill.append("Extra Toppings Added: ").append(isVeg ? 70 : 120).append("\n");
        if (paperbagAdded)
            bill.append("Paperbag Added: 20\n");
        bill.append("Total Price: ").append(basePrice).append("\n");
        return bill.toString();
    }
}
