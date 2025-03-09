
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {

    private static Map<Integer, Map<String, Object>> menu = new HashMap<>();

    public static void addMenu(int number, String name, double price, String description){
        Map<String, Object> item = new HashMap<>();
        item.put("name", name);
        item.put("price", price);
        item.put("description", description);
        menu.put(number, item);
    }

    public static void printMenu(){
        System.out.println("---------- 메뉴 ----------");
        for(Map.Entry<Integer, Map<String, Object>> entry : menu.entrySet()){
            int number = entry.getKey();
            Map<String, Object> item = entry.getValue();
            String name = (String) item.get("name");
            double price = (double) item.get("price");
            String description = (String) item.get("description");
            System.out.println(number + ". " + name + " | " + price + " | " + description);
        }
    }
    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);

        addMenu(1, "경양식 돈가스", 9.5, "옛날 경양식 소스가 뿌려진 돈가스");
        addMenu(2, "달콤하와이 돈가스", 10.5, "달콤한 소스와 파인애플이 올라간 돈가스");
        addMenu(3, "반반 돈가스(하와이 + 매콤이", 11.0, "달콤한 하와이 돈가스와 매콤한 돈가스에 만남");
        addMenu(4, "고구마매콤 돈가스", 10.5, "매콤 돈가스 위에 달달구리한 고구마 무스가 올라갔다.");
        addMenu(5, "치즈 돈가스", 11.0, "돈가스에 치즈가 듬뿜 들어있어요.");
        addMenu(6, "매콤고구마치즈 돈가스", 12.0, "치즈 돈가스에 매콤소스를 뿌려 그위에 달달구리한 고구마 무스를 올렸다.");
        addMenu(7, "함박스테이크", 10.5, "함박스테이크위에 계란 후라이를 얹어 드려요");
        addMenu(8, "생선가스", 11.0, "부드러운 생선가스 위에 타르타르소스가 올라갔습니당. ");

        while (true) {
            System.out.println(" [ 구름 돈가스  ] ");
            printMenu();

            System.out.print("원하는 메뉴 번호를 입력하세요 (종료 : 0) : ");
            try {
                int choice = sc.nextInt();

                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다");
                    break;
                } else if (menu.containsKey(choice)) {
                    Map<String, Object> selectedMenu = menu.get(choice);
                    String name = (String) selectedMenu.get("name");
                    double price = (double) selectedMenu.get("price");
                    String description = (String) selectedMenu.get("description");

                    System.out.println("선택한 메뉴 : " + name);
                    System.out.println("가격 : " + price);
                    System.out.println("설명 : " + description);

                    System.out.print("추가 메뉴를 고르시겠습니까?(yes / no) : ");
                    String continueChoice = sc.next();
                    if (continueChoice.equalsIgnoreCase("no")) {
                        System.out.println("프로그램을 종료합니다.");
                        break;  // 종료
                    } else if (continueChoice.equalsIgnoreCase("yes")) {
                        // "yes"를 선택하면 메뉴를 다시 보여주기 위해 반복
                        continue;
                    } else {
                        System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
                        break;  // 잘못된 입력은 종료
                    }

                } else {
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                }
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
