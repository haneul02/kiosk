package Kiosk;

import Admin.Manager;
import Menu.Menu;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private Menu menu;
    private Manager manager;
    private Scanner sc;
    

    public Kiosk(Menu menu) {
        this.menu = menu;
        this.manager = new Manager();
        this.sc = new Scanner(System.in);
    }

    // 키오스크 실행
    public void start() {
        while (true) {
            System.out.println(" [ 구름 돈가스 ] ");
            System.out.println("1. Main Menu");
            System.out.println("2. Drinks");
            System.out.println("3, Desserts");
            System.out.println("4. 관리자 모드");
            System.out.println("0. 종료");
            System.out.print("번호를 선택하세요 : ");

            int choice = getValidChoice(0, 4);

            if(choice == 0){
                System.out.println("키오스크를 종료합니다.");
                break;
            }

            if(choice == 1){
                selectMenu(menu.foodMenu, "음식");
            } else if (choice == 2){
                selectMenu(menu.drinkMenu, "음료");
            } else if (choice == 3){
                selectMenu(menu.dessertMenu, "디저트");
            } else if(choice == 4){
                manager.startAdmin();
            }
        }
    }

    private void selectMenu(List<?> menuList, String category){
        System.out.println("\n[" + category + "]");
        for (Object item : menuList) {
            System.out.println(item);
        }

        System.out.println("0. 이전 메뉴로 돌아가기");
        System.out.print("선택할 번호를 입력하세요: ");

        int choice = getValidChoice(0, menuList.size());

        if (choice == 0) {
            System.out.println("메뉴 선택을 종료하고 메인 화면으로 돌아갑니다.");
            return;
        }


        Object selectedItem = menuList.get(choice - 1);
        System.out.println("\n[선택한 메뉴]");
        System.out.println(selectedItem);


        System.out.println("1. 계속 선택하기");
        System.out.println("0. 메인 메뉴로 돌아가기");
        System.out.print("\n추가로 선택하시겠습니까?");

        int nextChoice = getValidChoice(0, 1);

        if (nextChoice == 0) {
            System.out.println("메인 메뉴로 돌아갑니다.");
            return;
        }
    }

    private int getValidChoice(int min, int max){
        int choice;
        while(true){
            try{
                choice = Integer.parseInt(sc.nextLine());
                if(choice >= min && choice <= max){
                    return choice;
                }
                System.out.print("올바른 번호를 입력하세요: ");
            } catch(NumberFormatException  e){
                System.out.print("숫자로 입력하세요: ");
            }
        }
    }
}