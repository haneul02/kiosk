package Main;

import Kiosk.Kiosk;
import Menu.Menu;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Kiosk Kiosk = new Kiosk(menu);
        Kiosk.start();
    }
}