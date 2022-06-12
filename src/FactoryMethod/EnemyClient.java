package FactoryMethod;

import java.util.Scanner;

public class EnemyClient {

    public static void main(String[] args) {
        System.out.println("Enter type of ship: U/R");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        EnemyShipFactory factory = new EnemyShipFactory();
        var ship = factory.makeEnemyShip(name);

        if (ship != null) {
            System.out.println(ship.name + " attacks with its full power and does Damage: " + ship.amtDamage);
        }

    }
}
