package model;

public class ComboFactory {
    public static BaseCombo crearCombo(String type) {
        switch (type.toLowerCase()) {
            case "hamburguesa":
                return new BaseCombo("Hamburguesa", 15.0);
            case "pollo":
                return new BaseCombo("Pollo", 13.0);
            case "vegetariano":
                return new BaseCombo("Vegetariano", 12.0);
            default:
                throw new IllegalArgumentException("Tipo de combo no válido");
        }
    }
}
