package com.driver;

public class Pizza {
    private String a;

    private int price;
    private Boolean isVeg;
    private String bill;

    private int vegBasePrice = 300;
    private int non_vegBasePrice = 400;
    private int base;
    private int extraCheese = 80;
    private int extraCh;
    private int extraToppings = 70;

    private int extraToppingsNon_veg = 120;
    private int extraTop;
    private int paperBag = 20;
    private int pprbag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price+=vegBasePrice;
            base=vegBasePrice;
        }else{
            price+=non_vegBasePrice;
            base=non_vegBasePrice;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCh==0) {
            price += extraCheese;
            extraCh = extraCheese;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraTop==0) {
            if (isVeg) {
                price += extraToppings;
                extraTop = extraToppings;
            } else {
                price += extraToppingsNon_veg;
                extraTop = extraToppingsNon_veg;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(pprbag==0) {
            price += paperBag;
            pprbag = paperBag;
        }
    }

    public String getBill(){
        // your code goes here
        bill="Base Price Of The Pizza: "+base+"\n";
        if(extraCh!=0){
            bill+="Extra Cheese Added: "+extraCheese+"\n";
        }
        if(extraTop!=0){
            bill+="Extra Toppings Added: "+extraTop+"\n";
        }
        if(pprbag!=0){
            bill+="Paperbag Added: "+pprbag+"\n";
        }
        bill+="Total Price: "+price+"\n";
        return this.bill;
    }
}