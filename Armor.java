package armor;

import interfaces.Damageable;

import java.text.DecimalFormat;

public abstract class Armor implements Damageable {
    protected double durability;
    protected double k;

    public Armor(double durability, double k) {
        this.durability = durability;
        this.k = k;
    }

    public double getDurability() {
        if (durability <= 0) {
            return 0;
        } else {
            return durability;
        }

    }

    public double getK() {
        return k;
    }

    @Override
    public boolean takeDamage(double force) {
        durability -= force / k;
        durability =Double.parseDouble(new DecimalFormat("##.##").format(durability));
        return durability >= 0;
    }
}
