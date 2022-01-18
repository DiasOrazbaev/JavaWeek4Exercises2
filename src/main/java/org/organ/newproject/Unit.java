/*
 *  Created by @DiasOrazbaev
 *  2022.01.18
 */
package org.organ.newproject;

/**
 *
 * @author serge
 */
public class Unit {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Unit(String name) {
        this.name = name;
    }
    
    /**
     *
     * @param direction is 
     */
    public void move(String direction) {
        System.out.println(this.getClass().getSimpleName() + " " + this.getName() + " moves to a " + direction);
    }
}
