package com.company;

public class Main {

    public static void main(String[] args) {
        String[] mySupplyArray = {
                "Vanilla Ice Cream", "Chocolate Ice Cream", "Peanuts", "Chocolate syrup",
                "Carmel syrup", "Whipped Cream", "Cherries"
        };   //declare and allocate memory for array size

        //Display mySupplyArray
        for(int i = 0; i < mySupplyArray.length; i++) {
            System.out.println(mySupplyArray[i]);
        }
    }
}
