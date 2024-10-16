public class Pizza {
    private int price;
    private Boolean veg;

    private int exCheesePrice = 100;
    private int exToppingPrice = 150;
    private int bagPack = 50;
    private int basePizza;

    private boolean isExtraCheese = false;
    private boolean isExtraTopping = false;
    private boolean isTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        basePizza = this.price;
    }
    public void addExtraCheese(){
        this.price+= exCheesePrice;
        isExtraCheese = true;
    }
    public void addExtraToppings(){
        this.price+= exToppingPrice;
        isExtraTopping = true;
    }
    public void takeAway(){
        this.price+= bagPack;
        isTakeAway = true;
    }
    public void getBill(){
        System.out.println("-:Your Pizza Bill:-");
        String bill="";
        System.out.println("Base Pizza: " + this.basePizza);
        if(isExtraCheese){
            bill += "Extra Cheese: " + exCheesePrice + "\n";
        }
        if (isExtraTopping){
            bill += "Extra Topping: " + exToppingPrice + "\n";
        }
        if (isTakeAway){
            bill += "Take Away Charges: " + bagPack + "\n";
        }
        bill+= "Total Bill: "+ this.price + "\n";
        System.out.println(bill);
    }
}
