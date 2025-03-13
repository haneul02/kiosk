package Menu;

import java.util.ArrayList;
import java.util.List;

public class Desserts {
    // 디저트 리스트에 저장하는 변수
    public static List<Desserts> desserts = new ArrayList<>();

    // 디저트 항목 속성
    public int number;          // 메뉴 번호
    public String name;         // 메뉴 이름
    public double price;        // 가격
    public String description;  // 메뉴 설명

    // MenuItem : 필요한 값들을 초기화하는 역할
    // 매개변수(입력값)으로 받은 데이터를 this 키워드를 사용해 객체의 필드(속성)에 저장
    // this.number = 객체의 속성, number = 매개변수
    public Desserts(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }


    // 디저트 목록을 menuItem 리스트에 추가
    static{
        desserts.add(new Desserts(1, "슈", 4.0));
        desserts.add(new Desserts(2, "바닐라 아스크림", 4.0));
        desserts.add(new Desserts(3, "초콜릿 아스크림", 4.0));
        desserts.add(new Desserts(4, "치즈 케이크", 4.0));
        desserts.add(new Desserts(5, "초콜릿 케이크", 4.0));
    }

    // 번호. 메뉴이름 | 가격 형식으로 출력
    @Override
    public String toString(){
        return number + ". " + name + " | " + price;
    }
}
