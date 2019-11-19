package restaurant;

import java.util.ArrayList;
import java.util.Objects;

public class Menu {

    public ArrayList<MenuItem> menuItems = new ArrayList<>();

    public void addItem(MenuItem menuItem) {
            if (!menuItems.contains(menuItem)) {
                this.menuItems.add(menuItem);
            }
        }

    public void removeMenuItems(int item) {
        menuItems.remove(item);
    }

    public void printMenuItem(int item){
        System.out.println("       ****       ");
        System.out.println(menuItems.get(item).getName() + "   $" +  menuItems.get(item).getPrice());
        System.out.println("       ****       " + "\n");
    }

    public void printMenu(){
        System.out.println("*" + MenuItem.getMenuName() + "*");
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(menuItems.get(i).getName() +  "   $" +  menuItems.get(i).getPrice());
        }
        System.out.println("     *********     " + "\n");
    }

    @Override
    public String toString() {
        return "Menu{" +
                menuItems +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Menu)) return false;
        Menu menu = (Menu) o;
        return Objects.equals(menuItems, menu.menuItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuItems);
    }
}