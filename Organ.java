package organ;

import armor.Armor;
import interfaces.Damageable;

import java.text.DecimalFormat;

public abstract class Organ implements Damageable {
    protected double hp;
    protected Armor armor;

    public Organ(double hp, Armor armor) {
        this.hp = hp;
        this.armor = armor;
    }

    public double getHp() {
        if (hp>=0){
            return hp;
        }else {
            return 0;
        }
    }

    public Armor getArmor() {
        return armor;
    }

    @Override
    public boolean takeDamage(double force) {
        if (armor.getDurability() >= 0) {
            hp -= force / armor.getK();
            hp =Double.parseDouble(new DecimalFormat("##.##").format(hp));
            armor.takeDamage(force);
        } else {
            hp -= force;
        }
        return hp >= 0;
    }

    private double calcResist(double x) {
        return -1;
    }
}