package com.foodDeliverySystem.designPatterns;
public class RestaurantMenu {
    /**
     * This class implements the Singleton Design Pattern
     * 1. Create a static variable called staticObject - meaning, every instance that you create for this class, the static members remain constant
     * 2. Above variable is marked as volatile as well - ensures that multiple threads offer the obj variable correctly
     * 3. Make the constructor private so that this class cannot be instantiated and forces the caller to use the getInstance() method to get the menu
     * 4. Create a method called getInstance() - this should essentially return the menu
     *      1. Idea is that the object should be created only when its null. if the object is not null, same instance will be returned.
     *      2. Add synchronized to make sure that only one thread can instantiate the object when it is null
     *      3. return the object
     * 5. Create a method called showMessage() - just to verify that the instance is created
     */
    private static volatile RestaurantMenu singletonMenu = null;
    private RestaurantMenu(){}

    public static RestaurantMenu getInstance(){
        if (singletonMenu == null) {
            synchronized (RestaurantMenu.class)
            {
                // check again as multiple threads can reach above step
                if (singletonMenu==null)
                    singletonMenu = new RestaurantMenu();
            }
        }
        return singletonMenu;
    }

    public void showMessage(){
        System.out.println("Hurray.... SingletonPattern Implemented!");
    }
}
