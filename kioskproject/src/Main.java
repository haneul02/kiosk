import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);

        List<MenuItem> menuItem = MenuItem.menuItem;

        while (true) {
            System.out.println(" [ 구름 돈가스 ] ");

            System.out.println("---------- 메뉴 ----------");
            for (MenuItem item : menuItem) {
                System.out.println(item);
            }

            System.out.print("원하는 메뉴 번호를 입력하세요 (종료 : 0) : ");
            try {
                int choice = sc.nextInt();

                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다");
                    break;
                }

                MenuItem selectedMenuItem = null;
                for (MenuItem item : menuItem) {
                    if (item.number == choice) {
                        selectedMenuItem = item;
                        break;
                    }
                }
                if (selectedMenuItem != null) {
                    System.out.println("선택한 메뉴 : " + selectedMenuItem.name);
                    System.out.println("가격 : " + selectedMenuItem.price);
                    System.out.println("설명 : " + selectedMenuItem.description);

                    System.out.print("추가 메뉴를 고르시겠습니까?(yes / no) : ");
                    String continueChoice = sc.next();
                    if (continueChoice.equalsIgnoreCase("no")) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    } else if (continueChoice.equalsIgnoreCase("yes")) {
                        continue;
                    } else {
                        System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
                        break;
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
