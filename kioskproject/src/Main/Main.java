package Main;

import Menu.Menu;
import Kiosk.Kiosk;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Kiosk Kiosk = new Kiosk(menu);
        Kiosk.start();
    }
}