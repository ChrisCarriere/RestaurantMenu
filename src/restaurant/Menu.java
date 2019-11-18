package restaurant;

import java.util.Date;

import java.util.ArrayList;

public class Menu {

    public ArrayList<MenuItem> menuItems;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void removeMenuItems(int item) {
        menuItems.remove(item);
    }

    public void printMenuItem(int item){
        System.out.println("***");
        System.out.println(menuItems.get(item).getName() + "   $" +  menuItems.get(item).getPrice());
        System.out.println("***");
    }

    public void printMenu(){
        System.out.println("*Chris's Taco Shack*");
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(menuItems.get(i).getName() +  "   $" +  menuItems.get(i).getPrice());
        }
        System.out.println("     *********     ");
    }

    @Override
    public String toString() {
        return "Menu{" +
                menuItems +
                '}';
    }
}