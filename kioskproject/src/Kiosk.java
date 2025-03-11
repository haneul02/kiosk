import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItem; // 메뉴 목록 저장
    private Scanner sc; // 사용자 입력 받기 위한 Scanner

    // 메뉴 리스트를 받아서 초기화
    public Kiosk(List<MenuItem> menuItem) {
        this.menuItem = menuItem;
        this.sc = new Scanner(System.in);
    }

    // 키오스크 실행
    public void start() {
        while (true) {
            System.out.println(" [ 구름 돈가스 ] ");
            System.out.println("---------- 메뉴 ----------");

            // 메뉴 목록 출력
            for (MenuItem item : menuItem) {
                System.out.println(item);
            }

            MenuItem selectedMenuItem; // 사용자가 선택한 메뉴 저장 변수

            while (true) {
                int choice = getValidMenuChoice(); // 올바른 숫자 입력 받기

                if (choice == 0) { // 0 입력하면 종료
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }

                selectedMenuItem = findMenuItem(choice); // 입력한 번호에 해당하는 메뉴 찾기

                if (selectedMenuItem != null) {
                    break;  // 유효한 메뉴 번호이면 멈춰!
                } else {
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요."); // 없는 번호일 경우 다시 입력 요청보내기
                }
            }

            displayMenuDetails(selectedMenuItem); // 선택한 메뉴 상세 정보 출력
            if (!askForMore()) { // 추가 주문 여부 확인
                break; // 더 주문하지 않으면 멈춰!
            }
        }
        sc.close(); // Scanner 닫기
    }

    // 유효한 메뉴 선택 번호를 반환
    private int getValidMenuChoice() {
        while (true) {
            System.out.print("메뉴를 선택하세요 (종료: 0): ");
            try {
                int choice = sc.nextInt(); // 정수 입력 받기
                sc.nextLine(); // 입력 버퍼 비우기
                return choice;
            } catch (Exception e) { // 숫자가 아닌 값을 입력했을 경우 예외 처리
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                sc.nextLine(); // 잘못된 입력 버퍼 비우기
            }
        }
    }

    // 입력된 번호에 해당하는 메뉴 반환
    private MenuItem findMenuItem(int choice) {
        for (MenuItem item : menuItem) {
            if (item.number == choice) {
                return item; // 입력된 번호와 일치하는 메뉴 메뉴 반환
            }
        }
        return null; // 일치하는 메뉴가 없으면 null 반환
    }

    // 선택한 메뉴 상세 정보 출력
    private void displayMenuDetails(MenuItem menuItem) {
        System.out.println("\n선택한 메뉴 : " + menuItem.name);
        System.out.println("가격 : " + menuItem.price);
        System.out.println("설명 : " + menuItem.description);
    }

    // 메뉴 추가 주문 여부 확인
    private boolean askForMore() {
        while (true) {
            System.out.print("\n추가 메뉴를 고르시겠습니까? (yes / no) : ");
            String choice = sc.next().toLowerCase(); // 입력값을 소문자로 변환
            sc.nextLine(); // 입력 버퍼 비우기

            if (choice.equals("no")) {
                System.out.println("프로그램을 종료합니다.");
                return false; // 추가 주문하지 않으면 false 반환해서 종료
            } else if (choice.equals("yes")) {
                return true; // 추가 주문하면 true 반화해서 계속 진행
            } else {
                System.out.println("잘못된 입력입니다. 'yes' 또는 'no'를 입력해주세요.");
            }
        }
    }
}
