package FactoryMethod;

public abstract class EnemyShip {

    public String name;
    public int amtDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage() {
        this.amtDamage = 0;
    }
}
