package Admin;

import java.util.Scanner;

public class Login {
    private static final String PASSWORD = "ha02";

    public static boolean login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("관리자 비밀번호를 입력하세요 : ");
        String inputPassword = sc.nextLine();

        if(inputPassword.equals(PASSWORD)){
            System.out.println("관리자 모드 접속");
            return true;
        } else {
            System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요.");
            return false;
        }
    }
}
