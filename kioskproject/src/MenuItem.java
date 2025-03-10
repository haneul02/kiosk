import java.util.ArrayList;
import java.util.List;

public class MenuItem {

    public static List<MenuItem> menuItem = new ArrayList<>();

    public int number;
    public String name;
    public double price;
    public String description;

    public MenuItem(int number, String name, double price, String description){
        this.number = number;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    static{
        menuItem.add(new MenuItem(1, "경양식 돈가스", 9.5, "옛날 경양식 소스가 뿌려진 돈가스"));
        menuItem.add(new MenuItem(2, "달콤하와이 돈가스", 10.5, "달콤한 소스와 파인애플이 올라간 돈가스"));
        menuItem.add(new MenuItem(3, "반반 돈가스(하와이 + 매콤이", 11.0, "달콤한 하와이 돈가스와 매콤한 돈가스에 만남"));
        menuItem.add(new MenuItem(4, "고구마매콤 돈가스", 10.5, "매콤 돈가스 위에 달달구리한 고구마 무스가 올라갔다."));
        menuItem.add(new MenuItem(5, "치즈 돈가스", 11.0, "돈가스에 치즈가 듬뿜 들어있어요."));
        menuItem.add(new MenuItem(6, "매콤고구마치즈 돈가스", 12.0, "치즈 돈가스에 매콤소스를 뿌려 그위에 달달구리한 고구마 무스를 올렸다."));
        menuItem.add(new MenuItem(7, "함박스테이크", 10.5, "함박스테이크위에 계란 후라이를 얹어 드려요"));
        menuItem.add(new MenuItem(8, "생선가스", 11.0, "부드러운 생선가스 위에 타르타르소스가 올라갔습니당."));

    }

    @Override
    public String toString(){
        return number + ". " + name + " | " + price + " | " + description;
    }
}

