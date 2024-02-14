package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes her
        int basePrice = 300;
       if(isVeg == true){
           basePrice = 300;
           this.price = 300;
       }
       else{
           basePrice = 400;
           this.price = 400;
       }
       this.bill = "Base Price Of The Pizza: "+basePrice +"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes her
        int extraCheese = 80;
        this.price += 80;
        this.bill = bill + "Extra Cheese Added: " +extraCheese+"\n";
    }

    public void addExtraToppings(){
        // your code goes here
        int extraTopping = 70;
        if(isVeg == true){
            extraTopping = 70;
            this.price += 70;
        }
        else{
            this.price += 120;
            extraTopping = 120;
        }
        this.bill = bill + "Extra Toppings Added: "+extraTopping+"\n";
    }

    public void addTakeaway(){
        // your code goes here
        int takeAway = 20;
        this.price += 20;
        this.bill = bill + "Paperbag Added: "+takeAway+"\n";
    }

    public String getBill(){
        // your code goes here
        this.bill = bill + "Total Price: "+price;
        return this.bill;
    }
}
