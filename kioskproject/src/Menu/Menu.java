package Menu;

import java.util.List;

public class Menu {
    public List<MenuItem> foodMenu = MenuItem.menuItemList;
    public List<Drink> drinkMenu = Drink.drink;
    public List<Desserts> dessertMenu = Desserts.desserts;

    public void showAllMenu(){
        System.out.println("\n Main Menu");
        for(MenuItem item : foodMenu){
            System.out.println(item);
        }

        System.out.println("\n Drinks");
        for(Drink drink : drinkMenu){
            System.out.println(drink);
        }

        System.out.println("\n Desserts");
        for(Desserts dessert : dessertMenu){
            System.out.println(dessert);
        }
    }
}


