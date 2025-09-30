package main;

import controller.ComboController;
import view.ConsoleView;

public class main {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        ComboController controller = new ComboController(view);
        controller.iniciar();
    }
}

