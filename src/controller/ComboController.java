package controller;

import model.combo;
import model.ComboBuilder;
import model.ComboFactory;
import view.ConsoleView;

public class ComboController {
    private ConsoleView view;

    public ComboController(ConsoleView view) {
        this.view = view;
    }

    public void iniciar() {
        String tipo = view.pedirDato("Ingrese el tipo de combo (hamburguesa, pollo, vegetariano): ");
        combo comboBase = ComboFactory.crearCombo(tipo);

        ComboBuilder builder = new ComboBuilder(comboBase);
        builder.addBebida(view.pedirDato("Ingrese la bebida: "), 2.0)
       .addAcompanamiento(view.pedirDato("Ingrese el acompañamiento: "), 3.0)
       .addExtra(view.pedirDato("Ingrese un extra (o presione Enter para ninguno): "), 1.5);


        combo comboFinal = builder.build();
        view.mostrarCombo(comboFinal);
    }
}

