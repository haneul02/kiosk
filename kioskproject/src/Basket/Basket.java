package Basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Object> items;

    public Basket(){
        this.items = new ArrayList<>();
    }

    // 장바구니 추가
    public void addItem(Object item){
        items.add(item);
        System.out.println("장바구니에 추가 완료\n " + item);
    }

    // 장바구니 목록
    public void showBasket(){
        if (items.isEmpty()){
            System.out.println("장바구니가 비어있습니다.");
            return;
        }
        System.out.println("\n [ 장바구니 목록 ]");
        for (Object item : items){
            System.out.println(item);
        }
        System.out.println("총 금액 : " + getTotalPrice() + "원");
    }

    // 장바구니 총합
    public double getTotalPrice(){
        double total = 0;
        for(Object item : items){
            if(item instanceof Menu.MenuItem){
                total += ((Menu.MenuItem) item).getPrice(();
            } else if(item instanceof Menu.Drink){
                total += ((Menu.Drink) item).price;
            } else if(item instanceof Menu.Desserts){
                total += ((Menu.Desserts) item).price;
            }
        }
        return total;
    }

    public void clearBasket(){
        items.clear();
        System.out.println("장바구니가 비워졌습니다.");
    }

}
