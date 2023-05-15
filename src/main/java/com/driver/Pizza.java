package com.driver;

public class Pizza {
    private int basePrice =  300;
    private int ExtraCheesePrice = 80;
    private int ExtraToppingsPrice = 70;
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
            this.price += basePrice;
            this.bill += "Base Price Of The Pizza: " + basePrice + "\n";
        } else {
            this.price += basePrice + 100;
            this.bill += "Base Price Of The Pizza: " + (basePrice + 100) + "\n";
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
            this.price += ExtraToppingsPrice;
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
//    Base Price Of The Pizza: 300
//    Extra Cheese Added: 80
//    Extra Toppings Added: 70
//    Paperbag Added: 20
//    Total Price: 470

    public String getBill(){
        // your code goes here
        if(flag1) {
            bill += "Extra Cheese Added: " + ExtraCheesePrice + "\n";
        }
        if(flag2) {
            bill += "Extra Toppings Added: " + ExtraToppingsPrice + "\n";
        }
        if(flag3) {
            bill += "Paperbag Added: " + PaperbagPrice + "\n";
        }
        bill += "Total Price: " + getPrice();
        return this.bill;
    }
}
