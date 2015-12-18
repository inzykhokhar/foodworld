package com.muhammad.foodworld;

/**
 * Created by Muhammad on 18/12/2015.
 */
public class Food {
    private String name;
    private String description;

    public static  final Food[] foods ={
            new Food("Pizza", "Make the dough\n Put the Sauce on the top and cheese\n Put it in the oven for 240C"),
            new Food ("Pasta", "Boil the water and add salt \n Put Pasta in it and the Sauce \n Stir it for 10 minutes"),
            new Food ("Lasgna", "Add minced meat in the bowl with cheese \n Add the vegetable you like \n Put it in the oven for 250C")

    };

    public Food(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String toString(){
        return this.name;
    }
}

