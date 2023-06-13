package com.foodDeliverySystem.designPatterns;
public class SingletonPattern {
    /**
     * This project is used to demonstrate Singleton Design Pattern - one of the simplest design available today.
     * Singleton Pattern restricts the instantiation of a class to singular instance. For example, when an
     * application connects to DB for data persistence, its ideal to create a Single DB connection and share it across
     * multiple objects in the application rather than creating a separate connection for every object.
     *
     * In our food delivery application, one application of Singleton pattern could be fetching a given restaurant's menu
     * Since the menu is fixed and common for all the end-users, its recommended to create a single instance of this menu and share
     * it across all the instances
     */
    public static void main(String[] args) {

        //variables inside the RestaurantMenu class are static in nature and hence there is no need to instantiate the class to access the variable
        // use the getInstance to access the object/RestaurantMenu
        RestaurantMenu object = RestaurantMenu.getInstance();

        //Calling the showMessage method to verify the object instantiation
        object.showMessage();
    }
}