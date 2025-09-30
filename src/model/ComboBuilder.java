package model;

public class ComboBuilder {
    private combo baseCombo;
    private String bebida;
    private String acompanamiento;
    private String extra;
    private double price;

    public ComboBuilder(combo baseCombo) {
        this.baseCombo = baseCombo;
        this.price = baseCombo.getPrice();
    }

    public ComboBuilder addBebida(String bebida, double price) {
        this.bebida = bebida;
        this.price += price;
        return this;
    }

    public ComboBuilder addAcompanamiento(String acompanamiento, double price) {
        this.acompanamiento = acompanamiento;
        this.price += price;
        return this;
    }

    public ComboBuilder addExtra(String extra, double price) {
        this.extra = extra;
        this.price += price;
        return this;
    }

    public combo build() {
        return new combo() {
            @Override
            public String getDescription() {
                return baseCombo.getDescription()
                        + ", Bebida: " + bebida
                        + ", Acompañamiento: " + acompanamiento
                        + ", Extra: " + extra;
            }

            @Override
            public double getPrice() {
                return price;
            }
        };
    }
}
