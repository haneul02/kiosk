package Menu;

import java.util.ArrayList;
import java.util.List;

public class Drink {

    // 음료 리스트에 저장하는 변수
    public static List<Drink> drink = new ArrayList<>();

    // 음료 항목 속성
    public int number;          // 메뉴 번호
    public String name;         // 메뉴 이름
    public double price;        // 가격
    public String description;  // 메뉴 설명

    // MenuItem : 필요한 값들을 초기화하는 역할
    // 매개변수(입력값)으로 받은 데이터를 this 키워드를 사용해 객체의 필드(속성)에 저장
    // this.number = 객체의 속성, number = 매개변수
    public Drink(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }


    // 음료 목록을 menuItem 리스트에 추가
    static{
        drink.add(new Drink(1, "코카콜라", 2.0));
        drink.add(new Drink(2, "사이다", 2.0));
        drink.add(new Drink(3, "제로 콜라", 2.0));
        drink.add(new Drink(4, "제로사이다", 2.0));
        drink.add(new Drink(5, "오렌지 주스", 2.0));
        drink.add(new Drink(6, "오렌지 환타", 2.0));
        drink.add(new Drink(7, "포도 환타", 2.0));
  }

    // 번호. 메뉴이름 | 가격 형식으로 출력
    @Override
    public String toString(){
        return number + ". " + name + " | " + price;
    }
}
