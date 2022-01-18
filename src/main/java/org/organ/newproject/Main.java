/*
 *  Created by @DiasOrazbaev
 *  2022.01.18
 */
package org.organ.newproject;

/**
 *
 * @author serge
 */
public class Main {
    public static void main(String[] args) {
        Wolf wolf = new Wolf("Bigby");
        Sheep sheep = new Sheep("Dolly");
        Shepherd shepherd = new Shepherd("John");
        
        sheep.move("farm");
        sheep.eat("grass");
        sheep.beEaten(shepherd);
        shepherd.move("Boat");
        shepherd.beEaten(wolf);
    }
}
