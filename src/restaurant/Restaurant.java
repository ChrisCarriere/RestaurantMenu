package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {

        Menu menu = new Menu ();

        ArrayList<MenuItem> menuItems = new ArrayList<>();

        MenuItem menuItem1 = new MenuItem(1, "Fish Tacos", "Tacos with fish", "Entree", 7.99, new Date());
        menuItems.add(menuItem1);

        MenuItem menuItem2 = new MenuItem(2, "Chicken Tacos", "Tacos with grilled chicken", "Entree", 3.99, new Date());
        menuItems.add(menuItem2);

        MenuItem menuItem3 = new MenuItem(3, "Steak Tacos", "Tacos with steak", "Entree", 8.99, new Date());
        menuItems.add(menuItem3);

        menu.setMenuItems(menuItems);

        menu.printMenu();

        menu.printMenuItem(0);

        menu.removeMenuItems(1);

        menu.printMenu();
    }
}