package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {

        Menu menu = new Menu ();

        ArrayList<MenuItem> menuItems = new ArrayList<>();

        menu.addItem(new MenuItem(1, "Fish Tacos", "Tacos with fish", "Entree", 7.99, new Date()));
        menu.addItem(new MenuItem(2, "Chicken Tacos", "Tacos with grilled chicken", "Entree", 3.99, new Date()));
        menu.addItem(new MenuItem(3, "Steak Tacos", "Tacos with steak", "Entree", 8.99, new Date()));
        menu.printMenu();

        menu.addItem(new MenuItem(3, "Steak Tacos", "Tacos with steak", "Entree", 8.99, new Date()));


        menu.printMenu();

        menu.printMenuItem(0);

        menu.removeMenuItems(1);

        menu.printMenu();
    }
}