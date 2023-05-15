package com.driver;

public class Pizza {

    private int basePriceVeg =  300;
    private int basePriceNonVeg =  400;
    private int ExtraCheesePrice = 80;
    private int ExtraToppingsPriceVeg = 70;
    private int ExtraToppingsPriceNonVeg = 120;
    private int PaperbagPrice = 20;

    private int price = 0;
    private Boolean isVeg;
    private Boolean flag1 = false;
    private Boolean flag2 = false;
    private Boolean flag3 = false;
    private String bill = "";

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price += basePriceVeg;
            this.bill += "Base Price Of The Pizza: " + basePriceVeg + "\n";
        } else {
            this.price += basePriceNonVeg;
            this.bill += "Base Price Of The Pizza: " + basePriceNonVeg + "\n";
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!flag1) {
            this.price += ExtraCheesePrice;
            flag1 = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!flag2) {
            if(this.isVeg) {
                this.price += ExtraToppingsPriceVeg;
            } else {
                this.price += ExtraToppingsPriceNonVeg;
            }
            flag2 = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!flag3) {
            this.price += PaperbagPrice;
            flag3 = true;
        }


    }
    public String getBill(){
        // your code goes here
        if(flag1) {
            bill += "Extra Cheese Added: " + ExtraCheesePrice + "\n";
        }
        if(flag2) {
            if(this.isVeg) {
                bill += "Extra Toppings Added: " + ExtraToppingsPriceVeg + "\n";
            } else {
                bill += "Extra Toppings Added: " + ExtraToppingsPriceNonVeg + "\n";
            }
        }
        if(flag3) {
            bill += "Paperbag Added: " + PaperbagPrice + "\n";
        }
        bill += "Total Price: " + getPrice() + "\n";
        return this.bill;
    }
}
