package Menu;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

    // 메뉴 리스트에 저장하는 변수
    public static List<MenuItem> menuItemList = new ArrayList<>();

    // 메뉴 항목 속성
    public int number;          // 메뉴 번호
    public String name;         // 메뉴 이름
    public double price;        // 가격
    public String description;  // 메뉴 설명

    // MenuItem : 필요한 값들을 초기화하는 역할
    // 매개변수(입력값)으로 받은 데이터를 this 키워드를 사용해 객체의 필드(속성)에 저장
    // this.number = 객체의 속성, number = 매개변수
    public MenuItem(int number, String name, double price, String description){
        this.number = number;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public static List<MenuItem> getMenuItemList(){
        return menuItemList;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }


    // 메뉴 목록을 menuItem 리스트에 추가
    static{
        menuItemList.add(new MenuItem(1, "경양식 돈가스", 9.5, "옛날 경양식 소스가 뿌려진 돈가스"));
        menuItemList.add(new MenuItem(2, "달콤하와이 돈가스", 10.5, "달콤한 소스와 파인애플이 올라간 돈가스"));
        menuItemList.add(new MenuItem(3, "반반 돈가스(하와이 + 매콤이", 11.0, "달콤한 하와이 돈가스와 매콤한 돈가스에 만남"));
        menuItemList.add(new MenuItem(4, "고구마매콤 돈가스", 10.5, "매콤 돈가스 위에 달달구리한 고구마 무스가 올라갔다."));
        menuItemList.add(new MenuItem(5, "치즈 돈가스", 11.0, "돈가스에 치즈가 듬뿜 들어있어요."));
        menuItemList.add(new MenuItem(6, "매콤고구마치즈 돈가스", 12.0, "치즈 돈가스에 매콤소스를 뿌려 그위에 달달구리한 고구마 무스를 올렸다."));
        menuItemList.add(new MenuItem(7, "함박스테이크", 10.5, "함박스테이크위에 계란 후라이를 얹어 드려요"));
        menuItemList.add(new MenuItem(8, "생선가스", 11.0, "부드러운 생선가스 위에 타르타르소스가 올라갔습니당."));
    }

    // 번호. 메뉴이름 | 가격 | 설명 형식으로 출력
    @Override
    public String toString(){
        return number + ". " + name + " | " + price + " | " + description;
    }
}

