package Admin;

import Menu.MenuItem;
import java.util.List;
import java.util.Scanner;

public class Manager {
    private Scanner sc = new Scanner(System.in);

    public void startAdmin() {
        if (!Login.login()) return; // 관리자 인증

        while (true) {
            System.out.println("\n[ 관리자 모드 ]");
            System.out.println("1. 메뉴 가격 변경");
            System.out.println("2. 메뉴 설명 변경");
            System.out.println("3. 새 메뉴 추가");
            System.out.println("0. 관리자 모드 종료");
            System.out.print("번호를 선택하세요: ");

            int choice = getValidChoice(0, 3);
            if (choice == 0) {
                System.out.println("관리자 모드를 종료합니다.");
                break;
            }
            switch (choice) {
                case 1 -> updateMenuPrice();
                case 2 -> updateMenuDescription();
                case 3 -> addNewMenuItem();
            }
        }
    }

    private void updateMenuPrice() {
        List<MenuItem> menuList = MenuItem.getMenuItemList();
        System.out.print("가격을 변경할 메뉴 번호를 입력하세요: ");
        int menuNumber = getValidChoice(1, menuList.size());

        System.out.print("새로운 가격을 입력하세요: ");
        double newPrice = sc.nextDouble();
        sc.nextLine(); // 개행 문자 제거

        for (MenuItem item : menuList) {
            if (item.getNumber() == menuNumber) {
                item.setPrice(newPrice);
                System.out.println(item.getName() + "의 가격이 " + newPrice + "원으로 변경되었습니다.");
                return;
            }
        }
        System.out.println("해당 메뉴 번호를 찾을 수 없습니다.");
    }

    private void updateMenuDescription() {
        List<MenuItem> menuList = MenuItem.getMenuItemList();
        System.out.print("설명을 변경할 메뉴 번호를 입력하세요: ");
        int menuNumber = getValidChoice(1, menuList.size());

        System.out.print("새로운 설명을 입력하세요: ");
        sc.nextLine();
        String newDescription = sc.nextLine();

        for (MenuItem item : menuList) {
            if (item.getNumber() == menuNumber) {
                item.setDescription(newDescription);
                System.out.println(item.getName() + "의 설명이 변경되었습니다.");
                return;
            }
        }
        System.out.println("해당 메뉴 번호를 찾을 수 없습니다.");
    }

    private void addNewMenuItem() {
        System.out.print("새로운 메뉴 번호를 입력하세요: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("새로운 메뉴 이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("새로운 메뉴 가격을 입력하세요: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("새로운 메뉴 설명을 입력하세요: ");
        String description = sc.nextLine();

        MenuItem newItem = new MenuItem(number, name, price, description);
        MenuItem.getMenuItemList().add(newItem);
        System.out.println(name + " 메뉴가 추가되었습니다.");
    }

    private int getValidChoice(int min, int max) {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= min && choice <= max) break;
            } catch (NumberFormatException e) {
                System.out.print("올바른 숫자를 입력하세요: ");
            }
        }
        return choice;
    }
}
