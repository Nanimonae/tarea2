package model;

public class BaseCombo implements combo {
    private String type;
    private double price;

    public BaseCombo(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "Combo base: " + type;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
