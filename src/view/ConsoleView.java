package view;

import java.util.Scanner;
import model.combo;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        scanner = new Scanner(System.in);
    }

    // 👉 Este es el método que faltaba
    public String pedirDato(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public void mostrarCombo(combo combo) {
    System.out.println("\nResumen de tu pedido:");
    System.out.println(combo.getDescription());
    System.out.println("Precio total: S/ " + combo.getPrice());
    }

}
