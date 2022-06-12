package FactoryMethod;

import java.util.Objects;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String entry) {

        if (Objects.equals(entry, "U"))
            return new UFOEnemyShip("UFO Enemey Ship");
        else if (Objects.equals(entry, "R"))
            return new RocketEnemyShip("Rocket Enemy Ship");
        else {
            System.out.println("Please Enter a Valid input. Valid Inputs are U/R");
            return null;
        }
    }
}
